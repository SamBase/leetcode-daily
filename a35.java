class Solution {
    public int searchInsert(int[] nums, int target) {
        int min=0,max=nums.length-1,mid;

        while(min<nums.length && max>-1 && min<max){
            mid= (max+min)/2;
            if(nums[mid]==target){return target;}
            
            if(nums[mid] > target){
                if(max==mid){max-=1;}
                else{max=mid;}
            }else{
                if(min == mid){ min+=1;}
                else{min = mid;}
            }
        }
        if(min>nums.length){ return nums.length;}
        if(max<0){return 0;}

        return min-1;
    }
}