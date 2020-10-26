package org.NestedClass.From_StaticNested_ToOuter;
/* how to access static nested class member into outer class  */

public class Outer {
	
	static class Nest{
		int x=10;
		static int y=20;
		void m1() {
			
		}
		static void m2() {
			
		}
	}
	public void display() {
		System.out.println(Nest.y);
		Nest.m2();
		Nest n=new Nest();
		System.out.println(n.x);
		n.m1();
	}
}
