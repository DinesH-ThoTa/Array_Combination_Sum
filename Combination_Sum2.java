import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/combination-sum-ii/
public class Combination_Sum2 {

	public static void main(String[] args) {
		int[] nums= {10,1,2,7,6,1,5};
		List<List<Integer>> ans=new ArrayList<List<Integer>>();
		List<Integer> op=new ArrayList<Integer>();
//		combination(ans, op, nums, 8, 0, 0)
		Arrays.sort(nums);
		System.out.println(combination(ans, op, nums,8, 0, 0));
	}
 
	static List<List<Integer>> combination(List<List<Integer>> ans,List<Integer> op,int[] nums,int target,int start,int sum) {
		if(sum==target) {
			ans.add(op);
			return ans;
		}
		if(sum>target) {
			return ans;
		}
		
		for(int i=start;i<nums.length;i++) {
			if(i>start  && nums[i-1]==nums[i]) {
				continue;
			}
			op.add(nums[i]);
			sum=sum+nums[i];
			combination(ans,new ArrayList<>(op),nums, target,i+1,sum);
			sum=sum-nums[i];
			op.remove(op.size()-1);
		}
		return ans;
	}
	
}
