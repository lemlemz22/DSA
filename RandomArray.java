package TotalMax;
import java.util.*;
 
public class RandomArray {
		int sum = 0;
		int num;
		int max = 0;
		double average;
		int array[];
		int n;
		
		public void getAve(){
			
			
			average = (sum/array.length);
			
			System.out.println("Average : " + average);
	
	}
		
		public void getSum(){
			for (int i = 0; i <= n-1; i++){
				sum = sum + array[i];			
			}
			System.out.println("Sum : " + sum);

		}
		
		public void getMax(){

			
			for (int ma = 0; ma <= n-1; ma++ ){
				if (array[ma] > max){
					max = array[ma];
				}		
			}
			System.out.println("Max: " + max);
		}
		
		public void getInput(){
			
			Scanner input = new Scanner (System.in);
				Random num = new Random();
			
		 System.out.println("How many Numbers: ");
			
			n = input.nextInt();	
			array= new int[n];
			
			System.out.println();
			
			for(int number = 0; number <= n-1; number++){
			
				  array[number]=num.nextInt(1000);
			  }
			
			for (int x = 0; x <= n-1; x++){
				System.out.print(array[x] + "  ");
				
			}
			
			System.out.println();
			System.out.println();
		
		 
		}
		
		public static void main(String[]args){
			RandomArray array = new RandomArray();
				
				array.getInput();
				array.getSum();
				array.getAve();
				array.getMax();
		}

}
