package view;
import controller.controllerbilheteria;
import java.util.concurrent.Semaphore;

public class viewbilheteria {

	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(1);
		int i=100;
		for (int threadId = 1; threadId <= 300; threadId++) {

		Thread threadP = new controllerbilheteria(threadId, semaforo,i);
		threadP.start();
		}

		}



		}