package mrs.domain.model;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@SuppressWarnings("serial")
@Entity
public class Reservation implements Serializable {

	@Id
	// 主キーを自動採番する
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reservationId;

	private LocalTime startTime;

	private LocalTime endTime;

	@ManyToOne
	// 多対一の関連設定と、外部キー（複合キー）を指定している
	@JoinColumns({ @JoinColumn(name = "reserved_date"), @JoinColumn(name = "room_id") })
	private ReservableRoom reservableRoom;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	/** 予約の重複チェック */
	public boolean overlap(Reservation target) {

		// ここらへんのロジックがいまいち理解できていない
		if (!Objects.equals(reservableRoom.getReservableRoomId(),
				target.reservableRoom.getReservableRoomId())) {
			return false;
		}
		if (startTime.equals(target.startTime) && endTime.equals(target.endTime)) {
			return true;
		}
		return target.endTime.isAfter(startTime) && endTime.isAfter(target.startTime);
	}

}
