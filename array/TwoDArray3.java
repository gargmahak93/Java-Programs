import java.util.Scanner;

class TwoDArray3 {
    public static void main(String ar[]) {

	Scanner sc = new Scanner(System.in);

	int a[][];
	System.out.println("Enter no. of rows and columns: ");
	a = new int[sc.nextInt()][sc.nextInt()];

	System.out.println("Enter values: ");

	for(int i=0; i<a.length; i++) 
	{
	    System.out.println("Enter "+(i+1)+"th array: ");
	    for(int j=0; j<a[0].length; j++) 
	    {
		a[i][j] = sc.nextInt();
	    }
	}

	System.out.println("Matrix is: ");
	for(int i=0; i<a.length; i++) 
	{
	    for(int j=0; j<a[0].length; j++) 
	    {
		System.out.print(a[i][j]+"  ");
	    }
	    System.out.println("");
	}
    }
}