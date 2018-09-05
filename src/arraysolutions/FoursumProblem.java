package arraysolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoursumProblem {

	public static void main(String[] args)
	{
		int[] arr={1, 0, -1, 0, -2, 2};
		System.out.println(fourSum(arr, 0));
	}
	
    static List<List<Integer>> fourSum(int[] nums, int target) {
        
    	Arrays.sort(nums);
    	List<List<Integer>> result=new ArrayList<List<Integer>>();
    	
    	for(int i=0;i<nums.length-3;i++)
    	{
    		
    		for(int j=i+1;j<nums.length-2;j++)
    		{
    			
    			for(int k=j+1;k<nums.length-1;k++)
    			{
    				
    				int l=nums.length-1;
    				
    				while(k<l)
    				{
    					int sum=nums[i]+nums[j]+nums[k]+nums[l];
    					if(sum<target)
    					{
    						k++;
    					}
    					else if(sum>target){
    						l--;
    					}
    					else{
    						System.out.println("target is sum");
    						ArrayList<Integer> elements=new ArrayList<Integer>();
    						elements.add(nums[i]);
    						elements.add(nums[j]);
    						elements.add(nums[k]);
    						elements.add(nums[l]);
    						result.add(elements);
    						k++;
    						l--;
    						
    						while(k<l && nums[l]==nums[l+1] ){
    	                        l--;
    	                    }
    	 
    	                    while(k<l && nums[k]==nums[k-1]){
    	                        k++;
    	                    }
    					}
    					
    				}
    				
    				
    				
    			}
    			
    			
    			
    		}
    	}
    	
    	return result;
    }
}
