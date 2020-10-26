package org.annonymous_class_$_Lamda;

public class Main5 {

	public static void main(String[] args) {
		
		Runnable rn=()->{
			             for(int i=65;i<=90;i++) {
			            	 System.out.println((char)i);
			              }
		                 };
	
		
		Comparable <Integer> com=(obj)-> obj.hashCode();
		
		System.out.println(com);
	}
}