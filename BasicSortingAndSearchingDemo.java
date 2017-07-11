package com.practice.sortingandsearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BasicSortingAndSearchingDemo {
	/*
	 * Note: To do binary search we need to sort the numbers first
	 */
	public static void main(String[] args) {

		MethodsForSortingAndSearching ms = new MethodsForSortingAndSearching();

		Random generator = new Random();
		int found;

		List<Integer> numbersList = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			numbersList.add(generator.nextInt(100) + 1);
		}

		System.out.println("\t!!! UNSORTED !!!\n");

		// Print numbers:
		ms.printNumbers(numbersList);

		// Linear search:
		ms.findNumber(numbersList, 50);

		// Sort:
		Collections.sort(numbersList, new IntegerComparator());
		System.out.println("\t!!! SORTED !!!\n");

		// Print numbers after sorting:
		ms.printNumbers(numbersList);

		// Binary Search:
		System.out.println("Using binary search...\n");
		ms.findNumber1(numbersList, 50);

	}
}
