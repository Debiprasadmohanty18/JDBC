
import java.sql.*;  // import java.sql package.

public class FetchingAllDataFromDatabase {

	public static void main(String[] args) {  // We can use try{} and catch{} block or we can use throws keyword directly in main method.
		try {
		Class.forName("com.mysql.jdbc.Driver"); // Load & Register the Driver
		Connection built = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");  // Connection Established.
		Statement think = built.createStatement();  // Create Statement.
		ResultSet store = think.executeQuery("select * from studentdata");  // Execute Query.
		
		while(store.next()) 
		{
			String show = store.getInt(1) + " : " + store.getString(2) + " : " + store.getString(3);   // Process Results
				  		// AS id number is an integer so getInt(ColumnNumber) required.
						// As name is a String type so getString(ColumnNumber) required.
						// As address is also String type so getString(ColumnNumber) required.
			System.out.println(show); 
		}
		
		think.close();   // Close 
		store.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
