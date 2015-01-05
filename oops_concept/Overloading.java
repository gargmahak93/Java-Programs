class Demo {
    void m1() {
	System.out.println("Zero args");
    }

    void m1(int x) {
	System.out.println("int args");
    }

    int m1(int x, float y) {
	System.out.println("int-float args");
	return 0;
    }
    public void m1(float x, int y) {
	System.out.println("float-int args");
    }
}

class Overloading {
    public static void main(String ar[]) {
	Demo d1 = new Demo();

	d1.m1(34);//int
	d1.m1(); //zero
	d1.m1(45,67.67f);
	d1.m1(2.3f,67);
    }
}