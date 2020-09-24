package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sqlTest {
	
	public static void main(String[] args) {
		try {
			Connection dbconnection = DriverManager.getConnection("jdbc:sqlite:\\\\IONAD1\\FolderRedirectionLeerkrachten$\\mnuyts\\Application Data\\DBeaverData\\workspace6\\.metadata\\sample-database-sqlite-1\\Chinook.db");
			PreparedStatement prepareStatement = dbconnection.prepareStatement("Select * from Track");
			prepareStatement.execute();
			ResultSet resultSet = prepareStatement.getResultSet();
			
			while(resultSet.next()) {
				String text = resultSet.getString(resultSet.findColumn("Name"));
				
				System.out.println(text);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Sorry de database is niet beschikbaar.");
		}
		
	}

}
