package Java_Assessment;

import java.util.*;

public class MiddleNode_LinkedList {
	public static void main(String args[]) {
		List<Integer> a = new LinkedList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		int l=a.size();
		if(l%2==0) {
			System.out.println(a.subList(l/2-1, l/2+1));
		}
		else {
			System.out.println(a.subList(l/2, l/2+1));
		}

	}
}

