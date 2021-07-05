package com.palle.rk;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter your age");
int age=sc.nextInt();
if(age>18) {
	System.out.println("eligible for vote");
}
else {
	System.out.println("not eligible for vote");
}


}

}

