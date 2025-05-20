package problems;
import java.util.Scanner;
public class Problem3 {
	public static void main(String args[]) {
		
			Scanner sc = new Scanner(System.in);
			
			char again;
			 do {
		            System.out.println("\nEnter your Number to generate Odd series: ");
		            int a = sc.nextInt();
		            boolean firstnum = true;

		            for (int i = 0; i <= a; ++i) {
		                if (i % 2 != 0) {
		                    if (!firstnum) {
		                        System.out.print(", ");
		                    }
		                    System.out.print(i);
		                    firstnum = false;
		                }
		            }

		            System.out.println("\n\nDo you want to enter another number? (Y/N)");
		            again = sc.next().charAt(0);

		        } while (again == 'Y' || again == 'y');

		        System.out.println("Program exited.");
		        sc.close();
		    }
		}
