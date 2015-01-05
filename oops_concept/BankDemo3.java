import java.util.Scanner;

abstract class Bank {
    private static int val=101;
    private int acNo;
    private String acHolder;
    private float acBal;
    static Scanner sc = new Scanner(System.in);

    //getter method
    int getAcNo() {
	return acNo;
    }

    float getAcBal() {
	return acBal;
    }

    void setAcBal(float acBal) {
	this.acBal = acBal;
    }

    Bank(){
	acNo = val++;
	System.out.print("Enter a/c holder name: ");
	acHolder = sc.next();
	System.out.print("Enter initial balance : ");
	acBal = sc.nextFloat();
    }

    abstract void minBalCheck();

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

class SBI extends Bank {
    final int minBal = 1000;
    void minBalCheck() {
	if(getAcBal()< minBal) {
	    System.out.println("Min. Balance limit crossed, so panelty Rs.100 charged");
	    setAcBal(getAcBal()-100);
	}
    }

    void withdraw(int amt) {
	super.withdraw(amt);
	minBalCheck();
    }
}


class BankDemo3 {
    public static void main(String ar[]) {

	System.out.print("Enter total no. of accounts: ");
	int n = Bank.sc.nextInt();
	Bank ac[] = new Bank[n];

	int count=0, i, ano, amt;

	while(true) {
	   System.out.println("\n---------MENU----------");
	   System.out.println("1.Open Account");
	   System.out.println("2.Deposite");
	   System.out.println("3.Withdraw");
	   System.out.println("4.Statement");
	   System.out.println("5.Exit");
	   System.out.print("\nEnter your choice:");
	   int ch = Bank.sc.nextInt();

	   switch(ch) {
	   case 1:
		if(count==n) {
		    System.out.println("Sorry No more a/c can be open");
		} else {
		    ac[count]= new SBI();
		    ac[count].balanceInquiry();
		    count++;
		}		
		break;

	   case 2:
		if(count==0) {
		    System.out.println("No a/c open yet, so plz open it first");
		} else {
		    System.out.print("Enter A/c no. : ");
		    ano = Bank.sc.nextInt();
		    for(i=0; i<count; i++) {
			if(ano == ac[i].getAcNo() ) {
			    System.out.print("Enter amount to be deposited: ");
			    amt = Bank.sc.nextInt();
			    ac[i].deposite(amt);
			    break;
			}			
		    }
		    if(i==count) {
			System.out.println("Invalid A/c No.");
		    }
		}
		break;
	   case 3:
		if(count==0) 
		{
		    System.out.println("No a/c open yet, so plz open it first");
		} else {
		    System.out.print("Enter A/c no. : ");
		    ano = Bank.sc.nextInt();
		    for(i=0; i<count; i++) {
			if(ano == ac[i].getAcNo() ) {
			    System.out.print("Enter amount to be withdrawn: ");
			    amt = Bank.sc.nextInt();
			    ac[i].withdraw(amt);
			    break;
			}			
		    }
		    if(i==count) {
			System.out.println("Invalid A/c No.");
		    }
		}
		break;

	   case 4:
		if(count==0) {
		    System.out.println("No a/c open yet, so plz open it first");
		} else {
		    System.out.print("Enter A/c no. : ");
		    ano = Bank.sc.nextInt();
		    for(i=0; i<count; i++) {
			if(ano == ac[i].getAcNo() ) {
			    ac[i].balanceInquiry();
			    break;
			}			
		    }
		    if(i==count) {
			System.out.println("Invalid A/c No.");
		    }
		}
		break;
		
	   case 5:
		System.exit(0);

	   default:
		System.out.println("Wrong choice");
	   }


	}
    }
}