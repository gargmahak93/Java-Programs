class Excep1 { 
    public static void main(String ar[]) {
	int a=0, b=1, c=0;

	try 
	{
	    a = Integer.parseInt(ar[0]);
	    b = Integer.parseInt(ar[1]);
	    c = a/b;
	}
	catch(ArrayIndexOutOfBoundsException ex) 
	{
	    System.out.println("Invalid Index");
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