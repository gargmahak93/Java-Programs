abstract class Demo {
    abstract void m1();

    void m2() {
	System.out.println("m2() method");
    }
}

class DemoChild extends Demo {
    void m1() {
	System.out.println("m1() Child method");
    }
}

class AbstractDemo{
    public static void main(String args[]) {
	Demo d1 = new DemoChild();

	d1.m1();
	d1.m2();

    }
}