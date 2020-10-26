package other;


 class Apple {
	String color;
	double price;
	void eating(){
		System.out.println("i am eating apple...");
	}
}
 
 class Mango{
	  void bite() {
		  System.out.println("i am eating mango!!");
	  }
 }
 
  class MainApple{
	public static void main(String[] args) {
		System.out.println("main start!!");
		Apple a=new Apple();
		a.color="red";
		a.price=150;
		a.eating();
		System.out.println(a.color);
		Mango m=new Mango();
		m.bite();
		System.out.println("main end!!");
	}
}
 
