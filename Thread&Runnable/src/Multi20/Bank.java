package Multi20;

public class Bank {
	int balance;//5000
	Bank(int balance){
		this.balance=balance;
	}
	
	synchronized void deposit(int amt) {
		balance=balance+amt;
		System.out.println("successfully deposited: "+amt);
		System.out.println("Available balance is: "+balance);
		notify();
	}
	synchronized void withdrawl(int amt) {
		if(balance<amt) {
			System.out.println("Low Balance...");
			try {
				wait(5000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			withdrawl(amt);
			return;
		}
		balance=balance-amt;
		System.out.println("Successfully withdrawl: "+amt);
		System.out.println("Available balance is: "+balance);
	}
}
