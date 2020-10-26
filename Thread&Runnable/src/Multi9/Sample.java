package Multi9;


public class Sample {
	void displayCaps() {
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	void displaysmall() {
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
