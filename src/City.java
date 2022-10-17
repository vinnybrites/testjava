import java.util.Scanner; 

public class City {

	Scanner read = new Scanner(System.in);
	
	private int zipCode = read.nextInt();
	private String name = read.nextLine();
	private String state = read.nextLine();
	private int numberStudents = read.nextInt();
	
	public City( int zipCode, String name, String state) {
		this.zipCode = zipCode;
		this.name = name;
		this.state = state;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	
	public String getName() {
		return name;
	}
	
	public String getState() {
		return state;
	}
	
	public void addNewStudent() {
		numberStudents++;
	}
	
	public void displayData() {
		System.out.println("Zip Code: " + zipCode);
		System.out.println("City: " + name);
		System.out.println("State " + state);
		System.out.println("Number of Students: " + numberStudents);
	}
	
}
