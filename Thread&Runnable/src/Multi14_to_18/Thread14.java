package Multi14_to_18;

public class Thread14 {
	public static void main(String[] args) {
		Runnable r=new NameRunnable();
		
		Thread t1=new Thread(r,"Mumesh");
		Thread t2=new Thread(r,"Rakesh");
		t1.start();
		t2.start();
		
	}

}
