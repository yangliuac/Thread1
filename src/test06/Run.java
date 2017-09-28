package test06;

public class Run {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		System.out.println("begin =="+myThread.isAlive());
		myThread.start();
//		Thread.sleep(1000);
		System.out.println("end =="+myThread.isAlive());
		System.out.println("hello gitHub Server");
		System.out.println("hello gitHub User");
	}
}
