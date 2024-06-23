public class Palindrome {
	
	public static boolean checkPalindrome(String tem) {
		for(int i=0; i<tem.length()/2; i++)
			if(tem.charAt(i) != tem.charAt(tem.length()-i-1)) 
				return false;
		return true;
	}

	public static void main(String[] args) {
		String temp = "madam";
		if(checkPalindrome(temp)) 
			System.out.println("Palindrome");
		else
			System.out.println("non-Palindrome");
	}

}