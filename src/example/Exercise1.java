package example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise1 {

	public static void main(String[] args) {

		List<Persona> lista = Arrays.asList(
								new Persona("Alberto", "Rossi", 12),
								new Persona("Gianni", "Blu", 63),
								new Persona("Romano", "Arancione", 52),
								new Persona("Sandra", "Bianco", 77)
								);
				
		//1 - Sort by last name
		Collections.sort(lista, (p1, p2) -> p1.getCognome().compareTo(p2.getCognome()));
		
		//2 - Create a method that print each attribute
		for(Persona p:lista){
			print(x -> x.toString(), p);
		}
		
		//3 - Create method that print all with cognome starts with B
		for(Persona p:lista){
			printB(x -> x.getCognome().startsWith("B"), p);
		}
		
	}
	
	public static void print(LambdaPrintPersona l, Persona p){
		System.out.println(l.printPersona(p));
	}
	//test
	public static void printB(LambdaCheckPersona l, Persona p){
		if(l.checkPersona(p)){
			System.out.println(p);
		};
	}

}
