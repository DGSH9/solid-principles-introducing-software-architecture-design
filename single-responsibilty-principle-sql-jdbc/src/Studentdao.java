
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Studentdao {
	
	public static boolean insertStudentIntoDatabase(Student student) {
		boolean status = false;
		try {
			
			//jdbc code
			Connection connection = StudentRepository.createConnection();
			
			//prepareStatement
			String q = "INSERT INTO students(sname,sphone,scity) values(?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(q);
			preparedStatement.setString(1, student.getStudentName());
			preparedStatement.setString(2, student.getStudentPhone());
			preparedStatement.setString(3, student.getStudentCity());
			
			//execute
			preparedStatement.executeUpdate();
			status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}


//	public void displayAll() {
//		try {
//			//jdbc code
//			Connection connection = StudentRepository.createConnection();
//			Student student = new Student();
//			
//			String qString = "select * from students";
//			//statement
//			Statement statement = connection.createStatement();
//			Resultset resultset = (Resultset) statement.executeQuery(qString);
//			
//			
//			while(((ResultSet) resultset).next()) {
//				int id = resultset.getServerInfo()
//				
//			}
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}


	public static boolean deleteUser(int userId) {
		boolean f = false;
		try {
			
			//jdbc code
			Connection connection = StudentRepository.createConnection();
			
			//prepareStatement
			String q = "delete from students where sid=?";
			PreparedStatement preparedStatement = connection.prepareStatement(q);
			preparedStatement.setInt(1,userId);
			
			//execute
			preparedStatement.executeUpdate();
			f = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}
}
