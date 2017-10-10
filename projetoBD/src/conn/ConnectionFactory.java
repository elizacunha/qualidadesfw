package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() {
		Connection c = null;
		try {
			c = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/biblioteca", 
					"root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	
}
