package org.annonymous_class_$_Lamda;

import java.util.Comparator;
import java.util.TreeSet;

public class MainRunner {

	public static void main(String[] args) {
		
		Comparator<Integer> c1=new Comparator<Integer>() {

			                              public int compare(Integer o1, Integer o2) {
				                                         return -(o1-o2);
			                               }
		                               };   //anonymous class here used to sorting in desc order.
		                               
		TreeSet ts=new TreeSet<Integer>(c1);
		ts.add(65);
		ts.add(55);
		ts.add(85);
		ts.add(15);
		ts.add(25);
		ts.add(95);
		ts.add(45);
		ts.add(78);
		ts.add(52);
		System.out.println(ts);
	}
}
