package sql.project;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Insert extends DB {

	public static void insert() throws SQLException {
		String sqlInsertString = "INSERT INTO test1 values (?, ?)";
		
		try {
			String vorname = JOptionPane.showInputDialog(null, "Vorname: ", "SQL - Injector ",
					JOptionPane.PLAIN_MESSAGE);
			if (vorname != null &&vorname.contains(" ")==false && vorname.isEmpty()==false) {
			String nachname = JOptionPane.showInputDialog(null, "Nachname: ", "SQL - Injector ",
					JOptionPane.PLAIN_MESSAGE);
			if (nachname != null &&nachname.contains(" ")==false && vorname.isEmpty()==false) {
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
