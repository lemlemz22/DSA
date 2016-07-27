package BinarySearch;
import java.util.*;
public class BinarySearch {
	public static void main (String[] args){
		int[] intArray = new int[10];
		int searchValue = 0, index;
		
		System.out.println("Enter 10 numbers: ");
		Scanner input = new Scanner (System.in);
		
			for (int i = 0; i < intArray.length; i++){
				intArray[i] = input.nextInt();
			}
		System.out.println("Enter a number to search for: ");
			searchValue = input.nextInt();
			index = BinarySearch (intArray, searchValue);
				if (index!=-1){
					System.out.print("Found at index: " + index);
				} else {
					System.out.print("Not Found.");
				}
	}
	 static int BinarySearch(int[] search, int find){
		int start, end, midPT;
		start = 0;
		end = search.length - 1;
		
			while (start <= end){
				midPT = (start + end) / 2;
				
				if (search[midPT] == find){
					return midPT;
				} else if (search[midPT] < find){
					return midPT + 1;
				} else{
					end = midPT - 1;
				}
				return -1;
			}
			return find;
	}	
	}