package org.tnsif.acc.c2tc.oops;



class Human{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
public class Encapsulation {
	public static void main(String[] args) {
		 Human obj= new Human();
		 obj.setName("Chandu");
		 obj.setAge(21);
		 System.out.println(obj.getName());
		 System.out.println(obj.getAge());
		
	}
}
}

