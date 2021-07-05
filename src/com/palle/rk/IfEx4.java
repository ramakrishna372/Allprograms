package com.palle.rk;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("is even number");
		}
		else {
			System.out.println("is odd number");
		}

	}

}
