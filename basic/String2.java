class String2 {
    public static void main(String args[]) {

	String s1 ="abc";
	System.out.println("s1 = "+s1);

	String s2 = "abc";
	System.out.println("s2 = "+s2);

	String s3 = new String("abc");
	System.out.println("s3 = "+s3);

	String s4 = new String("abc");
	System.out.println("s4 = "+s4);

	System.out.println("s1==s2 : "+(s1==s2));
	System.out.println("s1==s3 : "+(s1==s3));
	System.out.println("s3==s4 : "+(s3==s4));

	System.out.println("s1.equals(s2) : "+( s1.equals(s2) ));
	System.out.println("s1.equals(s3) : "+( s1.equals(s3) ));
	System.out.println("s3.equals(s4) : "+( s3.equals(s4) ));

	s1 += "def";
	System.out.println("s1 = "+s1);
	System.out.println("s2 = "+s2);
	System.out.println("s1==s2 : "+(s1==s2));
	System.out.println("s1.equals(s2) : "+( s1.equals(s2) ));

    }
}