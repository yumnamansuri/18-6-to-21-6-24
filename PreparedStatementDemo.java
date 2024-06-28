package Code21_6;

//Prepared Statement - update the values in single/remaining query

import java.sql.*;

public class PreparedStatementDemo {

	public static void main(String[] args) throws Exception {
		

		String url="jdbc:mysql://localhost:3306/database1";
		String username="root";
		String password="12345";
		int EmpId = 105;
		String Name = "Arib";
		
		String query="insert into employee values (?,?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection Created");
		 
		PreparedStatement st = con.prepareStatement(query); //completed
		
		st.setInt(1, EmpId);
		st.setString(2, Name);
		
		int rs = st.executeUpdate(); //completed
		System.out.println(rs+" row/s affected");
		
		//Connection
		st.close();  //completed
		con.close();  //completed
	}

}
