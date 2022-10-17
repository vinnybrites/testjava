import java.util.Scanner; 


public class Test {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int countCity = 0;
		int countStudent = 0;
		int answer;
		int option = 0;
		City city;
		Student student;
		String oldPassword;
		String newPassword;
		String confirmPassword;
		
		do {
			countCity++;
			System.out.println("-- Register the City --");
			student = new Student(read.nextInt("Informe o código: "), read.nextLine(), read.nextLine(), read.nextLine(), read.nextLine(), city);
		
		answer = read.nextInt();
		}while(answer == 0); 
	}
	
}
