class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] b=new int[2];
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(target-nums[i])){
                b[0]=h.get(target-nums[i]);
                b[1]=i;
                break;
            }
            else{
                h.put(nums[i],i);
            }
        }
        return b;
    }
}