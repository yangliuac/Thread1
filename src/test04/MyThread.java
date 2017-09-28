package test04;

public class MyThread extends Thread{
	private static int i = 5;
	synchronized public void run() {
		System.out.println("i="+(i--)+" threadName="+Thread.currentThread().getName());
	}
}
