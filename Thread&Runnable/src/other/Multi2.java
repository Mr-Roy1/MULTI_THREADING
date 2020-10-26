package other;


public class Multi2 {
	public static void main(String[] args) {
		Thread t1=new Thread("Rai");
		System.out.println(t1);
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		System.out.println("-----------------------------------");
		Thread t2=new Thread("Roy");
		System.out.println(t2);
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
	}

}
