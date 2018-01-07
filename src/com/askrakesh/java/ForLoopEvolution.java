package com.askrakesh.java;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForLoopEvolution {
	public static void main(String[] args) {
		List<String> actors = Arrays.asList("Jack Nicholson", "Marlon Brando", "Robert De Niro", "Al Pacino",
				"Tom Hanks", "--");

		// Start
		for (int i = 0; i < actors.size(); i++) {
			System.out.println(actors.get(i));
		}

		// Java 1.2
		for (Iterator<String> iterator = actors.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}

		// Java 5
		for (String actor : actors) {
			System.out.println(actor);
		}

		// Java 8
		actors.forEach(new Consumer<String>() {
			public void accept(String actor) {
				System.out.println(actor);
			}
		});

		// Java 8 - Lambda
		actors.forEach((e) -> {
			System.out.println(e);
		});

		actors.forEach(e -> System.out.println(e));

		// Method Reference
		actors.forEach(System.out::println);

		// Parallel Streams
		// actors.parallelStream()
		// .forEach(System.out::println);

	}
}
