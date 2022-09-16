import java.sql.Connection;
import java.sql.DriverManager;

public class StudentRepository {
	static Connection connection;
	
	public static Connection createConnection() {
		
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create Connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","Dgsh@12345");
			 
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}

}
