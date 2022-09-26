package testExeercise;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/*Q2) Write a program to read user input until user writes XDONE and then show the entered text by the user on commandline*/
public class userinput {
	
		    public static void main(String[] args) {
		    	List<String> store=new ArrayList<>();
		    	Scanner sc = new Scanner(System.in);
		      	System.out.println("Write your input");
	      		while(true)
	      	    {
	      		String msg = sc.nextLine();
	      		if("XDONE".equalsIgnoreCase(msg))
	      		{
	      			break;
	      	}
	      store.add(msg);
       	    
	      	
	    }
	      		System.out.println(String.join("\n", store));
	}

  
    
}
