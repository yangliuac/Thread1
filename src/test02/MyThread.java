package test02;

public class MyThread extends Thread {
	private int count = 5;
	synchronized public void run() {
		count--;
		System.out.println("由 "+this.currentThread().getName()+"计算,count="+count);
	}
}
