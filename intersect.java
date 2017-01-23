import java.util.*;

/**
 * Created by shilpa on 1/2/2017.
 */
public class intersect {
    public static void main(String[] args){
        int[] arr1 = {2,1};
        int[] arr2 = {1,2};
        intersect(arr1,arr2);
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i<nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if (nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }
        }
        int[] result = new int[list.size()];
        int k =0;
        for(Integer I : list){
            result[k] = I;
            k++;
        }
        return result;
    }
}
