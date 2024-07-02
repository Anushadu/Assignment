/*6.Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is
missing from the array.*/
public class MissingNumber {
	private static int findMissinfNumber(int[] arr, int n) {
		int arraySum = 0;
		int actualSum = (n*(n+1))/2;
		for(int i: arr) arraySum += i;
		
		if(actualSum == arraySum) return 0;
		else return actualSum - arraySum;
	}

	public static void main(String[] args) {

		int[] arr = {0,1,2,3,4,6,7,8,9};
		int n = 9;
		
		System.out.println("Missing Number: "+ findMissinfNumber(arr,n));
		
	}


}



