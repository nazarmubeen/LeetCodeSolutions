package arraysolutions;

import java.util.Arrays;

public class ThreeSumCloset {

	public static void main(String[] args)
	{
		int[] nums={-1,2,1,-4};
		System.out.println(threeSumClosest(nums,2));
	}
	
	public  static int threeSumClosest(int[] nums, int target) {
	    int min = Integer.MAX_VALUE;
		int result = 0;
		
		//sort array
		Arrays.sort(nums);
	 
		//loop
		for (int i = 0; i < nums.length; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				int diff = Math.abs(sum - target);
	            System.out.println(" a[i] "+nums[i]+" a[j]" +nums[j]+" a[k] "+nums[k]);
				if(diff == 0) return sum;
	 
				if (diff < min) {
					min = diff;
					result = sum;
				}
				if (sum <= target) {
					j++;
				} else {
					k--;
				}
			}
		}
	 
		return result;
	}
}
