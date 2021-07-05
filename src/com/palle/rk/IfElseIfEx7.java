package com.palle.rk;

import java.util.Scanner;

public class IfElseIfEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		System.out.println("enter b number ");
		int b=sc.nextInt();
		System.out.println("enter c number ");
		int c=sc.nextInt();
		if(a>b&&a>c) {
			System.out.println("a is greater");	
		}
		else if(b>c) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}

	}

}
