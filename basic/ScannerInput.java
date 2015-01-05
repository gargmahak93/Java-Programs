import java.util.Scanner;

class ScannerInput 
{
    public static void main(String args[]) 
    {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter roll no. : ");
	int rno = sc.nextInt();

	System.out.print("Enter Name: ");
	sc.nextLine();
	String name = sc.nextLine();	//reads a line or sentence
	//String name = sc.next();	//read a word


	System.out.print("Enter Marks : ");
	float mrk = sc.nextFloat();

	System.out.print("Enter Grade : ");
	char grd = sc.next().charAt(0);	//reads a char

	System.out.println("----------------------------------");

	System.out.println("Roll nO.: "+ rno);
	System.out.println("Name : "+name);
	System.out.println("Marks : "+mrk);
	System.out.println("Grade : "+grd);

    }
}










