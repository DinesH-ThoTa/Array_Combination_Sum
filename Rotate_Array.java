import java.util.Arrays;

public class Rotate_Array {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(nums, k);
		System.out.println(Arrays.toString(nums));
	}
	public static void rotate(int[] nums, int k) {
        k %= nums.length;
   reverse(nums, 0, nums.length - 1);//first reverse whole array
       System.out.println(Arrays.toString(nums));
   reverse(nums, 0, k - 1);//reverse first k elements
        System.out.println(Arrays.toString(nums));
   reverse(nums, k, nums.length - 1);//reverse n-k elements
        System.out.println(Arrays.toString(nums));
	}

	public static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
