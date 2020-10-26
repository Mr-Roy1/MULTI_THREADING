package Multi14_to_18;

public class Multi17 {

	public static void main(String[] args) {
		Runnable tar=new NameRunnable();
		Thread t1=new Thread(tar,"Jspider");
		Thread t2=new Thread(tar,"Qspider");
		Thread t3=new Thread(tar,"Rspider");
		
		t1.start();
		t2.start();
		    try {
				t2.join(3000,400);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		t3.start();
	}

}
