package p1.go1337.merge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;

class SorterTests 
{

	@Test
	void testEmpty() 
	{
		Integer[] nums = new Integer[] {};
		Integer[] exp = nums.clone();
		
		Sorter.sort(nums);
		
		assertArrayEquals(exp, nums);
	}
	
	@Test
	void testNullArray()
	{
		Integer[] nums = null;
		
		assertThrows(NullPointerException.class, () -> { Sorter.sort(nums);});
	}
	
	@Test
	void testOne()
	{
		Integer[] nums = new Integer[] {42};
		Integer[] exp = nums.clone();
		
		Sorter.sort(nums);
		
		assertArrayEquals(exp, nums);
	}
	
	@Test
	void testTwoInOrder()
	{
		Integer[] nums = new Integer[] {21, 36};
		Integer[] exp = nums.clone();
		
		Sorter.sort(nums);
		
		assertArrayEquals(exp, nums);
	}
	
	@Test
	void testTwoNotInOrder()
	{
		Integer[] nums = new Integer[] {36, 21};
		Integer[] exp = nums.clone();
		
		Sorter.sort(nums);
		Arrays.sort(exp);
		
		assertArrayEquals(exp, nums);
	}

	@Test
	void testNegativeNums()
	{
		Integer[] nums = new Integer[] {-3, -2, 9, -2, 19};
		Integer[] exp = nums.clone();
		
		Sorter.sort(nums);
		Arrays.sort(exp);
		
		assertArrayEquals(exp, nums);
	}
	
	@Test
	void testRandomNums()
	{
		final int n = 10000;
		Random randomNum = new Random(189);
		
		Integer[] nums = new Integer[n];
		
		for(int i = 0; i < n; i++)
		{
			nums[i] = randomNum.nextInt(n);
		}
		
		Integer[] exp = nums.clone();
		
		Sorter.sort(nums);
		Arrays.sort(exp);
		
		assertArrayEquals(exp, nums);
	}
	
	@Test
	void testStrings()
	{
		String[] strings = new String[] {"Hello", "Algorithms", "World", "Data Structures", ""};
		String[] exp = strings.clone();
		
		Sorter.sort(strings);
		Arrays.sort(exp);
		
		assertArrayEquals(exp, strings);
	}
	
}
