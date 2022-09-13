import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/3sum/
public class Sum3 {

	public static void main(String[] args) {
		
		int[] nums= {-1,0,1,2,-1,-4};
		
//		System.out.println(sum(nums));
//		sum(nums);
		System.out.println(method2(nums));
		
		
	}
	static List<List<Integer>> sum(int[] nums ){
		
		Arrays.sort(nums);
		Set<List<Integer>> set=new HashSet<List<Integer>>();
		for(int i=0;i<nums.length-2;i++) {
			int a_pointer=i+1;
			int b_pointer=nums.length-1;
			while(a_pointer<b_pointer) {
	
				if(nums[i]+nums[a_pointer]+nums[b_pointer]==0) {
					List<Integer> output=new ArrayList<Integer>();
					output.add(nums[i]);
					output.add(nums[a_pointer]);
					output.add(nums[b_pointer]);
					
					if(!set.contains(output)) {
						set.add(output);
					}

					a_pointer++;
					b_pointer--;
				}
				else if(nums[i]+nums[a_pointer]+nums[b_pointer]<0) {
					a_pointer++;
				}
				else {
					b_pointer--;
				}
			}
		}
		
		List<List<Integer>> op=new ArrayList<List<Integer>>();
		for(List<Integer> l : set)
		{
			op.add(l);
		}
		
		System.out.println(op);
		return op;
	}
	
	
	static List<List<Integer>> method2(int[] nums)
	{
		Arrays.sort(nums);
		List<List<Integer>> ans=new ArrayList<>();
		
		for(int i=0;i<nums.length-2;i++) {
			if(i>0 && nums[i] == nums[i-1])
				continue;
			int low=i+1;
			int high=nums.length-1;
			int sum=0-nums[i]; //as the target is 0
			while(low < high) {
				if(nums[low]+nums[high] == sum) {
					ans.add(Arrays.asList(nums[i],nums[low],nums[high]));
					while(low < high && nums[low] == nums[low+1]) low++;
                    while(high > low && nums[high] == nums[high-1]) high--;
					high--;
					low++;
				}
				else if(nums[low]+nums[high] > sum) {
					high--;
				}
				else low++;
			}
		}
		
		return ans;
		
	}

}
