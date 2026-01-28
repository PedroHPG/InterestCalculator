package InterestCalculator.Calc;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	//Initialize scanner
    	Scanner scan = new Scanner(System.in);
    	
    	//Take input on operation type
        System.out.println("Enter the desired operation (s for simple interest, c for compound interest, anything else to end): ");
        String operationType = scan.nextLine();
        
        //Take input on interest rate
        System.out.println("Enter the interest rate (as a % number): ");
        float rate = scan.nextFloat();
        
        //Take input on starting amount
        System.out.println("Enter the starting amount: ");
        float startingAmount = scan.nextFloat();
        
        //Take input on time
        System.out.println("Enter the elapsed time (in the same unit as the rate): ");
        int time = scan.nextInt();
        
        double interest = 0;
        switch(operationType) {
	        case "s":
	        	interest = startingAmount * time * (rate/100);
	        	break;
	        case "c":
	        	interest = startingAmount * Math.pow((1 + rate), time) - startingAmount;
	        	break;
	        default:
	        	System.out.println("Invalid operation type");
        }
        
        //Close program
        System.out.printf("Your interest is R$%.2f%n. In other words, the total value is R$%.2f%n.", interest, (interest + startingAmount));
    }
}
