package ccd.dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO {

	public static Connection getCon1(){
		Connection con1 = null;
		try {
			con1 = DriverManager.getConnection("jdbc:odbc:CCD");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con1;
	}


	public static void closeCon1(Connection con1){
		try {
			con1.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
