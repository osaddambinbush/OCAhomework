package sql.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB extends Ausgabe {
	static String host = "127.0.0.1:3306";
	static String database = "java";
	static String user = "root";
	static String passwd = "toor";
	static String connectionCommand = "jdbc:mysql://" + host + "/" + database + "?user=" + user + "&password=" + passwd;
	static Connection connection;

	public static Connection dbCon() throws SQLException {

		try {
			connection = DriverManager.getConnection(connectionCommand);
			// dbCon();
			return connection;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println("false");
			return null;
		}

	}

}
