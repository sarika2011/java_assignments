package testExeercise;
/*Q1) Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.*/
public class empdetails{
	
	    	static {
	    	String FirstName1 ="Mohit";
	    	String LastName1 ="Singh";
	    	int age1= 15;	
	    	System.out.println("First name is" + "" + FirstName1);
	        System.out.println("Last name is"  + "" + LastName1);  
	        System.out.println("Age is" +"" + age1);  
	    	}
	    	
	    	public static void main(String args[]){  	
	    		details();	
	    			    }  
	    	
	    	static void details()
	    	{
	    	  String FirstName="sarika";
	    	  String LastName="Gupta";
	    	  int age=25;
	    	  System.out.println("First name is" + "" +FirstName);
	          System.out.println("Last name is"  + "" +LastName);  
	          System.out.println("Age is" +"" +age);  
	    	}
	    	
	    	
	}  
	
	
