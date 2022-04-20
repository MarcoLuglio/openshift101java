package com.openshiftexample;

/**
 * Hello world!
 */
public final class App {

	private App() {
	}

	/**
	 * Says hello to the world.
	 * @param args The arguments of the program.
	 */
	public static void main(String[] args) {
		while (true) {
			System.out.println("Hello World!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Unable to sleep. ⊙_⊙");
				e.printStackTrace();
			}
		}
	}

}
