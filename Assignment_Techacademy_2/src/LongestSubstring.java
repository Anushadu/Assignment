/*2. Write a method to find the length of the longest substring without repeating characters in a
given string*/
import java.util.HashMap;
public class LongestSubstring {
 public static int lengthOfLongestSubstring(String s) {
	        HashMap<Character, Integer> charMap = new HashMap<>();
	        
	        int maxLength = 0;
	        int start = 0;
	        
	        for (int end = 0; end < s.length(); end++) {
	            char currentChar = s.charAt(end);
	            
	            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= start) {
	                start = charMap.get(currentChar) + 1;
	            }
	            
	            charMap.put(currentChar, end);
	            
	            maxLength = Math.max(maxLength, end - start + 1);
	        }
	        
	        return maxLength;
	    }

	    public static void main(String[] args) {
	        String input = "ABABCAB";
	        int longestLength = lengthOfLongestSubstring(input);
	        System.out.println("Longest length of substring without repeating characters: " + longestLength);
	    }
	}



