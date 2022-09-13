import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_ll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int nums[]= {1,2,2};
			Arrays.sort(nums);
	        List<List<Integer>> ans=new ArrayList<List<Integer>>();
	        List<Integer> output=new ArrayList<Integer>();
//	        helper(nums,0,output,ans);
	        System.out.println(helper(nums,0,output,ans));
	}
	public static List<List<Integer>> helper(int[] nums,int i,List<Integer> output,List<List<Integer>> ans)
	    {
	        if(i>=nums.length)
	        {
	            ans.add(output);
	            return ans;
	        }
	        
	        output.add(nums[i]);
	        helper(nums,i+1,new ArrayList<>(output),ans);
	        
	        
	        while(i+1<nums.length && nums[i]==nums[i+1])
	            i++;
	        output.remove(output.size()-1);
	        helper(nums,i+1,new ArrayList<>(output),ans);
	        
	        return ans;
	    }
	}

