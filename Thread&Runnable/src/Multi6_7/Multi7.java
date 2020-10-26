package Multi6_7;


public class Multi7 {

	public static void main(String[] args) {
		System.out.println("Main Thread Start!!!!");
         Thread t1=new MyThread();
         System.out.println(t1);
         
         t1.start();
         System.out.println("Main thread End!!!!");
         
	}

}
