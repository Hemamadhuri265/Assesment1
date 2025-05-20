package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class problem4 {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter you size of List");
	int n = sc.nextInt();//Taking the number of values that array need to store 
	
	System.out.println("Enter your numbers: ");
	
	ArrayList<Integer> arl=new ArrayList<>(n); //aligning the size of ArrayList based on the user input 
	
	for(int i=0;i<n;i++) {
	int a = sc.nextInt();
	arl.add(a); //adding values in list
	
	}
	System.out.println("Your List of elememts are : "+arl);
	
	
	int[] count = new int[10]; //tacking one array with 1 to 
	for (int num : arl) {
	    for (int k = 1; k <= 9; k++) {
	        if (num % k == 0) {
	            count[k]++;
	        }
	    }
	}
	System.out.println("Your series of multiples from 1-9 is ");
	// Print results after counting is done
	for (int k = 1; k <= 9; k++) {
	    System.out.println(k + ": " + count[k]);
	}
	}
}
	
		
	
	
	


