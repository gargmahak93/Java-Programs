import java.util.Scanner;

class TwoDArray2 {
    public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter no. of rows : ");
	int m = sc.nextInt();

	System.out.print("Enter no. of columns : ");
	int n = sc.nextInt();

	int a1[][] = new int[m][n];

	System.out.println("Enter Values:");
	for(int i=0; i<m; i++) 
	{
	    for(int j=0; j<n; j++) 
	    {
		a1[i][j] = sc.nextInt();
	    }
	}
	
	System.out.println("----------------------------------");
	System.out.println("Matrix is : ");

	for(int x[] : a1) 
	{
	    for(int y : x) 
	    {
		System.out.print(y+"  ");
	    }
	    System.out.println();
	}


    }
}