package Code20_6;



/* 1. import the package ---->phone ----->SQL package ---->completed
 * 2. load or Register the driver ----> sim card ------>"com.mysql.cj.jdbc.Driver" --------->forName();
 * 3. Establish the connection ----> call the particular person ----->static method - getConnection(parameters);
 * 4. create the statement ---> prepare the question -----> createStatement();//Three types - statement,prepared statement & callable statement
 * 5. Execute the query -----> ask the question ------> executeQuery();
 * 6. process the result ------> person response
 * 7. close the connection -----> hang up the call //close()
 
 */

import java.sql.*;
public class JdbcDemo {

	
	public static void main(String[] args) throws Exception {
		
		String url="jdbc:mysql://localhost:3306/database1";
		String username="root";
		String password="12345";
		//String query= "SELECT * FROM database1.student";
		String query= "SELECT * FROM database1.student WHERE id like 3";
		
		
		//Step 1 register the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 Create the connection 
		Connection con = DriverManager.getConnection(url,username,password);
		
		System.out.println("Connection Created");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		
		while(rs.next()) {
			
			String table="";
			
			table= rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3)+":"+rs.getString(4)+":"+rs.getInt(5);
			System.out.println(table); 
			}
		
	
		
		/*int id = rs.getInt("id");
		System.out.print(id + " ");
		
		String name = rs.getString("Name");
		System.out.print(name + " ");
		
		int age = rs.getInt("Age");
		System.out.print(age + " ");
		
		String email = rs.getString("Email");
		System.out.print(email + " ");
		
		int phone = rs.getInt("PhoneNo");
		System.out.print(phone + " ");
		*/
		st.close();
		con.close();
	}

}
