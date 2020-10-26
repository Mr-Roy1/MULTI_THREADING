package other;


public class Multi13 {

	public static void main(String[] args) {
		System.out.println(Thread.MAX_PRIORITY);//10
		System.out.println(Thread.MIN_PRIORITY);//1
		System.out.println(Thread.NORM_PRIORITY);//5
		
		System.out.println(Thread.currentThread());
		
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}


/*
new Thread();
new Thread("Raghu");
new Thread(target);
new Thread(target,"Ramesh");
*/


