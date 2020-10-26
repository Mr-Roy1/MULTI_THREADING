package other;


public class Multi1 {
	public static void main(String[] args) {
		Thread t1=new Thread();
		System.out.println(t1);//Thread[Thread-0,5,main]
		System.out.println(t1.getId());//10
		System.out.println(t1.getName());//Thread-0
		System.out.println(t1.getPriority());//5
		
		
		Thread t2=new Thread();
		System.out.println(t2);//Thread[Thread-1,5,main]
		System.out.println(t2.getId());//11
		System.out.println(t2.getName());//Thread-1
		System.out.println(t2.getPriority());//5
	}
}
