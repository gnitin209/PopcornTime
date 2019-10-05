import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	import oracle.jdbc.pool.OracleDataSource;


	public class DBHandlerSignup {
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
	}


//	public boolean isValidUser(String strUnm,String strPwd)
//	{
//	boolean res=false;
//	Connection con=getDBCon();
//	try{
//	PreparedStatement stmt=con.prepareStatement("select * from usersignup where Unm=? and Pwd=?");
//	stmt.setString(1,strUnm);stmt.setString(2,strPwd);
//	ResultSet rset=stmt.executeQuery();
//	if(rset.next())
//	{
//	System.out.println("valid user");
//	res=true;
//	}
//	else
//	{
//	res=false;
//	}
//	con.close();
//	}
//	catch(SQLException e)
//	{
//	e.printStackTrace();
//	}
//	return res;
//	}
//
//
//
//}