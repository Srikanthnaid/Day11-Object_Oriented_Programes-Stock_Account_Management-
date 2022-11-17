package accountBalnce;

public class Account {
	double accountBalance,creditBalance,debitBalance;
	
	public Account() {
		
	}
	/**
	 * @param accountBalance
	 * @param creditBalance
	 * @param debitBalance
	 */
	public Account(double accountBalance, double creditBalance, double debitBalance) {
		super();
		this.accountBalance = accountBalance;
		this.creditBalance = creditBalance;
		this.debitBalance = debitBalance;
	}

	/**
	 * @return the accountBalance
	 */
	public double getAccountBalance() {
		return accountBalance;
	}

	/**
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	/**
	 * @return the creditBalance
	 */
	public double getCreditBalance() {
		return creditBalance;
	}

	/**
	 * @param creditBalance the creditBalance to set
	 */
	public void setCreditBalance(double creditBalance) {
		this.creditBalance = creditBalance;
	}

	/**
	 * @return the debitBalance
	 */
	public double getDebitBalance() {
		return debitBalance;
	}

	/**
	 * @param debitBalance the debitBalance to set
	 */
	public void setDebitBalance(double debitBalance) {
		this.debitBalance = debitBalance;
	}
	
	

}
