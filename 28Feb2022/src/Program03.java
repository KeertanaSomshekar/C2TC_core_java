import java.sql.*;

public class Program03 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","system");
		Statement st=con.createStatement();
		String query1="update d1 set age=65 where id=5";
		System.out.println("Updated");
		st.executeUpdate(query1);
		st.close();
		con.close();
	}
}
