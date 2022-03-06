import java.sql.*;

public class Program01 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","system");
		Statement st=con.createStatement();
		String query="create table d1(name varchar(10),id int primary key,age int)";
		st.executeUpdate(query);
		System.out.println("created table");
		st.close();
		con.close();
	}
}
