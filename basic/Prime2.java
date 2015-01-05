class Prime
{
   public static void main(String args[])
   {
	int p=21,i,n=0;
	for(i=2;i<=p/2;i++)
	{
	   if(p%i==0)
	   {
		n++;
		break;
	   }
	}

	if(n==0)
	   System.out.print("the no is prime");
	else
	   System.out.print("its not");

   }
}