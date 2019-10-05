public class ClsSeatsBooked 
{
//	create table tblseatsbooked
//	(
//	ID                   Number(10),  1
//	MOVIEID            NUMBER(5) NOT NULL , 1
//	PLATINUMSEATS           NUMBER(8), 100
//	GOLDSEATS               NUMBER(8),     100
//	SILVERSEATS             NUMBER(8) ,100
//	PLATINUMSEATSBOOKED     VARCHAR(300), ""
//	GOLDSEATSBOOKED         VARCHAR(250) ,""
//	SILVERSEATSBOOKED       VARCHAR(200) ,""
//	DATEOFSHOW              VARCHAR(50),
//	PLATINUMAVAILSEATS      NUMBER(8),100
//	GOLDAVAILSEATS          NUMBER(8), 100
//	SILVERAVAILSEATS        NUMBER(8),100
//	SLOTOFSHOW              VARCHAR(10)912
//	);
	
	String strID,strMovieID, strPlatinumSeats, strGoldSeats,strSilverSeats,
	 strPlatinumSeatsbooked, strGoldSeatsbooked, strSilverSeatsbooked,strDateOfShow,
	strPlatinumAvailSeats, strGoldAvailSeats,strSilverAvailSeats, strSlotOfShow;

	
	
	
	@Override
	public String toString() {
		return "ClsSeatsBooked [strID=" + strID + ", strMovieID=" + strMovieID
				+ ", strPlatinumSeats=" + strPlatinumSeats + ", strGoldSeats="
				+ strGoldSeats + ", strSilverSeats=" + strSilverSeats
				+ ", strPlatinumSeatsbooked=" + strPlatinumSeatsbooked
				+ ", strGoldSeatsbooked=" + strGoldSeatsbooked
				+ ", strSilverSeatsbooked=" + strSilverSeatsbooked
				+ ", strDateOfShow=" + strDateOfShow
				+ ", strPlatinumAvailSeats=" + strPlatinumAvailSeats
				+ ", strGoldAvailSeats=" + strGoldAvailSeats
				+ ", strSilverAvailSeats=" + strSilverAvailSeats
				+ ", strSlotOfShow=" + strSlotOfShow + "]";
	}



	public ClsSeatsBooked(String strID, String strMovieID, String strPlatinumSeats,
		String strGoldSeats, String strSilverSeats,
		String strPlatinumSeatsbooked, String strGoldSeatsbooked,
		String strSilverSeatsbooked, String strDateOfShow,
		String strPlatinumAvailSeats, String strGoldAvailSeats,
		String strSilverAvailSeats, String strSlotOfShow) {
	super();
	this.strID = strID;
	this.strMovieID = strMovieID;
	this.strPlatinumSeats = strPlatinumSeats;
	this.strGoldSeats = strGoldSeats;
	this.strSilverSeats = strSilverSeats;
	this.strPlatinumSeatsbooked = strPlatinumSeatsbooked;
	this.strGoldSeatsbooked = strGoldSeatsbooked;
	this.strSilverSeatsbooked = strSilverSeatsbooked;
	this.strDateOfShow = strDateOfShow;
	this.strPlatinumAvailSeats = strPlatinumAvailSeats;
	this.strGoldAvailSeats = strGoldAvailSeats;
	this.strSilverAvailSeats = strSilverAvailSeats;
	this.strSlotOfShow = strSlotOfShow;
}



	public ClsSeatsBooked()
	{
		
	}
	
	
	
	public String getStrID() {
		return strID;
	}

	public void setStrID(String strID) {
		this.strID = strID;
	}

	public String getStrMovieID() {
		return strMovieID;
	}

	public void setStrMovieID(String strMovieID) {
		this.strMovieID = strMovieID;
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

	public String getStrPlatinumSeatsbooked() {
		return strPlatinumSeatsbooked;
	}

	public void setStrPlatinumSeatsbooked(String strPlatinumSeatsbooked) {
		this.strPlatinumSeatsbooked = strPlatinumSeatsbooked;
	}

	public String getStrGoldSeatsbooked() {
		return strGoldSeatsbooked;
	}

	public void setStrGoldSeatsbooked(String strGoldSeatsbooked) {
		this.strGoldSeatsbooked = strGoldSeatsbooked;
	}

	public String getStrSilverSeatsbooked() {
		return strSilverSeatsbooked;
	}

	public void setStrSilverSeatsbooked(String strSilverSeatsbooked) {
		this.strSilverSeatsbooked = strSilverSeatsbooked;
	}

	public String getStrDateOfShow() {
		return strDateOfShow;
	}

	public void setStrDateOfShow(String strDateOfShow) {
		this.strDateOfShow = strDateOfShow;
	}

	public String getStrPlatinumAvailSeats() {
		return strPlatinumAvailSeats;
	}

	public void setStrPlatinumAvailSeats(String strPlatinumAvailSeats) {
		this.strPlatinumAvailSeats = strPlatinumAvailSeats;
	}

	public String getStrGoldAvailSeats() {
		return strGoldAvailSeats;
	}

	public void setStrGoldAvailSeats(String strGoldAvailSeats) {
		this.strGoldAvailSeats = strGoldAvailSeats;
	}

	public String getStrSilverAvailSeats() {
		return strSilverAvailSeats;
	}

	public void setStrSilverAvailSeats(String strSilverAvailSeats) {
		this.strSilverAvailSeats = strSilverAvailSeats;
	}

	public String getStrSlotOfShow() {
		return strSlotOfShow;
	}

	public void setStrSlotOfShow(String strSlotOfShow) {
		this.strSlotOfShow = strSlotOfShow;
	}
	
	
}
