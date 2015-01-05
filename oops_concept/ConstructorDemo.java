import java.util.Scanner;

class Demo {
    int a, b, c;
    Scanner ac = new Scanner(System.in);

    Demo() {
	System.out.println("Def. Constructor");
	System.out.println("Enter 3 nos. : ");
	a = ac.nextInt();
	b = ac.nextInt();
	c = ac.nextInt();
    }

    Demo(int a, int b, int c) 
    {
	System.out.println("Para. Constructor");
	this.a = a;
	this.b = b;
	this.c = c;
    }

    Demo( Demo obj) 
    {
	System.out.println("Copy Constructor");
	a = obj.a;
	this.b = obj.b;

	System.out.print("Enter c :");
	c = ac.nextInt();
    }

    void m1(){
	System.out.println("m1() method");
	System.out.println(a + "  "+this.b+"  "+c);
    }   
}

class ConstructorDemo {
    public static void main(String ar[]) {

	Demo d1 = new Demo();
	System.out.println("----------------------------------:");
	//new Demo();
	new Demo().m1();
	System.out.println("----------------------------------:");
	d1.m1();	
	
	System.out.println("----------------------------------:");
	Demo d2 = new Demo(1,2,3);
	d2.m1();

	System.out.println("----------------------------------:");
	Demo d3 = new Demo(d2);	
	d3.m1();

	System.out.println("----------------------------------:");
	Demo d4 = d1;	
	d4.m1();
	

    }
}