import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervals {
	
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(merge(new int[][] {{1,3},{2,6},{8,10},{15,18}})));
	}

	public static int[][] merge(int[][] nums) {
        
        Arrays.sort(nums,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));//sorting the 2D array
        
        List<int[]> ans = new ArrayList<int[]>();//for storing output
        int start =nums[0][0];//take start as first interval start
        int end = nums[0][1];//take end as first interval end
        for(int i = 1; i<nums.length; i++){
            
            int curr_s = nums[i][0];//current element will start from 1 index
            int curr_e = nums[i][1];
            if(end >= curr_s){//here intervals are overlapping so update new end
                end = Math.max(end, curr_e);
            }
            else
            {//if no further overlap just add start and end
                ans.add(new int[]{start,end});
                start = curr_s;//update start and end after adding the overlapped interval
                end = curr_e;
            }
        }
        ans.add(new int[] {start,end});//when the loop ends we need to add the last interval
        return ans.toArray(new int[ans.size()][]);
    }
}
