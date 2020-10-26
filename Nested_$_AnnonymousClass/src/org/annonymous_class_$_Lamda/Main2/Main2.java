package org.annonymous_class_$_Lamda.Main2;

public class Main2 {
	public static void main(String[] args) {
		class Myclass implements MyInterface{

			@Override
			public String getString() {
				return "Raghu";
			}
			
		}
		Myclass m1=new Myclass();
		System.out.println(m1.getString());
		
		     //    OR
		
		MyInterface m2=new MyInterface() {
			                                @Override
			                                public String getString() {
				                                return "Raghu";
			                                }
		                                 };
		System.out.println(m2.getString());
		
		MyInterface m3=new MyInterface() {
                                             @Override
                                            public String getString() {
                                                return "Shishira";
                                             }
                                          };
        System.out.println(m3.getString());
        
        // we can make this by lamda expression
        MyInterface m4=()->{return "Shishira";};
        System.out.println(m4.getString());
        
        MyInterface m5=()->"Girish";
        System.out.println(m5.getString());
		
	}
}
