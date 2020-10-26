package org.NestedClass.From_OuterTo_StaticNested;
/* how to call outer class member into the static nested class  along with 
 * other class */

public class A { //OUTER CLASS
	int x1=90;	 //INSTANCE MEMBER
    static int y1=45; //STATIC MEMBER
	int x=100;
	static int y=450;
	
	        static class B{
		         int x=10;  //INSTANCE MEMBER
		         static int y=45;  //STATIC MEMBER
		         void m1() {
		        	 System.out.println(y1);
		        	 A a1=new A();
		        	 System.out.println(a1.x1);
		        	 System.out.println(x);    //10
		        	 System.out.println(a1.x);//100
		        	 System.out.println(y);   //45
		        	 System.out.println(y); //450
		        	 System.out.println(A.y);
		         }
		         static void m2() {
		        	 System.out.println(y1);
		        	 A a1=new A();
		        	 System.out.println(a1.x1);
		         }
		         
	     }

}
