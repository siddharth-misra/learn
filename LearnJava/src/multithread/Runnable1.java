package multithread;

class Runnable1 implements Runnable {

	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String args[]) {

		Runnable1 m1 = new Runnable1();

		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m1);
		
		t1.start();
		
		t2.start();

		m1.run();
		
	}
}