class MyEx1{
    public static void main(String args[]) {
	char c='a';
	try{	
		c=System.in.read();
	}
	catch(Exception ioe)
	{
		ioe.printStackTrace();
	}
	System.out.println("value is:"+c);
    }
}