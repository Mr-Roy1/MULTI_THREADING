package Multi12;

public class SRunnable implements Runnable {

	@Override
	public void run() {
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
