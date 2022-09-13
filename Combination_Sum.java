import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum/

public class Combination_Sum {

	public static void main(String[] args) {
		
		List<List<Integer>> ans=new ArrayList<>();
		List<Integer> op=new ArrayList<Integer>();
		int[] nums= {1,2,3};
//		combination(ans,op,nums, 7, 0,0);
		System.out.println(combination(ans,op,nums, 4, 0,0));
	}

	static List<List<Integer>> combination(List<List<Integer>> ans,List<Integer> op,int[] nums, int target,int sum,int start)
	{
		if(sum>target)
		{
//			System.out.println(sum); 
			return ans;
		}
		
		if(sum==target)
		{
//			System.out.println(sum);
			ans.add(op);
			return ans;
		}
		

		for(int i=start;i<nums.length;i++)//here we are taking i from start as we need unique combinations
		{
			op.add(nums[i]);
			sum=sum+nums[i];
			combination(ans,new ArrayList<>(op),nums, target,sum,i);//taking i as element can occur more thanm once
			sum=sum-nums[i];
			op.remove(op.size()-1);
			
		}
		return ans;
	}
}
