import java.util.Scanner;

class Array3 {
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter size of array: ");

	int a1[] = new int[sc.nextInt()];

	System.out.println("Enter values: ");

	for(int i=0; i<a1.length; i++) {
	    a1[i] = sc.nextInt();
	}

	System.out.println("------------------------------------"); 
	System.out.println("Entered values are: "); 
	
	for(int i=0; i<a1.length; i++) {
	    System.out.println(a1[i]);
	}
    }
}