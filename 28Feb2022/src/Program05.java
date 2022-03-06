import java.sql.*;

public class Program05 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","system");
		Statement st=con.createStatement();
		String query="alter table d1 drop column age";
		System.out.println("Deleted row");
		st.executeUpdate(query);
		st.close();
		con.close();
	}
}
