package Multi12;


public class Multi12 {
	public static void main(String[] args) {
		Runnable s=new SRunnable();
		Runnable c=new CRunnable();
		
		Thread t1=new Thread(s);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
	}
}
