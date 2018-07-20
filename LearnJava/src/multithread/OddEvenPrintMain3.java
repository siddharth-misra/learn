package multithread;

public class OddEvenPrintMain3 extends Thread {

	static int number = 1;
	static boolean flag = true;

	static Object lock = new Object();

	int remainder;

	public static void main(String[] args) throws Exception {

		OddEvenPrintMain3 t1 = new OddEvenPrintMain3();
		OddEvenPrintMain3 t2 = new OddEvenPrintMain3();

		t1.start();
		t2.start();

	}

	@Override
	public void run() {

		while (number < 11) {

			synchronized (lock) {
				while (number % 2 != remainder) { // wait for numbers other than remainder
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
			}

		}

	}

}