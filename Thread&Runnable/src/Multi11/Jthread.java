package Multi11;


public class Jthread extends Thread {
		public void run() {
			for(int i=1;i<=10;i++) {
				System.out.println("Jspiders: "+i);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
}
