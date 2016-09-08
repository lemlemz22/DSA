package TotalMax;
import java.util.Scanner;

public class TotalMax {
		public static void main(String[] args){
			
			int sum = 0;
			int n;
			double average;
			int max = 0;
			int [] array;
			
			Scanner x = new Scanner(System.in);
			
			System.out.print("Enter no. of elements you want in array: ");
			n = x.nextInt();
			int a[] = new int[n];
			System.out.println("Enter all the elements: ");
			
			for(int i = 0; i < n ; i++){
			    a[i] = x.nextInt();
			    sum = sum + a[i]; 
			    }
			
				
				System.out.println("Sum = " + sum);
				average = sum / n;
				System.out.println("Average = " + average);
				
				max = array[0];
				for (int ma = 1; ma < array.length; ma++ ){
					if (array[ma] > max) max = array[ma];
				System.out.println("Max = " + max);
		}
		}
}