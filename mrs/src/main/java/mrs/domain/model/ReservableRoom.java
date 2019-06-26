package mrs.domain.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.Data;

@Data
@SuppressWarnings("serial")
@Entity
public class ReservableRoom implements Serializable{

	@EmbeddedId
	private ReservableRoomId reservableRoomId;
	
	@ManyToOne
	@JoinColumn(name = "room_id", insertable = false, updatable = false)
	@MapsId("roomId")
	private MeetingRoom meetingRoom;
	
	public ReservableRoom(ReservableRoomId reservableRoomId) {
		
		this.reservableRoomId = reservableRoomId;
	}
	
	/**
	 * デフォルトコンストラクタがないとエラー発生する
	 * */
	public ReservableRoom() {
		
	}
}
