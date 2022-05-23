package com.masai;

import java.util.*;

public class Course {
	
	   private int courseId; 
	  private	 String courseName; 
	  private   int courseFee;
			
		
			
        public Course() {
				// TODO Auto-generated constructor stub
			}

//			it is non static method 
			
		public String 	displayCourseDetails() {
			return courseName;
			
			
			
			
		}
		
		
		
		public static void authenticate(String username,String password) {
			 
			return;
			 
		}
		
		public static void main(String[] args) {
			Course h = new Course();
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter your Id");
		    int id = scan.nextInt();
		    
		    h.setId(id);
		    
		    System.out.println("Enter your course Name");
		    String nam = scan.next();
		    
		    h.setName(nam);
		    
		    
		    System.out.println("Enter your Fees");
		    
		    int fe = scan.nextInt();
		    h. setFees(fe);
			

		    
		    
			System.out.println("Course Id :");
		    
		    System.out.println("Course name:"  );
           
		    System.out.println("Course Fees :");
		}
		
		
		


		public int getId() {
			return courseId;
		}
		
		public String getName() {
		 return	courseName;
			
			
		}
		
		public int getfees() {
			
			return courseFee;
		}
				  

		
		public void setId(int i) {
			courseId=i;
		}
		
		public void setName(String n) {
			courseName=n;
			
		}
		public void setFees(int f) {
			
			courseFee =f;
			
		}
		
		
			

}
