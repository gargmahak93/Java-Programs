import java.util.Scanner;
class BinarySearch {
    public static void main(String sr[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter array size:");
	int a[] = new int[sc.nextInt()];

	System.out.print("Enter values:\n");
	for(int i=0; i<a.length; i++) {
	   a[i] = sc.nextInt();
	}

	System.out.print("Enter searching element: ");
	int key = sc.nextInt();

	int top=0, bot=a.length-1, mid=(top+bot)/2;

	while(top <= bot) {
	    if(a[mid]==key) {
		System.out.println("Element found at position : "+(mid+1));
		break;
	    } else if(a[mid] > key) {
		bot = mid-1;
		mid = (top+bot)/2;
	    } else {
		top = mid+1;
		mid = (top+bot)/2;
	    }
	}
	if(top>bot) {
	    System.out.println("No such data found");
	}
    }
}