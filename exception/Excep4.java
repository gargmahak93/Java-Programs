class Student {
    int rno;
    String nm;
    int mrks;
    Student(int r, String n, int m) {
	rno = r;
	nm = n;
	if(m<0 || m>100)
	    throw new ArithmeticException("Invalid Marks");
	else 
	    mrks = m;
    }
    public String toString() {
	return rno+"  "+nm+"  "+mrks;
    }
}

class Excep4 { 

    public static void main(String ar[])
    {
	System.out.println("Main Begins");
	Student s1 = new Student(101, "aaaa", 56);
	System.out.println(s1);
	Student s2 = new Student(102, "bbbb", 546);
	System.out.println(s2);
	/*if(true)
	   throw new NullPointerException();	
	*/
	System.out.println("Main Ends");	
    }
}