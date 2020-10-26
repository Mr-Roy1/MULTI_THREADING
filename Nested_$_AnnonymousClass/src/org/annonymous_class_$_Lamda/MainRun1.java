package org.annonymous_class_$_Lamda;

public class MainRun1 {

	public static void main(String[] args) {
		
		class Mycomparable implements Comparable{  //local inner class

			@Override
			public int compareTo(Object o) {
				return 50;
			}
		}
		Comparable com=new Mycomparable();
		System.out.println(com.compareTo(null));
		
		Comparable c=new Comparable() {                 //anonymous class
			                               @Override
			                              public int compareTo(Object o) {
   	                                   	      return 550;
			                                }
		                               }; //Anonymous class
		   System.out.println(c.compareTo(null));
										
		 Thread t1=new Thread() {
		                            public void run() {
		                            	for(int i=0;i<10;i++) {
		                            		System.out.println("Raghu");
		                            	}
		                            }
		                         };
		   t1.start();
		   Thread t2=new Thread() {
			                         public void run() {
			                        	 for(int i=0;i<10;i++) {
			                        		 System.out.println("Shishira");
			                        	 }
			                         }
		                           };
		   t2.start();
	}
}
