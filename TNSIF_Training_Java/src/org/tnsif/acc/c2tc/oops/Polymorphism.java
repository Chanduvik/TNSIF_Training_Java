package org.tnsif.acc.c2tc.oops;

class Sum {
	void add(int a,int b) {
		System.out.println("Sum of two integers"+(a+b));
	}
	
	void add(int a,double b,int c) {
		System.out.println("Sum of two integers and double"+(a+b+c));
	}
	
}
public class Polymorphism {
	public static void main(String[] args) {
		Sum obj=new Sum();
		obj.add(5, 9);
		obj.add(9, 8.0,9);
		
	}

}