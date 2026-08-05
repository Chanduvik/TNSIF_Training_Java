package org.tnsif.acc.c2tc.scannerclass_bufferclass;
import java.util.Scanner;


public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Name");
		String name = scan.nextLine();
		
		System.out.println("Enter your Age");
		int Age = scan.nextInt();
		
		System.out.println("Enter your Height:");
		float Height= scan.nextFloat();
		
		System.out.println("Are you a student:");
		boolean is_Student=scan.nextBoolean();
	
		System.out.println("Enter your aadhar no:");
		long adharno=scan.nextLong();
		scan.nextLine();
		System.out.println("Enter your favorite teacher name:");
		String teacher=scan.nextLine();
		
		System.out.println("Enter your hobby :");
		String Hobby=scan.nextLine();
		
		System.out.println("Enter your Daily reading time in minute :");
		byte readingtime=scan.nextByte();
		
		System.out.println("Enter your CGPA:");
		double cgpa = scan.nextDouble();
		
		System.out.println("Enter no of siblings:");
		short siblings = scan.nextShort();
		
		
		System.out.println("Student Information:");	
		
		System.out.println("name of the user is "+name);
		System.out.println("age is "+Age);
		System.out.println("Height is: "+Height);
		System.out.println("Adhar no is: "+adharno);
		System.out.println("favorite teacher is: "+teacher);
		System.out.println("hobby no is: "+Hobby);
		System.out.println("reading time is: "+readingtime);
		System.out.println("CGPA is: "+cgpa);
		System.out.println("siblings are : "+siblings);
		
	}
}
