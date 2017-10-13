package quiz;

import java.util.Scanner;

public class problem2 {


public static void main(String[] args){
  	
  	int number;
  	
  	Scanner keyboard = new Scanner(System.in);
    number = keyboard.nextInt();
    
  	System.out.println("Input a number: ");
	
  	 
    
	boolean isEven = (number%2 == 0 );
	
	if(isEven)
		System.out.println( "is even.");
	
	else 
		System.out.println("is odd.");
	    System.out.println(number);
	
	
	
	
	
	
	
}
}
	
	
