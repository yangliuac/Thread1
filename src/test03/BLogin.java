package test03;

public class BLogin extends Thread{
	public void run(){
		LoginServlet.doPost("b", "bb");
	}
}
