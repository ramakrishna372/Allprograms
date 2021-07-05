package com.palle.rk;

import java.util.Scanner;

public class IfElseIfEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter fruite name");
		String fruite =sc.next();
		System.out.println("enter quantity");
		int quant=sc.nextInt();
		if(fruite.equals("apple")) {
			if(quant<10) {
				System.out.println("cost is"+(quant*15));
			}
			else if(quant>=10&&quant<=20) {
				System.out.println("cost is"+(quant*13));
			}
			else {
				System.out.println("cost is"+(quant*12));
			}
		}
		if(fruite.equals("banana")) {
			if(quant<20) {
				System.out.println("cost is"+(quant*8));
			}
			else {
				System.out.println("cost is"+(quant*7));
			}
		}
		if(fruite.equals("orenge")) {
			if(quant<100) {
				System.out.println("cost is"+(quant*3));
			}
			else {
				System.out.println("cost is"+(quant*2));	
			}
		}
		
		
		

	}

}
