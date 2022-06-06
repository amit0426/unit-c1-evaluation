package problem3;

import java.util.Scanner;

public class Demo{
	static Month month;
	
	public Demo(Month month) {
		this.month = month;
		
	}
	public static void ShowDetails() {
		
		switch(month) {
		case JANUARY:
			System.out.println("This is the 1st Month of the Year January");
			break;
		case FEBRARY:
			System.out.println("This is the 2st Month of the Year febrary");
			break;
		case MARCH:
			System.out.println("this is the 3st month of the year ");
			break;
		case APRIL:
			System.out.println("this is the 4st month of the year");
			break;
		case MAY:
			System.out.println("this is the 5st month of the year");
			break;
		case JUNE:
			System.out.println("this is the 6st month of the year");
			break;
		case JULY:
			System.out.println("this is the 7st month of the year");
			break;
		case AUGUST:
			System.out.println("This is the 8st Month of the Year August");
			break;
		case SEPTEMBER:
			System.out.println("This is the 9st Month of the Year september");
			break;
		case OCTOMBER:
			System.out.println("This is the 10st Month of the Year ");
			break;
		case NOVMBER:
			System.out.println("This is the 11st Month of the Year ");
			break;
		case DECEMBER:
			System.out.println("This is the 12st Month of the Year ");
			break;
			default: System.out.println("enter valid month");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month Name");
		
		String month = scan.next();
		Month demo =Month.valueOf(month);
		Demo d = new Demo(demo);
		d.ShowDetails();
		
		
	}
}
