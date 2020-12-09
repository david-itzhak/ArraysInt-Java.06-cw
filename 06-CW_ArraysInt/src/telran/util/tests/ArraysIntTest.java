package telran.util.tests;

import static org.junit.jupiter.api.Assertions.*;
import static telran.util.ArraysInt.*;

import org.junit.jupiter.api.Test;

class ArraysIntTest {

	@Test
	void testAddAtEnd() {
		int ar [] = {10,2,7};
		int num = 100;
		int exp [] = {10,2,7,num};
		assertArrayEquals(exp, add(ar, num));
	}
	
	@Test
	void testAddAtIndex() {
		int ar [] = {10,2,7};
		int num = 100;
		int exp [] = {10,num,2,7};
		assertArrayEquals(exp, add(ar, num, 1));
	}
	
	@Test
	void testRemoveLast() {
		int ar [] = {10,2,7};
		int exp [] = {10,2};
		assertArrayEquals(exp, remove(ar));
		int exp2 [] = {10};
		int ar2 [] = remove(ar);
		assertArrayEquals(exp2, remove(ar2));
	}
	
	@Test
	void testRemoveByIndex() {
		int ar [] = {10,2,7};
		int exp [] = {10,7};
		assertArrayEquals(exp, remove(ar, 1));
		int exp2 [] = {10};
		int ar2 [] = remove(ar, 1);
		assertArrayEquals(exp2, remove(ar2, 1));
		int exp3 [] = {7};
		assertArrayEquals(exp3, remove(ar2, 0 ));
	}
}
