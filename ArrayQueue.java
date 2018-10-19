//import java.util.Arrays;

public class ArrayQueue implements Queue{

	//variables for array queue
	int thesize = 10; 
	Object[] arr;
	int head;
	int tail;
	int size;

	
	// public static void main(String[] args) {
		
		
	// 	ArrayQueue q = new ArrayQueue();

	// 	q.enque("A");
	// 	q.enque("B");
		
	// 	q.enque("C");
		
	// 	q.enque("D");
	// 	q.enque("E");
		
	// 	q.enque("F");
	// 	 System.out.println(q.dequue() +  
 //                     " dequeued from queue\n"); 
		
	// 	System.out.println("Front item is " +  
 //                              arr[head]); 
           
 //        System.out.println("Rear item is " +  
 //                                arr[tail]); 

	// 	System.out.println(Arrays.toString(arr) + "\n");

		
		
	// }

	//constructor for array queue
	public ArrayQueue(){

		arr = new Object[thesize];
		head = 0;
		tail = 0;
		size = thesize;
	}

	//add object to array queue
	public void enqueue(Object obj){

		if(((tail + 1) % arr.length) == head){ 

			doubleArrSize();

		}

		arr[tail ++] = obj;

		if(tail == arr.length){

			tail = 0;
		}

	}

	//remove object from array queue
	public Object dequeue () {

		if(empty()){

			throw new IllegalArgumentException();

		}

		return arr[head++];

		
	}

	//checks if array queue is empty
	public boolean empty(){


		return head == tail;
	}


	//resizes the array queue
	public void doubleArrSize() {

		Object[] newArray = new Object[arr.length * 2];

		

		for(int i = head; i < arr.length + head; i++){

			newArray[tail ++] = arr[i % arr.length];


		}

		head = 0;
		tail = arr.length - 1;

		arr = newArray;


	}	




	


}
