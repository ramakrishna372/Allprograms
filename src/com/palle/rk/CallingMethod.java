package com.palle.rk;

public class CallingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bitta b=new Bitta();
	System.out.println(b.m1(20,30));
System.out.println(b.m2(10, 40));
	}

}
class Bitta{
	public int m1(int x,int y) {
		int z=x+y;
		return z;
	}
	public int m2(int a,int b) {
	int	c=a-b;
		return c;
	}
}
