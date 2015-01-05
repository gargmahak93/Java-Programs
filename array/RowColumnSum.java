import java.util.Scanner;

class RowColumnSum {
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

	int s[] = new int[n];
	
	for(int i=0; i<m; i++) 
	{
	    int sum=0;
	    for(int j=0; j<n; j++) 
	    {
		System.out.print(a1[i][j]+"  ");
		sum += a1[i][j];
		s[i] += a1[j][i];
	    }
	    System.out.println(sum);
	}

	for(int i=0; i<n; i++)	{
	    System.out.print(s[i]+"  ");
	}

    }
}