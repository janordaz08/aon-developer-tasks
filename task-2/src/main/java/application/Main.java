package application;



public class Main {
	
	public static void main(String[] args) {
		
		Integer[] hayStack = {4,9,3,7,8};
		
		Integer[] needle = {9,3,7,1,1};
		
		int foundIndex = ArrayChecker.subArrayIndexFinder(hayStack, needle);
		
		System.out.println(foundIndex);
		
	}

}
