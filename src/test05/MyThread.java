package test05;

public class MyThread extends Thread {
	public MyThread() {
		System.out.println("构造方法："+Thread.currentThread().getName());
	}
	public void run() {
		System.out.println("run方法："+Thread.currentThread().getName());
	}
}
