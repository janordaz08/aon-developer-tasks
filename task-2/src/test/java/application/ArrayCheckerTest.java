package application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ArrayCheckerTest {
	
	@Test
	public void findIntegerSubArrayTest() {
		
		Integer[] hayStack = {4,9,3,7,8};
		
		Integer[] needle = {9};
		
		int foundIndex = ArrayChecker.subArrayIndexFinder(hayStack, needle);
		
		assertEquals(1, foundIndex);
		
	}
	
	@Test
	public void findStringSubArrayTest() {
		
		String[] hayStack = {"a", "b", "c", "d", "e", "f"};
		
		String[] needle = {"d", "e", "f"};
		
		int foundIndex = ArrayChecker.subArrayIndexFinder(hayStack, needle);
		
		assertEquals(3, foundIndex);
		
	}
	
	@Test
	public void nullHaystackOrNeedleTest() {
		
		String[] hayStack = null;
		
		String[] needle = {"d", "e", "f"};
		
		assertThrows(RuntimeException.class, () -> ArrayChecker.subArrayIndexFinder(hayStack, needle));
		
		String[] hayStack2 = {"a", "b", "c", "d", "e", "f"};
		
		String[] needle2 = null;
		
		assertThrows(RuntimeException.class, () -> ArrayChecker.subArrayIndexFinder(hayStack2, needle2));
		
	}
	
	@Test
	public void notFindStringSubArrayTest() {
		
		String[] hayStack = {"a", "b", "c", "d", "e", "f"};
		
		String[] needle = {"a", "b", "f"};
		
		int foundIndex = ArrayChecker.subArrayIndexFinder(hayStack, needle);
		
		assertEquals(-1, foundIndex);
		
	}
	
	@Test
	public void notFindIntegerSubArrayTest() {
		
		Integer[] hayStack = {4,9,3,7,8};
		
		Integer[] needle = {1,2,3};
		
		int foundIndex = ArrayChecker.subArrayIndexFinder(hayStack, needle);
		
		assertEquals(-1, foundIndex);
		
	}
	
	@Test
	public void longerNeedleThanHaystackTest() {
		
		String[] hayStack = {"d", "e"};
		
		String[] needle = {"d", "e", "f"};
		
		assertThrows(RuntimeException.class, () -> ArrayChecker.subArrayIndexFinder(hayStack, needle));
		
	}

}
