package Multi12;

public class CRunnable implements Runnable{

	@Override
	public void run() {
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}
