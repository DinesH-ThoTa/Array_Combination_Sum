import java.util.ArrayList;
import java.util.List;

public class subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> ans=new ArrayList<List<Integer>>();
		List<Integer> op=new ArrayList<Integer>();
		int[] nums= {1,2,3};
	
		System.out.println(	subs(ans, op, nums, 0));
		
	}
	
	static List<List<Integer>> subs(List<List<Integer>> ans, List<Integer> op,int[] nums,int i)
	{
		if(i>=nums.length) {
			ans.add(op);
			return ans;
		}
		
		subs(ans, new ArrayList<Integer>(op), nums, i+1);
		
		op.add(nums[i]);
		subs(ans, new ArrayList<Integer>(op), nums, i+1);
		op.remove(op.size()-1);
				
		return ans;
	}

}
