package com.palle1;

public class Jai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Derived d=new Derived();
	d.f1(10);
	Derived.m2(3, 1);
	
		
	}

}
class Base{
	public int x=20;
	public void  m1(int x) {
		System.out.println("Base function");
	}
	public static void m2(int i,int j) {
		System.out.println("hey bay");
		
	}
}
class Derived extends Base{
	public int j=10;
	public void f1(int o) {
		System.out.println("derived function");
	}
	public static void f2(int p,int q) {
		System.out.println("hello palle");
	}
}
