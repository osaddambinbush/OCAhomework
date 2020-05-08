package sql.project;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Insert extends DB {

	public static void insert() throws SQLException {
		String sqlInsertString = "INSERT INTO test1 values (?, ?)";
		
		try {
			String s = JOptionPane.showInputDialog(null, "Vorname: ", "SQL - Injector ",
					JOptionPane.PLAIN_MESSAGE);
			if (s != null &&s.contains(" ")==false) {
			String s2 = JOptionPane.showInputDialog(null, "Nachname: ", "SQL - Injector ",
					JOptionPane.PLAIN_MESSAGE);
			if (s2 != null &&s2.contains(" ")==false) {
				String vorname = s, nachname = s2;
			PreparedStatement preparedStatement = connection.prepareStatement(sqlInsertString);
			preparedStatement.setString(1, vorname);
			preparedStatement.setString(2, nachname);
			preparedStatement.executeUpdate();
			connection.close();}else System.exit(0);}else System.exit(0);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
