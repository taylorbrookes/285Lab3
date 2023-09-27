import java.util.ArrayList;
import java.util.NoSuchElementException;

public class myStack implements IStack{
	
	/**
	 * uses ArrayList as the stack
	 */
	private ArrayList<String> useArrList;
	
	
	
	@Override
	/**
	 * @author jovee
	 */
	public void push(String c) {
		useArrList.add(0, c);
	}

	
	@Override
	/**
	 * @author jovee
	 * 
	 * @return the String at the top of the stack. also removes it from the stack
	 */
	public String pop() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		return useArrList.remove(0);
	}

	@Override
	/**
	 * @author jovee
	 * 
	 * @return the top value of the stack without removing it.
	 */
	public String peek() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		return useArrList.get(0);
	}

	
	@Override
	/**
	 * @author jovee
	 * 
	 * @return whether or not the stack is empty. True if there is not an element at index 0, false otherwise.
	 */
	public boolean isEmpty() {
		return useArrList.isEmpty();
	}
	
}
