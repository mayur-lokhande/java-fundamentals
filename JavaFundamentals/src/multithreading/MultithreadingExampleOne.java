package multithreading;

class Demo extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread is running.");
		}
	}
}

public class MultithreadingExampleOne {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.start();
	}

}
