class Solution {
    public int searchInsert(int[] nums, int target) {
        int min=0,max=nums.length-1,mid;

        while(min<nums.length && max>-1 && min<=max){
            mid= (max+min)/2;
            System.out.println("mid:"+mid);
            if(nums[mid]==target){return mid;}
            
            if(nums[mid] > target){
                if(max==mid){
                    if(target > nums[min] && target < nums[max]){return max-1;}
                    max-=1;
                }
                else{max=mid;}
            }else{
                if(min == mid){ 
                    if(target > nums[min] && target < nums[max]){return min+1;}
                    min+=1;
                }
                else{min = mid;}
            }
            System.out.println("min:"+min+"\tmax:"+max);
        }
        if(min>nums.length-1){ return nums.length;}
        if(max<0){return 0;}

        return min-1;
    }
}