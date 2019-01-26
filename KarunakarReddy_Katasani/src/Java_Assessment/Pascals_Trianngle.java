package Java_Assessment;

public class Pascals_Trianngle {
	public static void main(String args[]) {
		int count = 6;
		int a, b;
		for (int i = 0; i <= count; i++) {
		    b = 1;
		    a = i + 1;
		   
		    for (int j = count - i; j > 0; j--) {
		        System.out.print(" ");
		    }
		    for (int c = 0; c <= i; c++) {
		        if (c > 0) {
		            b = b * (a - c) / c;
		        }
		        System.out.print(b + " ");
		    }
		    System.out.println();
		}
		}
		
	

}

