package multithread;

import java.util.concurrent.TimeUnit;

public class OddEvenPrintMain2 {

	int counter = 1;

	public void printeven() throws Exception {
		synchronized (this) {
			while (counter < 100) {
				if (counter % 2 == 0) {
					System.out.println(Thread.currentThread().getName() + " " + counter);
					counter++;
					notify();
				} else {

					Thread.sleep(1000);
					TimeUnit.SECONDS.sleep(1);
					wait();
				}
			}
		}

	}

	public void printodd() throws Exception {

		synchronized (this) {
			while (counter < 100) {
				if (counter % 2 != 0) {
					System.out.println(Thread.currentThread().getName() + " " + counter);
					counter++;
					notify();
				} else {

					Thread.sleep(1000);
					TimeUnit.SECONDS.sleep(1);
					wait();
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {

		OddEvenPrintMain2 oep = new OddEvenPrintMain2();

		// Thread t1 = new Thread(new Runnable() {
		//
		// @Override
		// public void run() {
		// try {
		// oep.printodd();
		// } catch (Exception e) {
		//
		// e.printStackTrace();
		// }
		// }
		// });

		// Lamda expression
		Thread t3 = new Thread(() -> {
			try {
				oep.printodd();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					oep.printeven();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		t3.start();

		t2.start();

	}

}