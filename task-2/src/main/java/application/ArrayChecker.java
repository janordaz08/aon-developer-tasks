package application;


public class ArrayChecker {
	
	public static <T> int subArrayIndexFinder(T[] haystack, T[] needle) {
		
		if(haystack == null || needle == null) {
			throw new RuntimeException("Haystack and needle must not be null");
		}
		
		if(needle.length > haystack.length) {
			throw new RuntimeException("The needle length must be less than or equal to the haystack length");
		}
	
		int currentNeedleIndex = 0;
		
		int possibleIndex = -1;
		
		for(int currentHaystackIndex = 0; currentHaystackIndex < haystack.length; currentHaystackIndex++) {
			if(needle[currentNeedleIndex] == haystack[currentHaystackIndex]) {
				
				if(possibleIndex == -1) {
					possibleIndex = currentHaystackIndex;
				}
				
				currentNeedleIndex++;
				
			} else {
				
				currentNeedleIndex = 0;
				possibleIndex = -1;
			}
			
			if(currentNeedleIndex == needle.length) {
				break;
			}
			
		}
		
		return possibleIndex;
	}
	
	

}
