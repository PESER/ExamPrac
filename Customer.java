
public class Customer {

	private String forename;
	private String surname;
	private String dob;
	
	public Customer(String forename, String surname, String dob) {
		super();
		this.forename = forename;
		this.surname = surname;
		this.dob = dob;
	}

	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		String Person = "Person [forename=" + forename + ", surname=" + surname + ", dob=" + dob + "]";
		return Person;
	}
	

}
