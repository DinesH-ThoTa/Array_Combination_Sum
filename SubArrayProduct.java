
public class SubArrayProduct {

	public static void main(String[] args) {
		int nums[]= {10,5,2,6};
		System.out.println(count(nums,10));
	}
	
	public static int count(int[] nums, int k) {
		int a_pointer=0;
		int b_pointer=0;
		int product=1;
		int count=0;
		while(b_pointer < nums.length) {
			product*=nums[b_pointer];
			while(product >= k) {
				product/=nums[a_pointer];
				a_pointer++;
			}
			count+=b_pointer - a_pointer+1;
			b_pointer++;
		}
		return count;
	}

}
