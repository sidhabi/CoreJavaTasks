package com.javaintroduction;

public class testDemo2 {
	static void method1(){
		System.out.println("method block 1");
		method2();
		}
	static void method2() {
		System.out.println("method block 2");
		testDemo2 t=new testDemo2();
		t.method3();
	}
	  void method3() {
		  System.out.println("instance variable 1");
		  method4();
	  }
	   void method4() {
		   System.out.println("instance variable 2");
	   }
   public static void main(String args[]) {
	  
	    	method1();
	    }
	   

	}


