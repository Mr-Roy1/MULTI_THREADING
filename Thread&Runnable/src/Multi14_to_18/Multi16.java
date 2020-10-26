package Multi14_to_18;

public class Multi16 {

	public static void main(String[] args) {
		Runnable tar=new NameRunnable();
		Thread t1=new Thread(tar,"Jspider");
		Thread t2=new Thread(tar,"Qspider");
		Thread t3=new Thread(tar,"Rspider");
		
		t1.start();
		      try {
				t1.join(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		t2.start();
		t3.start();
	}

}
