package Multi3_4;


public class Multi3 {

	public static void main(String[] args) {
		Runnable target=new MyRunnable();
		
		Thread t1=new Thread(target);
		System.out.println(t1);
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		//System.out.println(target);
		

	}
}


