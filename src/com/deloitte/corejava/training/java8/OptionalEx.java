package com.deloitte.corejava.training.java8;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		String name = null;
		name = "Mihiraan";
		Optional<String> optional = Optional.ofNullable(name);

		if (optional.isPresent()) {
			System.out.println(optional.get());
		} else {
			System.out.println("No value present");
		}

		optional.ifPresent(n -> System.out.println("length of the name"+n.length()));

	}

}
