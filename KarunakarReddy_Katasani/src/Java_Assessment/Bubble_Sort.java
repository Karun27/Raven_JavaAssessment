package Java_Assessment;

public class Bubble_Sort {
	public static void main(String args[]) {

		int a[]= {25,85,74,96,35,24,45,23};
		int n=a.length;
		int b=0;
		for(int y=0;y<n-1;y++) {
			System.out.print( a[y]+"\t");	
		}
		for(int i=0;i<n-1;i++) {
	
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
				b=a[j];
				a[j]=a[j+1];
				a[j+1]=b;
				
				}
			}
		}
		System.out.println("");
		System.out.print("After Sorting");
		System.out.println("\t \t |");
		System.out.println("\t \t \t v");
		for(int u=0;u<n-1;u++) {
			
			System.out.print(a[u]+"\t");
		}
	}

}
