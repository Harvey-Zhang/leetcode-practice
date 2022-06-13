package easy;

import java.util.HashMap;
import java.util.Map;

/**
 *Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
public class TwoNumAdd {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
//        int[] result = twoSum(nums, 6);

        int[] result = twoSumV2(nums, 6);
        System.out.print( result[0]);
        System.out.print(",");
        System.out.println( result[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]+nums[j] == target){
                    result[0] =i;
                    result[1] =j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] twoSumV2(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; map.put(nums[i],i ),i++) {
            if(map.containsKey(target-nums[i])){
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                return result;
            }

        }
        return result;
    }
}
