import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunningMedian {

	public static void main(String[] args) {
		

		int[] nums= {1,2,3,4};
		System.out.println(median(nums, 2));
		
		List<Double> ans=median(nums, 2);
		Double[] arr=new Double[ans.size()];
		int i=0;
		for(Double d: ans) {
			
			arr[i]=d;
			i++;
		}
	
	}

	// Naive solution
	public static List<Double> median(int[] nums, int k) {
		
		int start=0;
		//int end=k-1;
		List<Double> ans = new ArrayList<>();
		for(int i=k-1;i<nums.length;i++) {
			
			ans.add(sort(nums,start,i));
			start++;
		}
		return ans;
	}

	private static double sort(int[] nums, int start, int end) {
		
		int[] arr=new int[end-start+1];
		int k=0;
		for(int i=start;i<=end;i++)
		{
			arr[k]=nums[i];
			k++;
		}
		
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		if(arr.length%2==0) {
			return (double)(arr[arr.length/2]+arr[(arr.length/2)-1])/2;
		}
		else
			return (double)arr[arr.length/2];
	}
}
