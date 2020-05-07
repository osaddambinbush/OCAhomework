package sql.project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import sql.project.DB;

public class Select extends DB {

	public static void select() throws SQLException {

		Statement stmt = connection.createStatement(); // Opens DB Connection

		ResultSet rs = stmt.executeQuery("SELECT * FROM java.test1");
		while (rs.next()) {
			System.out.println(rs.getString(1) + ", " + rs.getString("Nachname"));
		}
		connection.close();
	}
}
