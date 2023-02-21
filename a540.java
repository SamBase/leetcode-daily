class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int min=0,max=nums.length-1,mid,noOfElementsLeftSide,noOfElementsRightSide;

        if(nums.length==1){return nums[0];}
        while(true){
            mid = (min+max)/2;
            System.out.println("mid:" + nums[mid]);


            if(mid==0 && nums[mid]!=nums[mid+1]){return  nums[mid];}
            if(mid==nums.length-1 && nums[mid]!=nums[mid-1]){return nums[mid];}
            if(nums[mid]!=nums[mid+1] && nums[mid] != nums[mid-1]){return nums[mid];}

            if(nums[mid] == nums[mid+1]){
                noOfElementsRightSide = (nums.length - 1) - mid + 1;
            }else{
                noOfElementsRightSide = (nums.length - 1) - mid;
            }

            if(nums[mid] == nums[mid-1]){
                noOfElementsLeftSide = mid - 0 - 1;
            }else{
                noOfElementsLeftSide = mid - 0;
            }
            System.out.println("noOfElementsLeftSide:" +noOfElementsLeftSide+"\tnoOfElementsRightSide:"+noOfElementsRightSide);
            
            if(noOfElementsRightSide % 2 != 0){
                if(min == mid){min+=1;
                }else{
                    min = mid;
                }
                
            }else{
                if(max == mid){
                    max-=1;
                }else{
                    max = mid;
                }
            }
            System.out.println("min:" +min+"max:"+max);

        }
    }
}