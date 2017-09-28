package test01;

public class Run {
	public static void main(String[] args) {
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		a.start();
		b.start();
		c.start();
		/*MyThread myThread = new MyThread();
		Thread a = new Thread(myThread,"A");
		Thread b = new Thread(myThread,"B");
		Thread c = new Thread(myThread,"C");
		a.start();
		b.start();
		c.start();*/
	}
}
