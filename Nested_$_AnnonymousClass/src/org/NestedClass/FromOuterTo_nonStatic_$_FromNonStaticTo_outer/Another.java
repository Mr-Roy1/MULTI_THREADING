package org.NestedClass.FromOuterTo_nonStatic_$_FromNonStaticTo_outer;

public class Another {
	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println(s.x1);
		
		Sample.Demo d=new Sample().new Demo();
		System.out.println(d.x);
		d.m1();
	}
}
