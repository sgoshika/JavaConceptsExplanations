package threads.Threadpool;

import java.util.concurrent.SynchronousQueue;

public class Worker6 implements Runnable {

	@Override
	public void run() {
		Thread.currentThread().setName("Worker6");
		System.out.println(Thread.currentThread().getName()+"start");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"End");
	}
}
