package org.annonymous_class_$_Lamda.Main3;

import java.util.Comparator;
import java.util.TreeSet;

public class Main3 {

	public static void main(String[] args) {
		//Arithmetic a1=(x,y)->x+y;
		Arithmetic a1=(a,b)->a+b;
		System.out.println(a1.perform(10,20));
		
					//  OR  //
		
		Arithmetic arth=new Arithmetic() {

			                                @Override
			                                public double perform(int a, int b) {
				                                return a+b;
			                                }
		                                  };
		System.out.println(arth.perform(50, 60));
		
		Arithmetic a2=(x,y)->x*y;
		System.out.println(a2.perform(10, 20));
		
		Arithmetic a3=(x,y)->{if(x>y)return x; else return y;};
		//Arithmetic a1=(x,y)->x>y?x:y;
		System.out.println(a3.perform(30, 20));
		
		
		Comparator<Integer> com=(obj1,obj2)->obj1.hashCode()-obj2.hashCode();
		         //  OR  //
		class MyCompare implements Comparator<Integer>{

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.hashCode()-o2.hashCode();
			}
		}
		 TreeSet ts1=new TreeSet<>((o1,o2)->o1.hashCode()-o2.hashCode());
// OR // TreeSet ts2=new TreeSet<>((obj1,obj2)->obj1.hashCode()-obj2.hashCode());
// OR // TreeSet ts3=new TreeSet<>(com);
// OR // TreeSet ts3=new TreeSet<>(new MyCompare());
	}
}
