package com.palle.rk;

import java.util.Scanner;

public class IfElseIfEx3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number (0 to 100):");
	int marks=sc.nextInt();
	if(marks>90) {
		System.out.println("A gread");
	}
	else if(marks>=80) {
		System.out.println("B gread");
	}
	else if(marks>=70) {
		System.out.println("B+ gread ");
	}
	else if(marks>=60) {
		System.out.println("C gread");
	}
	else if(marks>=45) {
		System.out.println("D gread");
	}
	else if(marks>=35) {
		System.out.println("just pass");
	}
	else {
		System.out.println("fail");
	}
	

	}

}
