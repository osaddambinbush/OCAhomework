package sql.project;

import java.sql.SQLException;

public class Ausgabe {

	public static void main(String[] args) throws SQLException {
		try {
			DB.dbCon();
			Insert.insert();
			DB.dbCon();
			Select.select();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}

	}

}
