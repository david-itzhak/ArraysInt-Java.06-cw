package telran.util.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysTests {

	@Test
	void testArrays() {
		int [] ar = new int [3];
		ar[0] = 10;
		ar[1] = -100;
		ar[2] = 5;
//		Arrays.sort(ar);
//		System.out.println(Arrays.toString(ar));
		
		int [] ar1 = {10, 5, 7};
		int [] ar2 = ar1;
		
		assertTrue(ar1 == ar2);
		
		ar2[1] = 100;
		assertTrue(ar1 == ar2);
		int [] ar3 = Arrays.copyOf(ar1, ar1.length);
		System.out.println(Arrays.toString(ar3));
		ar[2] = 700;
		assertFalse(700 == ar2[2]);
		
		int [] ar4 = new int[ar1.length];
		
		System.arraycopy(ar1, 0, ar4, 0, ar1.length);
		assertFalse(ar1 == ar4);
		assertArrayEquals(ar4, ar1);
		
		
	}

}
