package Java_Assessment;

import java.util.Scanner;

public class Palindrome {
	public static boolean PalindromeCheck(int a) {
		
		int b=a;
		int c=0;
		int d;
		while(a!=0) {
			d=a%10;
			c=c*10+d;
			a/=10;
		}
	if(b==c) {
		return true;
	}else {
		return false;
	}
	}
	public static void main(String args[]) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sn.nextInt();
		boolean s = PalindromeCheck(a);
		System.out.println(s);
	}
	
	

}
