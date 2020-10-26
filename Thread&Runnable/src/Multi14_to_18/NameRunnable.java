package Multi14_to_18;

public class NameRunnable implements Runnable {

	@Override
	public void run() {
          for(int i=1;i<=10;i++) {
        	  System.out.println(Thread.currentThread().getName()+"-"+i);
        	  try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println(e);			}
          }
	}

}
