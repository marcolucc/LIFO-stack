package stack;
/*
 * LIFO
 */
public interface IntPila {
	//Insert object at the top
	Object push (Object x);

	//Remove object at the top
	Object pop () throws EmptyStackException;

	//See first object without removing it at the top
	Object peek () throws EmptyStackException;

	//Empty stack?
	boolean isEmpty ();

}
