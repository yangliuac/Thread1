package test01;

public class MyThread extends Thread{
	private int count = 5;
	public MyThread(){
	}
	public MyThread(String name){
		super();
		this.setName(name); //设置线程名
	}
	@SuppressWarnings("static-access")
	public void run(){
		super.run();
		while(count>0){
			count--;
			System.out.println
			(" 由 "+this.currentThread().getName()+" 计算，count="+count);
		}
	}
	
}
