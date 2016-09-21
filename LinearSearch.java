package LinearSearch;
import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
	public static void main (String args[]){
		int c;
		int n;
		int search;
		int array[];
		
		Scanner in = new Scanner(System.in);
		Random num = new Random();
		System.out.print("Enter a number: ");
		n = in.nextInt();
		array = new int[n];
		
		
		for(int number = 0; number <= n-1; number++){
			
			  array[number]=num.nextInt(1000);
		  }
		
		System.out.println("Enter a number to search for: ");
		search = in.nextInt();
		
		for (int number = 0; number < n-1; number ++){
			if (array[number] == search){
				System.out.println(search + " is FOUND at " + number + ".");
				break;
			} else{
				System.out.println("Not FOUND.");
			}
		}
	}
}
