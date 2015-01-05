import java.util.Scanner;

class Bank {
    private int acNo;
    private String acHolder;
    private float acBal;
    Scanner sc = new Scanner(System.in);

    void openAccount() {
	System.out.print("Enter a/c no. : ");
	acNo = sc.nextInt();
	System.out.print("Enter a/c holder name: ");
	acHolder = sc.next();
	System.out.print("Enter initial balance : ");
	acBal = sc.nextFloat();
    }

    void deposite(int amt) {
	acBal += amt;
	System.out.println("Amount deposited successfully");
    }

    void withdraw(int amt) {
	if(acBal<amt)
	    System.out.println("Insufficient balance");
	else
	{
	    System.out.println("Collect ur cash");
	    acBal -= amt;
	}
    }

    void balanceInquiry() {
	System.out.println("A/c No. : "+acNo);
	System.out.println("A/c Holder : "+ acHolder);
	System.out.println("Current Balance : "+acBal);
    }
}


class BankDemo1 {
    public static void main(String ar[]) {
	Bank b1 = new Bank();
	b1.openAccount();
	b1.balanceInquiry();
	System.out.print("Enter amount to be deposited : ");
	int amt = b1.sc.nextInt();
	b1.deposite(amt);

	System.out.println("\n-----------------------------");
	b1.balanceInquiry();
	System.out.println("\n-----------------------------");

	System.out.print("Enter amount to be withdrawn : ");
	amt = b1.sc.nextInt();
	b1.withdraw(amt);

	System.out.println("\n-----------------------------");
	b1.balanceInquiry();
	System.out.println("\n-----------------------------");

	System.out.print("Enter amount to be withdrawn : ");
	amt = b1.sc.nextInt();
	b1.withdraw(amt);

	System.out.println("\n-----------------------------");
	b1.balanceInquiry();
	System.out.println("\n-----------------------------");

	System.out.print("Enter amount to be deposited : ");
	amt = b1.sc.nextInt();
	b1.deposite(amt);

	System.out.println("\n-----------------------------");
	b1.balanceInquiry();
	System.out.println("\n-----------------------------");

    }
}