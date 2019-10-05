import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.LinkedList;

	import oracle.jdbc.pool.OracleDataSource;



public class DbHandlerAdmin  {
	
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

	public void insertIntotableadmin(String strANM, String strAPWD)	{
	Connection con=null;
	try{
	OracleDataSource ods=new OracleDataSource();
	ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
	con=ods.getConnection("icsd","icsd");
	System.out.println("connection is established with database");
	
	PreparedStatement stmt=con.prepareStatement("insert into tabladmin values(?,?)");
	
	stmt.setString(1,strANM);
	stmt.setString(2,strAPWD);
	
	stmt.executeUpdate();
	
	con.close();
	System.out.println("data inserted");
	}
	catch(SQLException e){
	e.printStackTrace();
	}
	}

	public boolean isValidUser(String strANM,String strAPWD)
	{
	boolean res=false;
	Connection con=getDBCon();
	try{
	PreparedStatement stmt=con.prepareStatement("select * from admin where ANM=? and APWD=?");
	stmt.setString(1,strANM);stmt.setString(2,strAPWD);
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
}