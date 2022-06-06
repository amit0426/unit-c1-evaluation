package problem1;

import java.util.Scanner;

public class Exception {
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number of elements in the array");
			int first = scan.nextInt();
			
			
			
			int[] arr = new int[first];
			
			for(int i=0; i<arr.length; i++) {
				System.out.println("Enter the elements in the array");
				int elem = scan.nextInt();
				
				arr[i]=elem;
			}
			
			System.out.println("Enter the index of the array element you want to access");
			int index = scan.nextInt();
//			if(arr.length==first) {
//				int enter = scan.nextInt();
//				arr[0]=enter;
//				arr[1] = enter;
//				
//			}
			System.out.println("The array element at index  :"+arr[index]);
			System.out.println("The array element successfully accessed");
			
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("indexout of bounds exception");
		}catch(NumberFormatException e){
			System.out.println("Number format exception");
			
		} catch(ArithmeticException e) {
			System.out.println("enter valid number");
		}
		
		
		System.out.println("main method end");
	}

}
