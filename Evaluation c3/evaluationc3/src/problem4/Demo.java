package problem4;
import java.util.regex.*;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username");
		String name = scan.next();
		System.out.println("Enter password");
		String pass = scan.next();
		System.out.println("Enter your mobile Number:");
		String mobile = scan.next();
		System.out.println("Enter your email");
		String email = scan.next();
		
		Costomer cos = new Costomer();
		Demo demo = new Demo();
		
		if(demo.validate(name,mobile,pass)==true) {
			cos.setUsername(name);
		cos.setEmail(email);
		cos.setMobileNumber(mobile);
		cos.setPassword(pass);
		
		System.out.println("name is :"+cos.getUsername());
		System.out.println("mobile number is:"+cos.getMobileNumber());
		System.out.println("Email :"+cos.getEmail());
		System.out.println("Paas"+cos.getPassword());
			
		}

		
		
		
		
	}
	        
	        
	        
	        
	        public boolean validate(String name,String mobile,String pass) {
	    		
	    		if(!name.equals("") && (name != null) && name.matches("^[a-zA-Z]*$")) {
	    			return true;
	    		}
//	    		Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
//	    		Matcher match = ptrn.matcher(mobileNum);
//	    		
//	    		return (match.find() && match.group().equals(mobileNum));
//	    		
	    		if(mobile.matches("\\\\d{10}")) {
	    			return true;
	    		}
	    		if(pass.matches("^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$")) {
	    			return true;
	    		}
	    		
	    		return false;
	    	}

}
