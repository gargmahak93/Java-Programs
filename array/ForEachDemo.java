class ForEachDemo {
//Enhanced For Loop
    public static void main(String ar[]) {
	int a[] = {12,2356,67,78,789,89,9056,3,4256,67};

	for(int x : a) {
	    System.out.println(x);
	}

	System.out.println("--------------------------------");

	int b[][] = {{2,4,6,8,0}, {1,3,5}, {9,8,7,6,5,4,3,2,1,0}};
	for(int x[] : b) {
	    for(int y : x) {
		System.out.print(y+"  ");
	    }
	    System.out.println();
	}
    }
}




