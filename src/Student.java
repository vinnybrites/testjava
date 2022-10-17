
public class Student {
	private int ssn;
	private String name;
	private String birthDate;
	private String email;
	private String password;
	private City city;
	
	public Student (int ssn, String name, String birthDate, String email, String password, City city) {
		this.ssn = ssn;
		this.name = name;
		this.birthDate = birthDate;
		this.email = email;
		this.password = password;
		this.city = city;
		
		city.addNewStudent();
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	
}
