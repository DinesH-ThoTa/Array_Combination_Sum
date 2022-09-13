
public class SlidingWindow {

	public static void main(String[] args) {
		
		int[] nums= {4,5,1,9};
		
		System.out.println(window(nums,3));
	}
	
	public static int window(int[] nums, int k) {
		
		
		int sum=0;
		int maxSum=0;
		int a_pointer=0;
		int b_pointer=0;
		while(b_pointer<nums.length) {
			
			sum+=nums[b_pointer];
			if(b_pointer - a_pointer == k-1) {
				maxSum=Math.max(maxSum, sum);
				sum=sum-nums[a_pointer];
				a_pointer++;
			}
			b_pointer++;
		}
		return maxSum;
	}

}
