
public class Tester02 {

	public static void main(String[] args) {
		Customer c1 = new Customer("Jim", "Brown", "12/12/65");
		System.out.println(c1.toString());
		
		BankAccount b1 = new BankAccount(50, c1, AccountType.PERSONAL);
		System.out.println(b1.toString());
	}

}
