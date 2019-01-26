package Java_Assessment;

import java.util.Scanner;

public class Reverse_String {
	public static void main(String args[]) {
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the String");
		String a=sn.nextLine();
		for(int i=a.length()-1;i>=0;i--) {
			String b="";
			b=b+a.charAt(i);
			System.out.print(b);
			
		}
		

	}

}
