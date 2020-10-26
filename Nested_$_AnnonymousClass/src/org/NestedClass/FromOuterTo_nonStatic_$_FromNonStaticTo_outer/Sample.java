package org.NestedClass.FromOuterTo_nonStatic_$_FromNonStaticTo_outer;

public class Sample {
	int x1=10;
	static int y1=20;
	int x=1000;
	
	class Demo{
		int x=100;
		int y1=200;
		void m1() {
			System.out.println("i am m1");
			System.out.println(y1);  //200
			System.out.println(Sample.y1);  //20
			
			System.out.println(x1);
			Sample s=new Sample();
			System.out.println(s.x);
			System.out.println(x);
		}
	}
	void display() {
		Demo d=new Demo();
		System.out.println(d.x);
		d.m1();
	}
}
