import java.util.Scanner;

class JaggedArray2 {
    public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter no. of rows : ");

	int a1[][] = new int[sc.nextInt()][];

	for(int i=0; i<a1.length; i++) 
	{
	    System.out.print("Enter no. of columns for "+(i+1)+"th row :");
	    a1[i] = new int[sc.nextInt() ];
	    System.out.println("Enter values : ");
	
	    for(int j=0; j<a1[i].length ; j++) 
	    {
		a1[i][j] = sc.nextInt();
	    }
	}

	System.out.println("------------------------------");
	for(int x[] : a1) 
	{
	    for(int y : x) 
	    {
		System.out.print(y+"  ");
	    }
	    System.out.print("\n");
	}

    }
}