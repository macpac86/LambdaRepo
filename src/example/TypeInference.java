package example;

public class TypeInference {

	public static void main(String[] args) {
		
		printLambda(s -> s.length(), "Ciao");

	}
	
	public static void printLambda(LambdaLen l, String s){
		System.out.println(l.getLength(s));
	}

}
