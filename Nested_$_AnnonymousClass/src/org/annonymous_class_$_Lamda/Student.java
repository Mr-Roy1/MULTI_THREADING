package org.annonymous_class_$_Lamda;

public class Student {

	public static void main(String[] args) {
		Object obj1=new Object();
		System.out.println(obj1);
		
		Object obj2=new Object() {
			                        public String toString() {
			                        	return "Jspider";
			                        }
		                          };
		System.out.println(obj2);
		
		Object obj3=new Object() {
			                         int x=120;
			                        public String toString() {
			                        	return "Qspider";
			                        }
			                        public int hashCode() {
			                        	return x;
			                        }
		                          };
	  System.out.println(obj3);
	 // System.out.println(obj3.toString());
	  System.out.println(obj3.hashCode());
	 // System.out.println(obj3.x);    //compilation error
		
	}

}
