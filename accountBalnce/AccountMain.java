package accountBalnce;

import java.util.Scanner;

public class AccountMain {
	double totalAccountBalance;
	static Scanner s = new Scanner(System.in);
	Account balance = new Account();

	public void accountDetaild() {
		// values taken from the console
		System.out.print("Enter Account Balance: ");
		balance.setAccountBalance(s.nextDouble());

	}

	public void accountDebit() {
		System.out.print("Enter debit Amount from the account: ");
		balance.setDebitBalance(s.nextDouble());
		totalAccountBalance = balance.getAccountBalance() - balance.getDebitBalance();
		System.out.println("After debit the avaliable ammount is : " + totalAccountBalance);
	}

	public void accountCridit() {
		System.out.print("Enter Cridite Amount : ");
		balance.setCreditBalance(s.nextDouble());
		totalAccountBalance = totalAccountBalance + balance.getCreditBalance();
		System.out.println("After added amount to account total balance is :" + totalAccountBalance);
	}

	public static void main(String[] args) {
		AccountMain account = new AccountMain();
		account.accountDetaild();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1. for Debit Amount  \nEnter 2. for cridit Amount");
		int input = s.nextInt();
		switch (input) {
		case 1 -> account.accountDebit();
		case 2 -> account.accountCridit();
		case 3 -> {
			System.out.println("exiting");
			System.exit(0);
		}
		default -> System.out.println("invalid input");
		}

	}

}
