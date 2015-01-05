import java.util.Scanner;

class String3 {
    public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Cities seperated with space : ");
	String cities = sc.nextLine();

	String s[] = cities.split(" ");

	for(int i=0; i<s.length-1; i++) 
	{
	    for(int j=i+1; j<s.length; j++) 
	    {
		if(s[i].compareTo(s[j]) > 0) 
		{
		    String tmp = s[i];
		    s[i] = s[j];
		    s[j] = tmp;
		}
	    }
	}

	System.out.println("Sorted cities are : ");
	for(String s1 : s) {
	    System.out.println(s1);
	}

    }
}