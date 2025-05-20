package problems;

import java.util.Scanner;

public class Problem1 {
	
	public static void main(String args[]) {
		System.out.println("Welcome to simple calculator ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first value: ");
		double result=sc.nextDouble();
		char new_calc;
	
		do {
		System.out.println("Select Operation:ADD: 1 Subtraction: 2 Multiplication: 3 Division: 4 ");
		int o =sc.nextInt();
		System.out.println("Enter your second value: ");
		double B= sc.nextDouble();
		
		switch(o) {
		case 1:
			result=result+B;
			 System.out.printf("your Addintion of two numbers is: %.2f\n",result);
			 break;
			 
		case 2:
			result=result-B;
			 System.out.printf("your subtraction of two numbers is: %.2f\n",result);
			 break;
		case 3:
			result=result*B;
			 System.out.printf("your multiply of two numbers is: %.2f\n",result);
			 break;
		case 4:
			if(result!=0||B!=0) {
				result=result/B;
				 System.out.printf("your Division of two numbers is: %.2f\n",result);
				 
			}
			else {
				System.out.println("Division is not perform by 0");
			}
			break;
			 
			 default:
				 System.out.println("Not a defualt operator please provide 1,2,3,4");
		}
		System.out.println("If you want to do any further operation : type Y/N ");
		
		new_calc = sc.next().charAt(0);
		
		}while(new_calc=='Y'||new_calc=='y');
		
		
		System.out.println("Your final result: "+result);
		
		
	
		
	}

}
