package chorn.in.th.sample;

public class ThreadFunction {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("inside runnable !");
			}
		});

		thread.run();

		Thread lambdaThread = new Thread(() -> System.out.println("Lambda thread test !!!"));
		lambdaThread.run();
	}

}
