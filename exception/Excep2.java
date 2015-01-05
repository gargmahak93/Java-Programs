class Excep2 { 

    static int divide(int x, int y) {
	    int z = x/y;
	    System.out.println("....................");
	    return z;
    }

    public static void main(String ar[]) {
	int a=0, b=1, c=0;

	try 
	{
	    a = Integer.parseInt(ar[0]);
	    b = Integer.parseInt(ar[1]);
	    c = divide(a,b);
	}
	catch(ArithmeticException ex) 
	{
	    System.out.println(ex);
	}
	catch(NumberFormatException hg) 
	{
	    System.out.println(hg);
	}
	finally {
	    System.out.println("Finally block......");
	}

	System.out.println("Division is = "+c);

    }
}