package Java_Assessment;

import java.util.Scanner;

public class Armstrong_Number {
	public static void main(String args[]) {
int a= Integer.parseInt(args[0]);
int b=a;
int c=0;
int d;
while(a!=0) {
	d=a%10;
	c+=(int)Math.pow(d, 3);
	a/=10;
}
if(b==c) {
	System.out.println("Entered number "+b+" is a Armstrong Number");
}else {
	System.out.println("Oh no it's not a Armstrong Number");
}

	}

}
