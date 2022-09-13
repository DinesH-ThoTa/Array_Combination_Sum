import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combination-sum-iii/
public class combination_sum3 {

public static void main(String[] args) {
		
		List<List<Integer>> ans=new ArrayList<>();
		List<Integer> op=new ArrayList<Integer>();
		int[] nums= {1,2,3,4,5,6,7,8,9};
		System.out.println(combination(ans,op,nums, 7, 0,0,3));
	}


static List<List<Integer>> combination(List<List<Integer>> ans,List<Integer> op,int[] nums, int target,int sum,int start,int end)
	{
		if(sum>target)
		{
//			System.out.println(sum); 
			return ans;
		}
	
		if(sum==target)
		{
			if(op.size()==end)
				ans.add(op);
			return ans;
		}
	

		for(int i=start;i<nums.length;i++)
		{
			op.add(nums[i]);
			sum=sum+nums[i];
			combination(ans,new ArrayList<>(op),nums, target,sum,i+1,end);//taking i+1 as element should occur only once
			sum=sum-nums[i];
			op.remove(op.size()-1);
		
		}
		return ans;
	}
}
