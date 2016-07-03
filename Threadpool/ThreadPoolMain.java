package threads.Threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {

	public static void main(String[] args) {
//		Creating only two threads in the thread pool for better understanding of the concept.
		ExecutorService es = Executors.newFixedThreadPool(2);
		Runnable w1 = new Worker1();
		Runnable w2 = new Worker2();
		Runnable w3 = new Worker3();
		Runnable w4 = new Worker4();
		Runnable w5 = new Worker5();
		Runnable w6 = new Worker6();
		Runnable w7 = new Worker7();
		Runnable w8 = new Worker8();

		es.execute(w1);
		es.execute(w2);
		es.execute(w3);
		es.execute(w4);
		es.execute(w5);
		es.execute(w6);
		es.execute(w7);
		es.execute(w8);
		
		//It is always necessary to shutdown the executorService otherwise it'll keep executing
//		even after the main() Thread execution completion
		es.shutdown();

//All the 10 threads will be executed at a time which is taking more stack memory.
		
//		Thread t1 = new Thread(new Worker1());
//		t1.start();
//		Thread t2 = new Thread(new Worker2());
//		t2.start();
//		Thread t3 = new Thread(new Worker3());
//		t3.start();
//		Thread t4 = new Thread(new Worker4());
//		t4.start();
//		Thread t5 = new Thread(new Worker5());
//		t5.start();
//		Thread t6 = new Thread(new Worker6());
//		t6.start();
//		Thread t7 = new Thread(new Worker7());
//		t7.start();
//		Thread t8 = new Thread(new Worker8());
//		t8.start();

	}

}
