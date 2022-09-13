import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/4sum/
public class sum4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1000000000,1000000000,1000000000,1000000000};
 		System.out.println(sum(nums,-294967296));
	}
	
	
	static List<List<Integer>> sum(int[] nums, int target){
		List<List<Integer>> ans= new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length-3;i++) {
			if(i>0 && nums[i] == nums[i-1])
				continue;
			for(int j= i+1; j< nums.length-2; j++) {
				if(j>i+1 && nums[j] == nums[j-1])
					continue;
				int low = j+1;
				int high=nums.length-1;
				long init_sum=(nums[i]+nums[j]);//initial sum 
				long sum=((long)target-init_sum);//taking long to avoid integer overflow
				while(low < high) {
					
					if(nums[low]+nums[high]==sum)
					{
						ans.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
						while(low < high && nums[low] == nums[low +1]) low++; 
						while(low < high && nums[high] == nums[high-1]) high--; 
						
						low++;
						high--;
						
					}
					
					else if(nums[low] + nums[high] > sum)
					{
						high--;
					}
					
					else
						low++;
				}
				
			}
		}
		return ans;
	}


	
}
