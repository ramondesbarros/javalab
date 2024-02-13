package br.com.javalab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("John");
		names.add("Paul");
		names.add("George");
		names.add("Ringo");
		
		System.out.println("--> " + names);

		int remove = names.size();

		remove = remove - 1;

		while (remove >= 0) {

			names.remove(remove);

			remove = remove - 1;

		}

		System.out.println("--> " + names);
	}
}
