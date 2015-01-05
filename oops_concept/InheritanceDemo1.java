class A {
   private int a=34;
   int b=45;

   private void m1() {
	System.out.println("private m1()");
	System.out.println("a in parent = "+a);
	System.out.println("b in parent = "+b);
   }

   void m2() {
	System.out.println("m2() method");
	m1();
   }
}

class B extends A {
   int x=67;

   void m3() {
	System.out.println("m3() method");
//	System.out.println("a in child = "+a);
	System.out.println("b in child = "+b);
	System.out.println("x in its class= "+x);
//	m1();
	m2();
   }
}

class InheritanceDemo {
   public static void main(String args[]) {
	A a1 = new A();
	System.out.println("b in Main = "+a1.b);
	a1.m2();

	System.out.println("--------------------------");

	B b1 = new B();
	System.out.println("b in Main = "+b1.b);
	System.out.println("x in Main = "+b1.x);
	b1.m2();
	b1.m3();
   }
}