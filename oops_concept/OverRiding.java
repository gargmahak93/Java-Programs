class A {
    int a=11;
    static void m1() {
	System.out.println("Parent static method");
    }
    void m2() {
	System.out.println("Parent normal method");
    }
}
class B extends A {
    int a=22;
    static void m1() {
	System.out.println("Child static method");
    }

    void m2() {
	System.out.println("Child normal method");
    }
}

class OverRiding {
    public static void main(String ar[]) {
	A a1 = new A();
	System.out.println("a = "+a1.a);//A
	a1.m1();//A
	a1.m2();//A

	System.out.println("-----------------------------------");

	B b1 = new B();	
	System.out.println("a = "+b1.a);//B
	b1.m1();//B
	b1.m2();//B

	System.out.println("-----------------------------------");

	A a2 = new B();	
	System.out.println("a = "+a2.a);//A
	a2.m1();//A
	a2.m2();//B

    }
}