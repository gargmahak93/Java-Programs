class Demo {
   int a, b;

   Demo(int a, int b) {
	this.a = a;
	b = b;
   }

   void show() {
	System.out.println("a = "+a);
	System.out.println("this.a = "+this.a);
	System.out.println("b = "+b);
   }
}

class ThisDemo {
   public static void main(String args[]) {
	Demo d1 = new Demo(12, 23);

	d1.show();

   }
}