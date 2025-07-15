package com.interview.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
	public static void main(String[] args) {
		String str = "Welcome to GFG";
		String Result = Arrays.asList(str.split(" ")).stream().map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(Result);
	}
}
