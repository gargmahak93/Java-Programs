import java.io.*;

class Excep3 { 

    static int reading() throws IOException
    {
	int x = System.in.read();

	return x;
    }

    public static void main(String ar[]) throws IOException
    {
	int a;

	System.out.print("Enter character : ");
	a = reading();

	System.out.println("character is : "+ (char)a );
	

    }
}