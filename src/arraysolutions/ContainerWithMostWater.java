package arraysolutions;

public class ContainerWithMostWater {

	public static void main(String[] args)
	{
		ContainerWithMostWater cw=new ContainerWithMostWater();
		int[] arr={9,8,6,2,5,4,8,3,7,5};
		System.out.println("max area is " +cw.maxArea(arr));
		
	}
	
	
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxArea=0;
    	while(i<j)
    	{
    		int area=(j-i)*Math.min(height[i],height[j]);
    		System.out.println(" area is "+area);
    		maxArea = Math.max(maxArea, area);
            if (height[i] < height[j])
                i++;
            else
                j--;
    		
    		System.out.println(" i "+i+" j "+j);
    	}
    	
    	return maxArea;
    }
}
