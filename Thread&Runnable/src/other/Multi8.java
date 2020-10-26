package other;


public class Multi8 {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println(e);			
				}
		}
		
	}
}
