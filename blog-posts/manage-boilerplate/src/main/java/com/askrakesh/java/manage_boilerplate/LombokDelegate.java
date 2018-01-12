package com.askrakesh.java.manage_boilerplate;

import lombok.RequiredArgsConstructor;
import lombok.experimental.Delegate;

@RequiredArgsConstructor
public class LombokDelegate implements Adapter {
	@Delegate
	private final Adaptee instance;

	public static void main(String[] args) {
		LombokDelegate impl = new LombokDelegate(new Adaptee());
		impl.display();
	}
}

interface Adapter {
	public void display();
}

class Adaptee {
	public void display() {
		System.out.println("In Adaptee.display()");
	}
}
