package multithread;

public class Thread1 extends Thread {

	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {

		Thread1 ob1 = new Thread1();
		ob1.start();

	}
}
