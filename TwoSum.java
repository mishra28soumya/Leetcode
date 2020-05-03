/* Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]. */





class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length <=1){
            return null;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        int counter = nums.length-1;
        while(counter>=0){
            int complement = target - nums[counter];
            if(map.containsKey(complement) && map.get(complement)!=counter){
                
                return new int[] {map.get(complement), counter};
            }
            counter --;
        }
        throw new IllegalArgumentException("Key not found");
    }
}
