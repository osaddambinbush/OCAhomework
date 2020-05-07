package sql.project;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert extends DB {

	public static void insert() throws SQLException {

		String vorname = "Claudia", nachname = "Müller";

		String sqlInsertString = "INSERT INTO test1 values (?, ?)";

		PreparedStatement preparedStatement = connection.prepareStatement(sqlInsertString);
		preparedStatement.setString(1, vorname);
		preparedStatement.setString(2, nachname);
		preparedStatement.executeUpdate();
		connection.close();
	}

}
