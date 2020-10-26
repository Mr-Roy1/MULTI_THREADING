package Multi14_to_18;

public class Multi18 {
	public static void main(String[] args) throws InterruptedException {
		Runnable tar=new NameRunnable();
		
		Thread t1=new Thread(tar,"Jspider");
		t1.start();
		  Thread.sleep(400);
		  
		 t1.suspend();
		 Thread.sleep(7000);
		 
		 t1.resume();
	}

}
