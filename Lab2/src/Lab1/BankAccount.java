
public class BankAccount {
	private double balance;
	public BankAccount(double balance) { this.balance = balance;}
	public BankAccount() { this(0);}
	public double getBalance() {return balance;}
	public void deposit(double amt) {
		double tmp = balance;
		tmp = tmp + amt;
		try {
			Thread.sleep(300); //simulate production time
		}catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("after depoist balance = $ " +tmp);
		balance = tmp;
	}
	public void withdrawal(double amt) {
		if (balance < amt) {
			System.out.println("Insufficient Funds");
			return;
		}
		double tmp = balance;
		tmp = balance - amt;
		try { 
			Thread.sleep(300); //simulate consumption time
		}catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("after withdrawal the balance = $ " +tmp);
		balance = tmp;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
