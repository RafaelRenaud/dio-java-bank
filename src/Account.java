public abstract class Account implements IAccount {

	protected String branchNumber;
	protected String accountNumber;
	protected Double balance;
	protected Customer customer;

	private static double INITIAL_VALUE = 0d;

	public Account(Customer customer) {
		this.accountNumber = BankUtil.generateAccountID("ACCOUNT");
		this.branchNumber = BankUtil.generateAccountID("BRANCH");
		this.balance = INITIAL_VALUE;
		this.customer = customer;

	}

	public String getBranchNumber() {
		return branchNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public Double getBalance() {
		return balance;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		 this.customer = customer;
	}

	@Override
	public Double withdraw(double amount) {

		if ((amount > 0) && (this.getBalance() >= amount)) {
			this.balance -= amount;
		} else {
			System.out
					.println("********    Ocorreu um erro: Saldo insuficiente ou Opção de Saque Inválida    ********");
		}

		return this.getBalance();
	}

	@Override
	public Double deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
		} else {
			System.out.println("********    Ocorreu um erro: Opção de Depósito Inválida    ********");
		}

		return this.getBalance();
	}

	@Override
	public boolean transfer(double amount, IAccount destinationAccount) {
		if ((amount > 0) && (this.getBalance() >= amount)) {
			this.withdraw(amount);
			destinationAccount.deposit(amount);
		} else {
			System.out
					.println("********    Ocorreu um erro: Saldo insuficiente ou Opção de Saque Inválida    ********");
			return false;
		}
		return true;
	}
	
	public void extract() {
		System.out.println("********    EXTRATO DA CONTA    ********");
		System.out.println("    TITULAR:  " + this.getCustomer().getName());
		System.out.println("    AGÊNCIA:  " + this.getBranchNumber());
		System.out.println("    CONTA:    " + this.getAccountNumber());
		System.out.println("    SALDO:    " + this.getBalance());
		System.out.println("*************************************************");

	}

}
