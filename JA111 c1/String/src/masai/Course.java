package com.masai;

import java.util.Scanner;

public class Course {
	
	int courseId;
	String courseName; 
	int courseFee;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c=new Course();
		c.displayCourseDetails();
		
		authenticate("Admin","1234");
		authenticate("nasir","11111");


	}
	
	void displayCourseDetails(){
		
		Course c2=new Course();
		c2.courseId=100;
		c2.courseName="FWD";
		c2.courseFee=300000;
		
		System.out.println(c2.courseId);
		System.out.println(c2.courseName);
		System.out.println(c2.courseFee);
	}
	
	static void authenticate(String username , String password){
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter username and pasword:");
		if(username=="Admin" && password=="1234") {
			Course c1=new Course();
			
			System.out.println("enter course id");
			c1.courseId=sc.nextInt();
			System.out.println("enter course name: ");
			c1.courseName=sc.next();
			System.out.println("enter course fee :");
			c1.courseFee=sc.nextInt();
			c1.displayCourseDetails();
			
			
		}
		else {
			System.out.println("Invalid Username or password");
		}
		
	}

}
