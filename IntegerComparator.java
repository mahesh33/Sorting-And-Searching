package com.practice.sortingandsearching;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {

		return a - b;
		/*
		 * a - b => When i compare the numbers 'a' and 'b' if they are same(a =
		 * b) and when i subtract them(a-b) then: there should be 0. if a > b
		 * then: the value will be positive i.e ( >1 ) else a < b then: the
		 * value will be negative i.e ( <1 )
		 */
	}

}
