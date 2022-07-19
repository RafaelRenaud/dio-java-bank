public interface IAccount {

	Double withdraw(double amount);

	Double deposit(double amount);

	boolean transfer(double amount, IAccount destinationAccount);

	void extract();

}
