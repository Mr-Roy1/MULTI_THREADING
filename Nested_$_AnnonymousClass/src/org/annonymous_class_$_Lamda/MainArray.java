package org.annonymous_class_$_Lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainArray {

	public static void main(String[] args) {
		int a=100;
		ArrayList<String> al=new ArrayList<String>();
		al.add("Pappu");
		al.add("Rahul");
		al.add("Deepak");
		al.add("Vicky");
		System.out.println(al);
		
		class MyComparator implements Comparator<String>{  //local inner class
			int a=100;
			
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		}
//		Comparator <String> c=new MyComparator();
//		Collections.sort(al, c);
//		System.out.println(al);
		
		      //   OR  //
		
		Comparator<String> c=(String o1,String o2)->{return -o1.compareTo(o2);};
		//Collections.sort(al,(String o1,String o2)->{return -o1.compareTo(o2);});
		Collections.sort(al,c);
		System.out.println(al);
	}
}
