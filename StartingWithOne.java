package com.interview.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingWithOne {
	public static void main(String[] args) {
		List<Integer> numbs = Arrays.asList(12, 14, 17, 19, 23, 26, 89, 45);
		numbs.stream().filter(n->String.valueOf(n).startsWith("1")).collect(Collectors.toList());
		System.out.println(numbs);
	}
	
}
