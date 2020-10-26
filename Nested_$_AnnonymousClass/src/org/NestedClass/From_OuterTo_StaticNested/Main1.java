package org.NestedClass.From_OuterTo_StaticNested;

public class Main1 {
	public static void main(String[] args) {
		System.out.println(A.B.y);
		A.B.m2();
		A.B b1=new A.B();
		System.out.println(b1.x);
		b1.m1();
	}
}
