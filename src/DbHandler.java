import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import oracle.jdbc.pool.OracleDataSource;


public class DBHandler {
	public Connection getDBCon()
	{
		Connection con=null;
		try{
			OracleDataSource ods=new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			con=ods.getConnection("icsd","icsd");
			System.out.println("Connection is established with database");
			
	}
		catch(SQLException se)
		{
			System.out.println(se.getMessage());
		}
		return con;
}

	public void insertIntotblNewMovies(String strMovieID,String strMovieName,String strStars,String strStartDate,
			String strEndDate,String strSlot912,String strSlot1215,String strSlot1518,String strSlot1821,String strPlatinumPrice,String strGoldPrice,String strSilverPrice,String strImageName)
		// TODO Auto-generated method stub
	{
		System.out.println("5555555555555555555555555555555555");
	Connection con=null;
	try{
		OracleDataSource ods=new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
		con=ods.getConnection("icsd","icsd");
		System.out.println(strStartDate+" st date ");
		System.out.println("connection is established with database");
		
		PreparedStatement stmt=con.prepareStatement("insert into tblNewMovies values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
		stmt.setString(1,strMovieID);
		stmt.setString(2,strMovieName);
		stmt.setString(3,strStars);
		stmt.setString(4,strStartDate);
		stmt.setString(5,strEndDate);
		stmt.setString(6,strSlot912);
		stmt.setString(7,strSlot1215);
		stmt.setString(8,strSlot1518);
		stmt.setString(9,strSlot1821);
		stmt.setString(10,strPlatinumPrice);
		stmt.setString(11,strGoldPrice);
		stmt.setString(12,strSilverPrice);
		stmt.setString(13,strImageName);
	
		stmt.executeUpdate();
		
		con.close();
		System.out.println("data inserted..........");
	}
	catch(SQLException e){
		e.printStackTrace();
	}

}
	
	public void deleteFromtblNewMoviesbyMovieID(String strMovieID)
	{
		try{
			Connection con=null;
			con=getDBCon();
			PreparedStatement stmt=con.prepareStatement("delete from tblNewMovies where MovieID=?");
			stmt.setString(1, strMovieID);
			stmt.executeUpdate();
			con.close();
			System.out.println("data deleted");
		}catch(SQLException e){
			
			e.printStackTrace();
		}
	}
					

	public void updateIntotblNewMoviesbyMovieID(String strMovieID,String strMovieName,String strStars,String strStartDate,String strEndDate,String strSlot912,String strSlot1215,String strSlot1518,String strSlot1821,String strPlatinumPrice,String strGoldPrice,String strSilverPrice,String strImageName)
	{
		try{
			Connection con=null;
			con=getDBCon();
			System.out.println(strStartDate+" st date ");
			PreparedStatement stmt=con.prepareStatement("update tblNewMovies set MovieID=?,MovieName=?,Stars=?,StartDate=?,EndDate=?,Slot912,Slot1215,Slot1518,Slot1821,PlatinumPrice=? ,GoldPrice=?,SilverPrice=?,ImageName=? where MovieID=?");
			stmt.setString(1,strMovieID);
			stmt.setString(2,strMovieName);
			stmt.setString(3,strStars);
			stmt.setString(4,strStartDate);
			stmt.setString(5,strEndDate);
			stmt.setString(6,strSlot912);
			stmt.setString(7,strSlot1215);
			stmt.setString(8,strSlot1518);
			stmt.setString(9,strSlot1821);
			stmt.setString(10,strPlatinumPrice);
			stmt.setString(11,strGoldPrice);
			stmt.setString(12,strSilverPrice);
			stmt.setString(13,strImageName);
		
			stmt.executeUpdate();
			con.close();
			System.out.println("data updated");
		}catch(SQLException e){
			
			e.printStackTrace();
		}
	}
	public Admin1 getAdmin1RowByMovieID(String strMovieID)
	{
		Admin1 m1=null;
		Connection con=getDBCon();
		try{
			PreparedStatement stmt=con.prepareStatement("select * from tblNewMovies where MovieID=?");
			stmt.setString(1, strMovieID);
			ResultSet rset=stmt.executeQuery();
			if(rset.next())
			{
				//String strMovieID=rset.getString("MovieID"),
						String strMovieName=rset.getString("Moviename"), strStars=rset.getString("stars"), strStartDate=rset.getString("startdate"), strEndDate=rset.getString("enddate"),strSlot912=rset.getString("Slot912"),
						strSlot1215=rset.getString("slot1215"),strSlot1518=rset.getString("slot1518"),strSlot1821=rset.getString("slot1821"),strPlatinumPrice=rset.getString("PlatinumPrice"),strGoldPrice=rset.getString("GoldPrice"),strSilverPrice=rset.getString("SilverPrice"),strImageName=rset.getString("ImageName");
				m1=new Admin1(strMovieID, strMovieName, strStars, strStartDate, strEndDate, strSlot912, strSlot1215, strSlot1518, strSlot1821, strPlatinumPrice, strGoldPrice, strSilverPrice, strImageName);
				System.out.println(m1);
			}
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return m1;
	}

			public LinkedList<Admin1> getNewMoviesTable() {
		// TODO Auto-generated method stub
		
					LinkedList<Admin1>objList=new LinkedList<Admin1>();
					Connection con=getDBCon();
					try {
						PreparedStatement stmt=con.prepareStatement("Select* from tblNewMovies");
						ResultSet rset=stmt.executeQuery();
						while(rset.next())
						{
							String strMovieID, strMovieName, strStars, strStartDate, strEndDate, strSlot912,
							 strSlot1215, strSlot1518, strSlot1821, strPlatinumPrice, strGoldPrice, strSilverPrice,strImageName;
							strMovieID=rset.getString("MovieID");
							strMovieName=rset.getString("MovieName");
							strStars=rset.getString("Stars");
							strStartDate=rset.getString("StartDate");
							strEndDate=rset.getString("EndDate");
							strSlot912=rset.getString("Slot912");
							strSlot1215=rset.getString("Slot1215");
							strSlot1518=rset.getString("Slot1518");
							strSlot1821=rset.getString("Slot1821");
							strPlatinumPrice=rset.getString("PlatinumPrice");
							strGoldPrice=rset.getString("GoldPrice");
							strSilverPrice=rset.getString("SilverPrice");
							Admin1 objAdmin1=new Admin1(strMovieID, strMovieName, strStars, strStartDate, strEndDate, strSlot912,
									 strSlot1215, strSlot1518, strSlot1821, strPlatinumPrice, strGoldPrice, strSilverPrice,"strImageName");
							System.out.println(objAdmin1);
							objList.add(objAdmin1);
						}
						con.close();	
						
					} 
				catch(SQLException e)
				{
				
					e.printStackTrace();
				}
				
			       return objList;
			}
			
		
			
	public int getMaxId(String strTblName,String strColName)
	{
		String strId="0";
		Connection con=getDBCon();
		try {
			PreparedStatement stmt=con.prepareStatement("select max("+strColName+") as id from "+ strTblName);
			ResultSet rset=stmt.executeQuery();
			if(rset.next())
			{
				strId=rset.getString("id");
			}
			else
			{
				strId="0";
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("select max("+strColName+") as id from "+ strTblName);
		if(strId==null)
		{
			strId="0";
		}
		int id=Integer.parseInt(strId);
		id+=1;
		return id;
	}

	public boolean isValidUser(String strUnm,String strPwd)
	{
		boolean res=false;
		Connection con=getDBCon();
		try{
			PreparedStatement stmt=con.prepareStatement("select * from tbluser where Unm=? and Pwd=?");
			stmt.setString(1,strUnm);stmt.setString(2,strPwd);
			ResultSet rset=stmt.executeQuery();
			if(rset.next())
			{
			System.out.println("valid user");
			res=true;
				
			}
		
			else
			{
				res=false;
			}
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return res;
		}

	public static java.util.Date  addDays(String strDate,int no_of_Days)
	{
		java.util.Date newDate=null;
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		try {
			java.util.Date javaDate=sdf.parse(strDate);
			newDate=addDays(javaDate, no_of_Days);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newDate;
	}
	public int getDiffBw2DatesDBFromTblMovie(String strStartDate	,String strEndDate)
	{
      String 	creditCardExpiryDate=strStartDate;		
		//========================		
		String strCreditCardExpiryDate=creditCardExpiryDate;
		   SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		   java.util.Date javaStartDate = null;
		   java.util.Date javaEndDate=null;
		try {
			javaStartDate = sdf1.parse(strCreditCardExpiryDate);
			javaEndDate=sdf1.parse(strEndDate);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		   java.sql.Date sqlCreditCardExpiryDate = new Date(javaStartDate.getTime());		   
		   System.out.println("11----payment java---------   html string date  ----- "+creditCardExpiryDate);
			System.out.println("22.1---payment java----------   java date is ----- "+javaStartDate.toString());
			System.out.println("22.2---payment java----------   java End date is ----- "+javaEndDate.toString());
			System.out.println("33---payment java----------   java.sql date is ----- "+sqlCreditCardExpiryDate.toString());
		
			int days=daysBetween(javaStartDate, javaEndDate);
		return days;
	}
	
	public int daysBetween(java.util.Date javaDateStartDate, java.util.Date javaDateEndDate)
	{
		return (int)( (javaDateEndDate.getTime() - javaDateStartDate.getTime()) / (1000 * 60 * 60 * 24));
	}
	public static java.util.Date addDays(java.util.Date d, int days)
	    {
	        d.setTime(d.getTime() + days * 1000 * 60 * 60 * 24);
	        return d;
	    }
	public void insertIntotblseatbooked(String strID,String strMovieID,String strPlatinumSeats,String strGoldSeats,String strSilverSeats,
			String strPlatinumSeatsbooked,String strGoldSeatsbooked,String strSilverSeatsbooked,String strDateOfShow,String strPlatinumAvailSeats,String strGoldAvailSeats,String strSilverAvailSeats,String strSlotOfShow)
	{
		// TODO Auto-generated method stub
		System.out.println("55555566656");
				Connection con=getDBCon(); 
			//OracleDataSource ods;
			try
			
			{
				OracleDataSource ods=new OracleDataSource();
				ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
				con=ods.getConnection("icsd","icsd");
				System.out.println("connection is established with database");
				
				
				
				PreparedStatement stmt=con.prepareStatement("insert into tblseatsbooked values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
				stmt.setString(1,strID);
				stmt.setString(2,strMovieID);
				stmt.setString(3,strPlatinumSeats);
				stmt.setString(4,strGoldSeats);
				stmt.setString(5,strSilverSeats);
				stmt.setString(6,strPlatinumSeatsbooked);
				stmt.setString(7,strGoldSeatsbooked);
				stmt.setString(8,strSilverSeatsbooked);
		        stmt.setString(9,strDateOfShow);
				stmt.setString(10,strPlatinumAvailSeats);
				stmt.setString(11,strGoldAvailSeats);
				stmt.setString(12,strSilverAvailSeats);
				stmt.setString(13,strSlotOfShow);
				
				stmt.executeUpdate();
				
				
				con.close();
				System.out.println("seats booked..........");
			}
			catch(SQLException e)
			{
				e.printStackTrace();
				
			}
		}

	public void insertIntotblticket(String strID,String strMovieID,String strTicketID,String strUNM,String strMOB,String strEmailID,String strPlatinumSeats,String strGoldSeats,String strSilverSeats,
			String strPlatinumSeatsBooked,String strGoldSeatsBooked,String strSilverSeatsBooked,String strDateOfShow,String strSlot,String strTotalPrice)
	{
		// TODO Auto-generated method stub
		System.out.println("55555566656");
				Connection con=getDBCon(); 
			//OracleDataSource ods;
			try
			
			{
				OracleDataSource ods=new OracleDataSource();
				ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
				con=ods.getConnection("Niharika","icsd");
				System.out.println("connection is established with database");
				
				
				
				PreparedStatement stmt=con.prepareStatement("insert into tblticket values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
				stmt.setString(1,strID);
				stmt.setString(2,strMovieID);
				stmt.setString(3,strTicketID);
				stmt.setString(4,strUNM);
				stmt.setString(5,strMOB);
				stmt.setString(6,strEmailID);
				stmt.setString(7,strPlatinumSeats);
				stmt.setString(8,strGoldSeats);
		        stmt.setString(9,strSilverSeats);
				stmt.setString(10,strPlatinumSeatsBooked);
				stmt.setString(11,strGoldSeatsBooked);
				stmt.setString(12,strSilverSeatsBooked);
				stmt.setString(13,strSlot);
				stmt.setString(13,strTotalPrice);
				
				
				
				stmt.executeUpdate();
				
				
				con.close();
				System.out.println("seats booked..........");
			}
			catch(SQLException e)
			{
				e.printStackTrace();
				
			}
		}

//	public ClsTicket getMovieRowByMovieID(String strMovieID)
//{
//		Seats e1=null;
//		Connection con=getDBCon();
//		try{
//			PreparedStatement stmt=con.prepareStatement("select * from tblticket where MovieID=?");
//			stmt.setString(1, strMovieID);
//			ResultSet rset=stmt.executeQuery();
//		if(rset.next())
//			{
//				String strID=rset.getString("ID"),strMovieID=rset.getString("MovieID") , strTicketID=rset.getString("TicketID"), strUNM=rset.getString("UNM"),
//						strMOB=rset.getString("MOB"),strEmailID=rset.getString("EmailID"),strPlatinumSeats=rset.getString("PlatinumSeats"),strGoldSeats=rset.getString("GoldSeats"),strSilverSeats=rset.getString("SilverSeats"),strPlatinumSeatsBooked=rset.getString("PlatinumSeatsBooked"),strGoldSeatsBooked=rset.getString("GoldSeatsBooked"),strSilverSeatsBooked=rset.getString("SilverSeatsBooked"),strDateOfShow=rset.getString("DateOfShow"),strSlot=rset.getString("Slot"),strTotalPrice=rset.getString("TotalPrice");
//				m1=new ClsTicket( strID, strMovieID,strTicketID, strUNM, strMOB, strEmailID, strPlatinumSeats,strGoldSeats, strSilverSeats,
//						 strPlatinumSeatsBooked, strGoldSeatsBooked, strSilverSeatsBooked, strDateOfShow, strSlot, strTotalPrice);
//				System.out.println(e1);
//			}
//			con.close();
//		}
//		catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//		return m1;
//	}
//
//			
//			
//			
//	
//		
	//}
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
	

	public void updtPSPseatsBookedPlatSeatsTblSeatsBookedByMvoiedIdDosSS(String strMovieId,String strDateOfShow,String strSlotShow,String strPLATINUMAVAILSEATS,String strPLATINUMSEATSBOOKED)
	{
		strSlotShow = strSlotShow.replace("-","");
		System.out.println(strMovieId+ " "+ strDateOfShow +  " "+ strSlotShow + " "+ strPLATINUMAVAILSEATS + " "+ strPLATINUMSEATSBOOKED+"  iiiiiiiiiiiiiiiiii  ");
		System.out.println("11111111111  ");
		Connection con=getDBCon();
		PreparedStatement stmt;
		try {
			System.out.println("2wwwwwwww  ");
			stmt = con.prepareStatement("update tblseatsbooked  set PLATINUMSEATSBOOKED=? , PLATINUMAVAILSEATS=? where MOVIEID=? and DATEOFSHOW=? and SLOTOFSHOW=?");
			stmt.setString(1, strPLATINUMSEATSBOOKED);
			stmt.setString(2, strPLATINUMAVAILSEATS);
			stmt.setString(3, strMovieId);
			stmt.setString(4, strDateOfShow);
			stmt.setString(5, strSlotShow);
			stmt.executeUpdate();
			System.out.println("3wwwwwww  ");
			con.close();
			System.out.println("tblSEatsbooked updated ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public ClsSeatsBooked getRowFromtblseatbookedByMovieidDosSS(String strMovieId,String strDateOfShow,String strSlotShow)
	{

		ClsSeatsBooked obj=null;
		Connection con=getDBCon();
		try {
			PreparedStatement stmt=con.prepareStatement("select * from tblseatsbooked where MOVIEID=? and DATEOFSHOW=? and SLOTOFSHOW=?");
			stmt.setString(1, strMovieId);
			stmt.setString(2, strDateOfShow);
			
			//strSlotShow.replaceAll("-","");
			strSlotShow = strSlotShow.replace("-","");
			System.out.println(strMovieId +  " "+ strDateOfShow +  " "+ strSlotShow +  " ... . ..dssdfsadfasfda   11 ");			
			stmt.setString(3, strSlotShow);
			ResultSet rset=stmt.executeQuery();
			while(rset.next())
			{
				String strID,strMovieID, strPlatinumSeats, strGoldSeats,strSilverSeats,
				 strPlatinumSeatsbooked, strGoldSeatsbooked, strSilverSeatsbooked,
				strPlatinumAvailSeats, strGoldAvailSeats,strSilverAvailSeats, strSlotOfShow;
				
				
				strID=rset.getString("ID");
				strMovieID=rset.getString("MovieID");
				strPlatinumSeats=rset.getString("PlatinumSeats");
				strGoldSeats=rset.getString("GoldSeats");
				strSilverSeats=rset.getString("SilverSeats");
				strPlatinumSeatsbooked=rset.getString("PlatinumSeatsbooked");
				strGoldSeatsbooked=rset.getString("GoldSeatsbooked");
				strSilverSeatsbooked=rset.getString("SilverSeatsbooked");
				strDateOfShow=rset.getString("DateOfShow");
				strPlatinumAvailSeats=rset.getString("PlatinumAvailSeats");
				strGoldAvailSeats=rset.getString("GoldAvailSeats");
				strSilverAvailSeats=rset.getString("SilverAvailSeats");
				strSlotOfShow=rset.getString("SlotOfShow");
				
				obj=new ClsSeatsBooked(strID, strMovieID, strPlatinumSeats, strGoldSeats, strSilverSeats, strPlatinumSeatsbooked, strGoldSeatsbooked, strSilverSeatsbooked, strDateOfShow, strPlatinumAvailSeats, strGoldAvailSeats, strSilverAvailSeats, strSlotOfShow);
				System.out.println(obj + "  inside get row from tblseatsbooked............");
				
			}
			con.close();	
			
		} 
	catch(SQLException e)
	{
	
		e.printStackTrace();
	}
	
       return obj;




	}
	
	public LinkedList<ClsSeatsBooked> gettblseatbooked()
	{
		LinkedList<ClsSeatsBooked> objSeats=new LinkedList<ClsSeatsBooked>();
		Connection con=getDBCon();
		try {
			PreparedStatement stmt=con.prepareStatement("select * from tblseatsbooked ");
			ResultSet rset=stmt.executeQuery();
			while(rset.next())
			{
				String strID,strMovieID, strPlatinumSeats, strGoldSeats,strSilverSeats,
				 strPlatinumSeatsbooked, strGoldSeatsbooked, strSilverSeatsbooked,strDateOfShow,
				strPlatinumAvailSeats, strGoldAvailSeats,strSilverAvailSeats, strSlotOfShow;
				
				strId=rset.getString("ID");
	strMovieId=rset.getString("MovieID");
	strTicketId=rset.getString("TicketID");
	strUnm=rset.getString("UNM");
	strMob=rset.getString("MOB");
	strEmailId=rset.getString("EmailID");
	strPlatinumSeats=rset.getString("PlatinumSeats");
	strGoldSeats=rset.getString("GoldSeats");
	strSilverSeats=rset.getString("SilverSeats");
	strPlatinumSeatsBooked=rset.getString("PlatinumSeatsBooked");
	strGoldSeatsBooked=rset.getString("GoldSeatsBooked");
	strSilverSeatBooked=rset.getString("SilverSeatsBooked");
	strDateOfShow=rset.getString("DateOfShow");
	strSlot=rset.getString("Slot");
	strTotalPrice=rset.getString("TotalPrice");
	ClsTicket obj=new ClsTicket(strId, strMovieId, strTicketId, strUnm, strMob, strEmailId, strPlatinumSeats, strGoldSeats, strSilverSeats, strPlatinumSeatsBooked, strGoldSeatsBooked, strSilverSeatBooked, strDateOfShow, strSlot, strTotalPrice);
	System.out.println(obj);
	objTickets.add(obj);
	
	}
	con.close();	
	
	} 
	catch(SQLException e)
	{
	
	e.printStackTrace();
	}
	
	       return objTickets;
		
	}

}