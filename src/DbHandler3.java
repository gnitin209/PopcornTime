import java.awt.Container;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import oracle.jdbc.pool.OracleDataSource;


	public class DbHandler3 {
	
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
	
	}
