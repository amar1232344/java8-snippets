package com.interview.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergedSortedArray {
	public static void main(String[] args) {
		int[] array1 = { 1, 3, 5, 7 };
		int[] array2 = { 2, 4, 6, 8 };
		int[] sortedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
		System.out.println(Arrays.toString(sortedArray));
	}
}
