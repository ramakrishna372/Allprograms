package com.palle.rk;

import java.util.Scanner;

public class IfeElseIfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1,2,3:");
		int num=sc.nextInt();
		if(num==1) {
			System.out.println("hai");
		}
		else if(num==2) {
			System.out.println("how are you");
		}
		else if(num==3) {
			System.out.println("where are you");
			
		}
		else {
			System.out.println("bye");
		}

	}

}
