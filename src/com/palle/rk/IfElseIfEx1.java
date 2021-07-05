package com.palle.rk;

import java.util.Scanner;

public class IfElseIfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("entem fruite color");
String color=sc.next();
if(color.equals("green")) {
	System.out.println("mango");
}
else if(color.equals("yellow")) {
	System.out.println("banana");
}
else if(color.equals("orenge")) {
	System.out.println("orenges");
}
else {
	System.out.println("enter wrong ");
}
	}

}
