class TwoDArray1 {
    public static void main(String args[]) {

	int a1[][] = {{2,4,6}, {8,0,1}, {3,7,9}};
	int a2[][] = new int[3][3];

	int a3[][], a4[][];

	a3 = new int[][]{{1,3,5}, {2,4,6}, {7,8,9}};
	a4 = new int[3][3];

	for(int x[] : a3) 
	{
	    for(int y : x) 
	    {
		System.out.print(y+"  ");
	    }
	    System.out.print("\n");
	}


    }
}