package com.palle.rk;

import java.util.Scanner;

public class Ifelseex6 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter day number");
int num=sc.nextInt();
if(num==1) {
	System.out.println("monday");
}
else if( num==2) {
	System.out.println("tuesday");
	
}
else if(num==3) {
	System.out.println("wensaday");
}
else if(num==4) {
	System.out.println("thursday");
}
else if(num==5) {
	System.out.println("friday");
}
else if(num==6) {
	System.out.println("satday");
}
else {
	System.out.println("invalied number");
}

	}

}
