/*5.Write a method to rotate an array of integers by k steps to the right. For example, with k = 3, an
array [1, 2, 3, 4, 5, 6, 7] becomes [5, 6, 7, 1, 2, 3, 4]. You must do this in-place with O(1) extra
space.*/

public class RotateArray {

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 4, 5, 6, 7};
	        int k = 3;
	        
	        rotate(nums, k);
	        
	        for (int num : nums) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    public static void rotate(int[] nums, int k) {
	        int n = nums.length;
	        
	        k = k % n;
	        reverse(nums, 0, n - 1);
	        reverse(nums, 0, k - 1);
	        reverse(nums, k, n - 1);
	    }
	    
	    public static void reverse(int[] nums, int start, int end) {
	        while (start < end) {
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	            start++;
	            end--;
	        }
	    }
	}
