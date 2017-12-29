package example;

public class Runnable {

	public static void main(String[] args) {
		Thread t = new Thread(() -> System.out.println("print"));
		t.run();
	}

}
