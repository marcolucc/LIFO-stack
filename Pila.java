package stack;

public class Pila {
	static final int DEFAULT_SIZE=100;
	private Object[] stack;
	private int i;
	
	public Pila(){
		//New stack
		stack = new Object[DEFAULT_SIZE];
	}
	
	public Object push (Object x){
		//Adding 1 to the index
		i++;
		//Adding the object x to the stack at the i-position at the top
		return stack[i]=x;
	}
	
	public Object pop () throws EmptyStackException{
		if (isEmpty()){
			throw new EmptyStackException("Empty stack");
		}
		//Saving the object
		Object temp=stack[i];
		//Deleting the object from the stack
		stack[i]=null;
		i--;
		return temp;
	}
	
	public Object peek () throws EmptyStackException{
		//Shows the first element without removing it from the stack
		return stack[i];
	}
	
	public boolean isEmpty (){
		//If stack is null then return null
		if(stack[0]==null){
			return true;
		}
		return false;
	}
	
	public void clear(){
		//Go back until the index is positive
		while(i >=0){
			stack[i]=null;
			i--;
		}
	}
	
}
