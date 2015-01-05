class A {
    int a=11;
    static void m1() {
	System.out.println("Parent static method");
    }
    void m2() {
	System.out.println("Parent normal m2() method");
    }
    void m3() {
	System.out.println("Parent normal m3() method");
    }
}

class B extends A {
    int a=22, b=33;
    static void m1() {
	System.out.println("Child static method");
    }

    void m2() {
	System.out.println("Child normal m2() method");
    }
    void m4() {
	System.out.println("Child normal m4() method");
    }
}

class RuntimeDemo {
    public static void main(String ar[]) {
	A a1 = new A();
	System.out.println("a = "+a1.a);//A
	a1.m1();//A
	a1.m2();//A
	a1.m3();//A
	
	System.out.println("-----------------------------------");

	B b1 = new B();	
	System.out.println("a = "+b1.a);//B
	System.out.println("b = "+b1.b);//B
	b1.m1();//B
	b1.m2();//B
	b1.m3();//A
	b1.m4();//B

	System.out.println("-----------------------------------");

	A a2 = new B();	//or A a2 = (A) new B();  //Up-Casting
	System.out.println("a = "+a2.a);//A
	//System.out.println("b = "+a2.b);
	a2.m1();//A
	a2.m2();//B
	a2.m3();//A
	//a2.m4();
	
	System.out.println("-----------------------------------");

	//B b2 = new A();	//Compillation fail
	//B b2 = (B) new A();	//ClassCastException
	//B b2 = a1;		//Compillation fail
	//B b2 = (B) a1;	//ClassCastException
	//B b2 = a2;		//Compillation fail

	B b2 = (B) a2;		//Down-Casting
	System.out.println("a = "+b2.a);//B
	System.out.println("b = "+b2.b);//B
	b2.m1();//B
	b2.m2();//B
	b2.m3();//A
	b2.m4();//B
    }
}