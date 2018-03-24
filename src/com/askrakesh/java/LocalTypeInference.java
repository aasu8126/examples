package com.askrakesh.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;

public class LocalTypeInference {

	public static void main(String[] args) throws Exception {

		// pre Java 10
		// List<Actor> actors = List.of(new Actor());
		var actors = List.of(new Actor()); // In Java10

		var list = new ArrayList<String>(); // infers ArrayList<String>
		var stream = list.stream(); // infers Stream<String>

		readFile();

		var var = 5; // syntactically correct, var is the name of the variable

		var numbers = List.of(1, 2, 3, 4, 5); // inferred value ArrayList<String>
		// Index of Enhanced For Loop
		for (var number : numbers) {
			System.out.println(number);
		}
		// Local variable declared in a loop
		for (var i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		// Limitations

		// Cannot use 'var' on variables without initializer
		// var x; // uncommenting this line will result in a compile error
		// x = 5;
		String str;
		str = "Rakesh";

		// Cannot be used for multiple variable definition
		// var x = 5, y = 10; // uncommenting this line will result in a compile error

		int x = 5, y = 10;

		// Null cannot be inferred to a type
		// var author = null; // uncommenting this line will result in a compile error
		String author = null;

		// var cannot have extra array dimension brackets
		// var actorArr[] = new Actor[10]; // uncommenting this line will result in a
		// compile error
		Actor actorArr[] = new Actor[10];

		// Expression containing lambda cannot be inferred

		// var min = (a, b) -> a < b ? a : b; // uncommenting this line will result in a
		// compile error
		BiFunction<Integer, Integer, Integer> min = (a, b) -> a < b ? a : b;

		// Expression containing Method reference cannot be inferred

		// var minimum = Math::min;// uncommenting this line will result in a compile
		// error
		BiFunction<Integer, Integer, Integer> minimum = Math::min;

		// Array initializers cannot be inferred as a type

		// var nums = { 1, 2, 3, 4, 5 };// uncommenting this line will result in a
		// compile error
		int nums[] = { 1, 2, 3, 4, 5 };

		// Generics cases
		var map1 = new HashMap(); // Inferred as HashMap
		var map2 = new HashMap<>(); // Inferred as HashMap<Object, Object>
		var map3 = new HashMap<String, String>() { // RHS inferred as HashMap<Object, Object>
			int someVar;
		};

		// Anonymous class
		var runnable = new Runnable() {
			@Override
			public void run() {
				var numbers = List.of(5, 4, 3, 2, 1);
				for (var number : numbers) {
					System.out.println(number);
				}
			}
		};
		runThread(runnable);

		// Special Case Non Denotable Type
		var person = new Object() {
			class Name {
				String firstName;
				String lastName;

				public Name(String firstName, String lastName) {
					super();
					this.firstName = firstName;
					this.lastName = lastName;
				}

				public String getFirstName() {
					return firstName;
				}

				public void setFirstName(String firstName) {
					this.firstName = firstName;
				}
			}

			Name name;
			Actor actor;

			public String displayName() {
				return name.getFirstName() + " " + name.lastName;
			}
		};
		person.name = person.new Name("Rakesh", "Kumar");
		System.out.println(person.displayName());

	}

	public static void runThread(Runnable runnable) {
		new Thread(runnable).start();
	}

	public static void var() { // syntactically correct, var can be the name of the method
	}

	private static void readFile() throws IOException {
		String fileName = "Sample.txt";
		String line = "";
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();
	}

}

class Actor {
}
