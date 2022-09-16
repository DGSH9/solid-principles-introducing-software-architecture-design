import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Start {
	public static void main(String[] args) throws IOException{
		System.out.println("Student Managmennt App");
		
//		Scanner scanner = new Scanner(System.in);
		BufferedReader bReader = new BufferedReader( new InputStreamReader(System.in));
		while(true) {
			System.out.println("1 for add");
			System.out.println("2 for display");
			System.out.println("3 for delete");
			System.out.println("4 for exit");
			
			int num1 = Integer.parseInt(bReader.readLine());
			if(num1 ==1) {
				//add
				Student student = new Student("Neeraj","7054392173","Noida");
				boolean answer = Studentdao.insertStudentIntoDatabase(student);
				if(answer) {
					System.out.println("Succeccfully Added...");
				}
				else {
					System.out.println("Somehing Wrong..");
				}
			}
			else if(num1 ==2) {
				//display
//				Studentdao.displayAll();
			}
			else if(num1 ==3) {
				//delete
				//UserId for Deletion
				int userId = 3;
				boolean ansBoolean = Studentdao.deleteUser(userId);
				if(ansBoolean) {
					System.out.println("Succesfully deleted..");
				}
				else {
					System.out.println("Something wrog..");
				}
			}
			else if(num1 ==4) {
				//exit
				break;
			}
			else{
				
			}
		}
		System.out.println("Thank You For Using This...");
		
	}

}
