package sql.project;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import sql.project.DB;

public class Select extends DB {

	public static void select() throws SQLException {

		String sqlInsertString = "SELECT * FROM java.test1";
		PreparedStatement preparedStatement = connection.prepareStatement(sqlInsertString);
		ResultSet rs = preparedStatement.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString(1) + ", " + rs.getString("Nachname"));
		}
		connection.close();
	}
}
