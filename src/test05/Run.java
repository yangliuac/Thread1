package test05;

public class Run {
	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		Thread thread = new Thread(c);
		thread.setName("A");
		thread.start();
	}
}
