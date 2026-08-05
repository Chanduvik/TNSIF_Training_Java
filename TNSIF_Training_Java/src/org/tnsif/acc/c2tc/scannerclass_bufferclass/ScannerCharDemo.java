package org.tnsif.acc.c2tc.scannerclass_bufferclass;

import java.util.Scanner;

public class ScannerCharDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		char c = scan.next().charAt(1);
		System.out.println("The second char is "+c);
		scan.close();
		

	}

}
