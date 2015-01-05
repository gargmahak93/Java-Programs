import java.util.Scanner;

class Array2 {
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter size of array: ");

	int n = sc.nextInt();
	int a1[] = new int[n];

	System.out.println("Enter values: ");

	for(int i=0; i<n; i++) {
	    a1[i] = sc.nextInt();
	}

	System.out.println("------------------------------------"); 
	System.out.println("Entered values are: "); 
	
	for(int i=0; i<n; i++) {
	    System.out.println(a1[i]);
	}
    }
}