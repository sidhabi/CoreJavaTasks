package com.javaintroduction;

 public class Test3{
@Override
protected void finalize() throws Throwable {
// TODO Auto-generated method stub
super.finalize();
}	 
        public static void main(String[] args) {
        	Test3 t=new Test3();
		System.out.println("method");
		System.out.println(t);
		t=null;
		System.gc();
	}

}
