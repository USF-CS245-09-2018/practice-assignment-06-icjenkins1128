//import java.util.Arrays;

public class ArrayStack implements Stack{

	//varaibles for array stack
	int thesize = 10;
	int size;
	Object[] arr;
	int top;
    
   	//constructor for array stack
    public ArrayStack() 
    {
		arr = new Object[thesize];
		size = thesize;
		top = 0;
    }

    //checks if array stack is empty
    public boolean empty() 
    {
		return top == 0;
    }

    //adds objects to top of array stack
    public void push(Object obj)  
    {
		if (top == size){
	    	resize();
		}
			arr[top++] = obj;
    }

    //pops object from top of array stack
    public Object pop() 
    {
	
        if (!empty()){

        	return arr[--top];

        }
	    
		throw new IllegalArgumentException();
	    
    }

    //resizes arary stack
    public void resize() 
    {
      
       Object [] newArr = new Object[size * 2];

       for (int i =0; i < size; i++){
           newArr[i] = arr[i];
       }

       arr = newArr;
       size *= 2;


    }

    //returns object at top of array stack
    public Object peek() {

		if(!empty()){

			return arr[top];

		}
		
		throw new IllegalArgumentException();

	}
	

}