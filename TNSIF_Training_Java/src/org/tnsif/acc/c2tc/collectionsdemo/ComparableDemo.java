package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

class Person5 implements Comparable<Person5>
{

	String name;
	int age;
	
	public Person5(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

     void display()
     {
    	 System.out.println("Name :"+name + " , Age :"+age);
     }
	
	@Override
	public int compareTo(Person5 o) {
	
		return this.name.compareTo(o.name);
	}
	
	
	
}