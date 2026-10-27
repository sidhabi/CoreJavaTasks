package com.javaintroduction;

public class Test1 {
	static void method1() {
	   System.out.println("first method block");
	   method2();
	} 
	static void method2() {
	 System.out.println("second method block");
	 Test1 t= new Test1();
	 t.method3();
	}
	void method3() {
	 System.out.println(" first instance variable");
	 method4();
	} 
	void method4() {
   System.out.println("second instance variable");
}
public static void main(String[] args) {
	method1();
	
}		
		}
		
	
