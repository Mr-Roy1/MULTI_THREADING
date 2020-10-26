package org.LocalInnerClass;

public class Main1 {
	public static void main(String[] args) {
		class A{  //local inner class
			int x=10;
			void m1() {
				
			}
		}
		A a1=new A();
		System.out.println(a1.x);
		a1.m1();
	}
}
