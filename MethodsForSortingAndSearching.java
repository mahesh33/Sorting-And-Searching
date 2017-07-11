package com.practice.sortingandsearching;

import java.util.Collections;
import java.util.List;

public class MethodsForSortingAndSearching {

	/**
	 * Enumerates(list/count/calculates) the ArrayList, printing out the numbers
	 * 
	 * @param numbers
	 *            the ArrayList to print.
	 */
	public void printNumbers(List<Integer> numbers) {

		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(" " + numbers.get(i));
		}
		System.out.println("\n");
	}

	// Linear search
	/**
	 * This code implements a linear search algorithm
	 * 
	 * @param numbers
	 *            the ArrayList to search
	 * @param target
	 *            the value to find
	 * @return returns the index of the target in the ArrayList, otherwise -1
	 */
	public void findNumber(List<Integer> numbers, Integer target) {
		int found = -1;

		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) == target) {
				found = i;
				break;
			}
		}

		if (found == -1) {
			System.out.println("The number was not found..\n");
		} else {
			System.out.println("The number 50 was found at position " + found + "\n");

		}

	}

	/**
	 * This code implements a binary search algorithm
	 * 
	 * @param numbers
	 *            the ArrayList to search
	 * @param target
	 *            the value to find
	 * @return returns output using binary search
	 */
	public void findNumber1(List<Integer> numbers, Integer target) {

		int found = Collections.binarySearch(numbers, target, new IntegerComparator());

		if (found < 0) {
			System.out.println("The number was not found..\n");
		} else {
			System.out.println("The number 50 was found at position " + found + "\n");

		}
	}
}
