package stack;
import java.util.*;

public class stac_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack =new Stack<String>();
		stack.add("hi");
		stack.add("hell");
		stack.add("bye");
		stack.add("gm");
		stack.add("eve");
		stack.push("a");
		System.out.println(stack);
		
		Iterator<String> it =stack.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next()+"");
		}
		
		System.out.println();
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
System.out.println(stack.empty());
System.out.println(stack.search("hell"));
	}

}
