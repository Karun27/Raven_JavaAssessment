package Java_Assessment;

import java.awt.List;
import java.util.LinkedList;

public class Stack {
	public static void main(String args[]) {
		LinkedList<Integer> a =new LinkedList<Integer>();
		a.add(58);
		a.add(74);
		a.add(96);
		a.add(1);
		a.add(27);
		a.add(81);
		System.out.println(a);
		System.out.println("Peek First "+a.peekLast());
		System.out.println("Removing Last "+a.removeLast());
		System.out.println(a);
		System.out.println("Popping out "+a.pop());
		System.out.println(a);
		a.addFirst(81);
		System.out.println("Inserting First "+	a);
		

	}

}
