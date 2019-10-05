public class ClsTicket 
{
//
//	  create table tblticket
//	(
//	ID                   Number(10),
//	MOVIEID            NUMBER(5) NOT NULL ,
//	TICKETID             NUMBER(5),
//	UNM                  VARCHAR(30),
//	MOB                   VARCHAR(20),
//	EMAILID                VARCHAR(30),
//	PLATINUMSEATS          NUMBER(8),
//	GOLDSEATS              NUMBER(8),    
//	SILVERSEATS             NUMBER(8) ,
//	PLATINUMSEATSBOOKED          VARCHAR(300),
//	GOLDSEATSBOOKED          VARCHAR(250) ,
//	SILVERSEATSBOOKED          VARCHAR(200) ,
//	DATEOFSHOW                   VARCHAR(50),
//	SLOT                     VARCHAR(10),
//	TOTALPRICE                VARCHAR(20)
//	);
	
	String strId,strMovieId,strTicketId,strUnm,strMob,strEmailId,strPlatinumSeats,strGoldSeats,strSilverSeats,strPlatinumSeatsBooked,strGoldSeatsBooked;
	String strSilverSeatBooked,strDateOfShow,strSlot,strTotalPrice;
	@Override
	public String toString() {
		return "ClsTicket [strId=" + strId + ", strMovieId=" + strMovieId
				+ ", strTicketId=" + strTicketId + ", strUnm=" + strUnm
				+ ", strMob=" + strMob + ", strEmailId=" + strEmailId
				+ ", strPlatinumSeats=" + strPlatinumSeats + ", strGoldSeats="
				+ strGoldSeats + ", strSilverSeats=" + strSilverSeats
				+ ", strPlatinumSeatsBooked=" + strPlatinumSeatsBooked
				+ ", strGoldSeatsBooked=" + strGoldSeatsBooked
				+ ", strSilverSeatBooked=" + strSilverSeatBooked
				+ ", strDateOfShow=" + strDateOfShow + ", strSlot=" + strSlot
				+ ", strTotalPrice=" + strTotalPrice + "]";
	}
	public ClsTicket(String strId, String strMovieId, String strTicketId,
			String strUnm, String strMob, String strEmailId,
			String strPlatinumSeats, String strGoldSeats,
			String strSilverSeats, String strPlatinumSeatsBooked,
			String strGoldSeatsBooked, String strSilverSeatBooked,
			String strDateOfShow, String strSlot, String strTotalPrice) {
		super();
		this.strId = strId;
		this.strMovieId = strMovieId;
		this.strTicketId = strTicketId;
		this.strUnm = strUnm;
		this.strMob = strMob;
		this.strEmailId = strEmailId;
		this.strPlatinumSeats = strPlatinumSeats;
		this.strGoldSeats = strGoldSeats;
		this.strSilverSeats = strSilverSeats;
		this.strPlatinumSeatsBooked = strPlatinumSeatsBooked;
		this.strGoldSeatsBooked = strGoldSeatsBooked;
		this.strSilverSeatBooked = strSilverSeatBooked;
		this.strDateOfShow = strDateOfShow;
		this.strSlot = strSlot;
		this.strTotalPrice = strTotalPrice;
	}
	public String getStrId() {
		return strId;
	}
	public void setStrId(String strId) {
		this.strId = strId;
	}
	public String getStrMovieId() {
		return strMovieId;
	}
	public void setStrMovieId(String strMovieId) {
		this.strMovieId = strMovieId;
	}
	public String getStrTicketId() {
		return strTicketId;
	}
	public void setStrTicketId(String strTicketId) {
		this.strTicketId = strTicketId;
	}
	public String getStrUnm() {
		return strUnm;
	}
	public void setStrUnm(String strUnm) {
		this.strUnm = strUnm;
	}
	public String getStrMob() {
		return strMob;
	}
	public void setStrMob(String strMob) {
		this.strMob = strMob;
	}
	public String getStrEmailId() {
		return strEmailId;
	}
	public void setStrEmailId(String strEmailId) {
		this.strEmailId = strEmailId;
	}
	public String getStrPlatinumSeats() {
		return strPlatinumSeats;
	}
	public void setStrPlatinumSeats(String strPlatinumSeats) {
		this.strPlatinumSeats = strPlatinumSeats;
	}
	public String getStrGoldSeats() {
		return strGoldSeats;
	}
	public void setStrGoldSeats(String strGoldSeats) {
		this.strGoldSeats = strGoldSeats;
	}
	public String getStrSilverSeats() {
		return strSilverSeats;
	}
	public void setStrSilverSeats(String strSilverSeats) {
		this.strSilverSeats = strSilverSeats;
	}
	public String getStrPlatinumSeatsBooked() {
		return strPlatinumSeatsBooked;
	}
	public void setStrPlatinumSeatsBooked(String strPlatinumSeatsBooked) {
		this.strPlatinumSeatsBooked = strPlatinumSeatsBooked;
	}
	public String getStrGoldSeatsBooked() {
		return strGoldSeatsBooked;
	}
	public void setStrGoldSeatsBooked(String strGoldSeatsBooked) {
		this.strGoldSeatsBooked = strGoldSeatsBooked;
	}
	public String getStrSilverSeatBooked() {
		return strSilverSeatBooked;
	}
	public void setStrSilverSeatBooked(String strSilverSeatBooked) {
		this.strSilverSeatBooked = strSilverSeatBooked;
	}
	public String getStrDateOfShow() {
		return strDateOfShow;
	}
	public void setStrDateOfShow(String strDateOfShow) {
		this.strDateOfShow = strDateOfShow;
	}
	public String getStrSlot() {
		return strSlot;
	}
	public void setStrSlot(String strSlot) {
		this.strSlot = strSlot;
	}
	public String getStrTotalPrice() {
		return strTotalPrice;
	}
	public void setStrTotalPrice(String strTotalPrice) {
		this.strTotalPrice = strTotalPrice;
	}
	public ClsTicket()
	{
		
	}

	
}
