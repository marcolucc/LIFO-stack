package stack;

//Custom exception to throw if the stack is empty
public class EmptyStackException extends RuntimeException {
	
    public EmptyStackException(String error) {
	super(error);
    }
    
}