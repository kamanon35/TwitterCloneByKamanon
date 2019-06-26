package mrs.domain.service.reservation;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mrs.domain.model.ReservableRoom;
import mrs.domain.model.ReservableRoomId;
import mrs.domain.model.Reservation;
import mrs.domain.model.RoleName;
import mrs.domain.model.User;
import mrs.domain.repository.reservation.ReservationRepository;
import mrs.domain.repository.room.ReservableRoomRepository;

@Service
@Transactional
public class ReservationService {

	@Autowired
	ReservationRepository reservationRepository;
	@Autowired
	ReservableRoomRepository reservableRoomRepository;

	/** 検索処理の実行 */
	public List<Reservation> findReservations(ReservableRoomId reservableRoomId) {
		return reservationRepository
				.findByReservableRoom_ReservableRoomIdOrderByStartTimeAsc(
						reservableRoomId);
	}

	/**
	 * 予約処理実行メソッド
	 * 
	 * @param reservation 予約情報を格納
	 */
	public Reservation reserve(Reservation reservation) {

		ReservableRoomId reservableRoomId = reservation.getReservableRoom()
				.getReservableRoomId();
		// 対象の部屋が予約可能かどうかチェック
		// ※Springのバージョン違いによりfindOne→findByIdになり、戻り値もOptional型にラップされて戻る
		// 悲観ロックメソッドの呼び出し
		ReservableRoom reservable = reservableRoomRepository
				.findOneForUpdateByReservableRoomId(reservableRoomId);
		if (reservable == null) {
			throw new UnavailableReservationException("入力の日付・部屋の組み合わせは予約できません。");
		}
		// 予約可能かDBから値を取得してチェックしている
		boolean overlap = reservationRepository
				.findByReservableRoom_ReservableRoomIdOrderByStartTimeAsc(
						reservableRoomId)
				.stream().anyMatch(x -> x.overlap(reservation));

		if (overlap) {
			throw new AlreadyReservedException("入力の時間帯はすでに予約済みです。");
		}

		// 予約情報の登録
		reservationRepository.save(reservation);
		return reservation;

	}

	/**
	 * 予約取消処理
	 */
	public void cancel(Integer reservationId, User requestUser) {
		Optional<Reservation> reservationOp = reservationRepository
				.findById(reservationId);
		// 無駄な構文。Optionalの使い勝手が悪いのでJava9以上を導入するべき
		Reservation reservation = reservationOp.orElse(null);
		if (RoleName.ADMIN != requestUser.getRoleName() && !Objects
				.equals(reservation.getUser().getUserId(), requestUser.getUserId())) {
			throw new AccessDeniedException("要求されたキャンセルは許可できません。");
		}
		// 予約情報を渡して、DBから削除する処理
		reservationRepository.delete(reservation);
	}
}
