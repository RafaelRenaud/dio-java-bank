
public class JavaApplicationRun {

	public static void main(String args[]) {
		Customer customer = new Customer("Rafael Renaud Miranda", "12345678901", "2001/04/06");
		
		IAccount checkingAccount = new CheckingAccount(customer);
		IAccount savingsAccount = new SavingsAccount(customer);

		checkingAccount.deposit(3997.68);
		checkingAccount.transfer(35.0, savingsAccount);

		checkingAccount.extract();
		savingsAccount.extract();

	}

}
