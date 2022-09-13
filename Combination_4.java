// https://leetcode.com/problems/combination-sum-iv/
public class Combination_4 {

	public static void main(String[] args) {
		int[] nums= {1,2,3};
		System.out.println(count(nums,4, 0, 0));
	}
	
	static int count(int[] nums,int target,int start,int sum)
	{
		int count=0;
		if(sum==target)
		{
//			System.out.println(sum);
			
			return 1;
		}
		
		if(sum>target)
		{
//			System.out.println(sum);
			return 0;
		}
		
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i];
			count+=count(nums, target, i,sum);
			sum-=nums[i];
		}
		return count;
	}

}
