
/* RULES :- 

1 --> import java.sql package
2 --> Load & Register the Driver
3 --> Create Connection
4 --> Create Statement 
5 --> Execute the Query
6 --> Process the Result 
7 --> close

*/

import java.sql.*;

public class JDBC_Rules_And_Code {
  public static void main(String[] args) throws Exception {
  	String url = "jdbc:mysql://localhost:3306/student";
  	String uname = "root";
      String pass = "Debi@prasad9777";
      String query = "select name from studentdata where id=5";
      
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url , uname , pass);
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(query);
      
      rs.next();
      String name = rs.getString("name");
      System.out.println(name);
      
      st.close();
      con.close();
  }
}

