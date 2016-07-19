import java.util.*;
public class ArrayQueueSepa {

	public static void main(String[] args) {

		int a=0;
		int enq[] = new int[0]; 
		Scanner input = new Scanner(System.in);
		
		
		ArrayQueue queue = new ArrayQueue(10);
		System.out.println("********************\n");
		System.out.println("CURRENT QUEUE \n");
		queue.showQueue();
		
				
		System.out.println("********************\n");
		System.out.print("How many would you like to enqueue? : ");
		a = input.nextInt();
		enq	= new int[a];
		System.out.println("ENQUEUING\n");
		for (int i=0;i<=a;i++){
			queue.enqueue(i);	
		}
		
		System.out.println("********************\n");
		System.out.println("NEW QUEUE\n");
		queue.showQueue();
		
		System.out.println("********************\n");
		System.out.println("THIS IS THE FRONT INDEX\n");
		queue.peekRear();
	
		System.out.println("DEQUEUING\n");
		for (int i=0;i<a;i++){
			queue.dequeue(i);	
		}
	}

}
/* NAME: Florentino, Lemuel Rafael C. */
/* BSIS-2 */

