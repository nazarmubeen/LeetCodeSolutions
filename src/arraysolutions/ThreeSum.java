package arraysolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args)
	{
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(numbers(nums));
	}
	
	static List<List<Integer>> numbers(int[] nums)
	{
		Arrays.sort(nums);
		List<List<Integer>> numbers=new  ArrayList<List<Integer>>();
		
		for(int i=0;i<nums.length;i++)
		{
			
		 int j=i+1;
		 int k=nums.length-1;
		 
		 while(j<k)
		 {
			int sum=nums[i]+nums[j]+nums[k];
			System.out.println("sum "+sum);
			if(sum==0)
			{
				System.out.println("sum = 0");
				List<Integer> number=new ArrayList<Integer>();
				number.add(nums[i]);
				number.add(nums[j]);
				number.add(nums[k]);
				numbers.add(number);
				
			}
			
			if(sum<0)
			{
				j++;
			}
			else{
				k--;
			}
			 
		 }
		 
		}
		return numbers;
	}
	
	
}
