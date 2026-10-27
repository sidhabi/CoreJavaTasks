package com.javaintroduction;

public class Student {
	static 	String collegeName="omega";
	static	String principalName="siva kumar";
	   int studentId;
		String studentName;
		String courseName;
		int marks;
		 void studentdetails() {
			 System.out.println(studentId+" "+studentName+" "+courseName+" "+marks);
			 System.out.println(collegeName+""+principalName);
		 }
	

		public static void main(String[] args) {
			Student s=new Student();
			 s. studentId=1;
				s. studentName="siddu";
				 s.courseName="bsc";
				s. marks=60;
				s.studentdetails();
				Student s1=new Student();
				s1. studentId=2;
				s1. studentName="vali";
				 s1.courseName="bsc";
				s1. marks=75;
				
			 
			
			
				

	}

}
