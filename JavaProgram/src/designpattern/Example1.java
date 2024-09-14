package designpattern;

public class Example1 {
	
	
	    public static void main(String[] args) {
	        int rows = 3; // Number of rows in the pattern
	        
	        // Loop through each row
	        for (int i = 1; i <= rows; i++) {
	            // Print spaces before the asterisks
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }
	            
	            // Print asterisks for the current row
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }
	            
	            // Move to the next line after each row is printed
	            System.out.println();
	        }
	    }
	}
