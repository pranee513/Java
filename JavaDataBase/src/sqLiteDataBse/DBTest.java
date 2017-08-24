package sqLiteDataBse;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	private static Connection conn;

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		try {

			conn = DriverManager.getConnection("jdbc:sqlite:/Users/dev/workspace/JavaDataBase/testjava.db");
             Statement stmt = conn.createStatement();
             stmt.execute("CREATE TABLE contact3(name TEXT, phone INTEGER, email TEXT)");
			
             stmt.executeQuery("INSERT INTO contact3(name,phone,email) VALUES ('pranee',333334,'jksa@mail.com')");
             
             stmt.close();
			conn.close();
	 	} catch (SQLException e) {
			System.out.println("Error "+e);
		}

	}

}
