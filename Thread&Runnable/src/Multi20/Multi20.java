package Multi20;

public class Multi20 {

	public static void main(String[] args) {
		Bank b1=new Bank(20000);
		
		Thread gpay=new Thread() {
			public void run() {
				b1.deposit(10000);
			}
		};
		Thread ppay=new Thread() {
			public void run() {
				b1.withdrawl(15000);
			}
		};
		gpay.start();
		ppay.start();
	}

}
