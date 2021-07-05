package com.palle.rk;

import java.util.Scanner;

public class IfEx5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
	int b=sc.nextInt();

	if(a>b||b<a) {
		System.out.println("a is greater than b");
	}
	else {
		System.out.println("a is less than b");
	}
			

	}

}
