/**
 * Created by shilpa on 1/10/2017.
 */
public class RotatedSearch {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,8,1,2,3};
        System.out.println(search(arr,8));
    }
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[low] <= nums[mid]){
                if(target < nums[mid] && target >= nums[low])
                    high = mid-1;
                else{
                    low = mid+1;
                }
            }else{
                if(target > nums[mid] && target <= nums[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
