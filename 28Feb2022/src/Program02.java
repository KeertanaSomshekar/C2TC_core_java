import java.sql.*;

public class Program02 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","system");
		Statement st1=con1.createStatement();
		//String query1="insert into d1 values('keertana',1,22)";
		//System.out.println("Inserted rows to the table");
		String query1="insert into d1 values('ram',5,64)";
		//System.out.println("Inserted rows to the table");
		st1.executeUpdate(query1);
		st1.close();
		con1.close();
	}
}
