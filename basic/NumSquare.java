import java.util.Scanner;

class NumSquare {
    public static void main(String ar[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter no. : ");
	int n = sc.nextInt();

	int m = n, r, sq=1, num=0;
	while(m>0) {
	    r = m%10;
	    num = num + sq*r*r ;
	    m = m/10;
	    sq *= 100;
	}
	System.out.print("Result is : "+num);
    }
}