class String1 {
    public static void main(String args[]) {
	String s1 ="abc";
	System.out.println("s1 = "+s1);

	String s2 = new String("def");
	System.out.println("s2 = "+s2);

	char c[] = {'a','q','3','%','g','7',' ','d',65,'r'};
	String s3 = new String(c);
	System.out.println("s3 = "+s3);

	String s4 = new String(c, 2, 6);
	System.out.println("s4 = "+s4);

	byte b[] = {65,66,67,68,70,83,92,99};
	String s5 = new String(b);
	System.out.println("s5 = "+s5);

	String s6 = new String(b, 4, 3);
	System.out.println("s6 = "+s6);

    }
}