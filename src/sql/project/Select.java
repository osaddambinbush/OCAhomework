package sql.project;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sql.project.DB;

public class Select extends DB {

	public static void select() throws SQLException {
		try {
			String sqlInsertString = "SELECT * FROM java.test1";
			PreparedStatement preparedStatement = connection.prepareStatement(sqlInsertString);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("Vorname") + ", " + rs.getString("Nachname"));
			}
			connection.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
