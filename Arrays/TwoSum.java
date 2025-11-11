class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer>mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int more = target-a;
            if(mpp.containsKey(more)){
                return new int[]
                {mpp.get(more),i};
            }
            mpp.put(a,i);
        }
        return new int[] {};
    }
}

//time complexity: o(n)
//space complexity: o(n)
//Logic:

1. Ek ek karke array ke elements traverse karte hain.


2. Har element ke liye check karte hain — kya target - nums[i] already map me exist karta hai?

Agar karta hai → matlab wo pair mil gaya 

Agar nahi karta → current number ko map me daal do.//
