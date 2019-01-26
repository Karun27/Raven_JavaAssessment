package Java_Assessment;

public class Array_Integers {
	public static void main(String args[]) {

		int[] a= new int[100];
		int s=a.length;
		for(int i=0;i<s;i++) {
			a[i]=i+1;
		}		
		for(int b=0;b<s;b++) {
			System.out.println(a[b]);
		}
	}
	

}
