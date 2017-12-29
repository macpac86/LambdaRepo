package example;

public class Greeter {
	
	public void greet(Greeting greeting){
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		HelloWorld h = new HelloWorld();
		greeter.greet(h);
		
		Greeting lambdaFunction = () -> System.out.println("ciao lambda");
		greeter.greet(lambdaFunction);

	}

}
