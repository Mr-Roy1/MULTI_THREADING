package Multi11;


public class Multi11 {
	public static void main(String[] args) {
		Thread t1=new Jthread();
		Thread t2=new QThread();
		t1.start();
		t2.start();
		
	}

}
