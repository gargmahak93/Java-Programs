class JaggedArray1 {
    public static void main(String args[]) {

	int a1[][] = {{2,4,6,8,0,1}, {3,7,9}, {1,2,3,4,5}};
	int a2[][] = {new int[3], new int[8], new int[4]};

	int a3[][], a4[][];

	a3 = new int[][]{{1,3,5,2,4},{6}, {7,8,9}};
	a4 = new int[3][];
	a4[0] = new int[3];
	a4[1] = new int[7];
	a4[2] = new int[4];


	for(int x[] : a3) 
	{
	    for(int y : x) 
	    {
		System.out.print(y+"  ");
	    }
	    System.out.print("\n");
	}

	System.out.println("-----------------------------------------");

	for(int i=0; i<a1.length; i++) 
	{
	    for(int j=0; j<a1[i].length ; j++) 
	    {
		System.out.print(a1[i][j]+"  ");
	    }
	    System.out.print("\n");
	}

    }
}