package mrs.domain.service.room;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mrs.domain.model.MeetingRoom;
import mrs.domain.model.ReservableRoom;
import mrs.domain.repository.room.MeetingRoomRepository;
import mrs.domain.repository.room.ReservableRoomRepository;

@Service
@Transactional
public class RoomService {

	@Autowired
	ReservableRoomRepository reservableRoomRepository;

	@Autowired
	MeetingRoomRepository meetingRoomRepository;

	/**
	 * 予約可能な会議室の一覧を取得するメソッド
	 * 
	 * @param date
	 * @return
	 */
	public List<ReservableRoom> findReservableRooms(LocalDate date) {
		return reservableRoomRepository
				.findByReservableRoomId_reservedDateOrderByReservableRoomId_roomIdAsc(
						date);
	}

	/**
	 * 会議室情報を取得する findById使用時、Optional型を返却しないように注意する必要がある
	 */
	public MeetingRoom findMeetingRoom(Integer roomId) {

		Optional<MeetingRoom> meetingRoomOp = meetingRoomRepository.findById(roomId);
		if (meetingRoomOp.isPresent()) {
			return meetingRoomOp.get();
		}
		return null;
	}
}
