package MoveZero;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        if(nums.length == 1 || nums.length == 0){return;}
        int k = 0;
        for(int i = 1; i<nums.length;i++ ){
            if(nums[i] != 0){
                nums[k++] = nums[i];
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
