package com.interview.java8;

import java.util.Arrays;

public class RemoveDuplicateArray {
	public static void main(String[] args) {
		int[] array = {2, 4, 2, 3, 178 };
		int[] newArray = Arrays.stream(array).distinct().toArray();
		System.out.println(newArray);

	}
}
