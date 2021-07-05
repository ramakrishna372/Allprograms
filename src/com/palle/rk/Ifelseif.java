package com.palle.rk;

import java.util.Scanner;

public class Ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number x");
		int x=sc.nextInt();
		System.out.println("enter number y");
int y=sc.nextInt();

if(x==y) {
	System.out.println("is equals");
}
else if(x>y) {
	System.out.println("x is grater than y ");
	
}
else {
	System.out.println("y is greter than x");
}
	}

}
