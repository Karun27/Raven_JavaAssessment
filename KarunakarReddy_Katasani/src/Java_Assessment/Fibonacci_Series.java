package Java_Assessment;

public class Fibonacci_Series {
	public static void main(String args[]) {

		int a=1,b=1;
	   int i=100;
	for(int n=0;n<=i;n++) {
		System.out.print(a+" + ");
		int fib = a+b;
		a=b;
		b=fib;
	}

}
}
