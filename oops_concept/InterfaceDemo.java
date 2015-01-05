interface I1 {
    int a = 45;
    void m1();
}

class Demo implements I1 {
    public void m1() {
	System.out.println("m1() method");
    }
}


class InterfaceDemo{
    public static void main(String args[]) {

	I1 obj = new Demo();
	obj.m1();

	System.out.println("a = "+obj.a);

    }
}