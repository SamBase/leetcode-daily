class Solution {
    public int minimumAverageDifference(int[] nums) {
        long min=Integer.MAX_VALUE;
        int index=-1;
        long left=0;
        long right=0;
        long totalSum=0;
        long leftAvg=0;
        long rightAvg=0;
        for (int i = 0; i < nums.length; i++) {
            totalSum+=nums[i];
        }
        
        // leftAvg = left;
        
        
        // 
        // System.out.println(left + "\t" + right);

        for (int i = 0; i < nums.length; i++) {
            long avg;
            

            left+=nums[i];
            right = totalSum-left;
            // 
            // System.out.println("left\t"+left+"\tright\t"+right);

            leftAvg=Math.round(left/(i+1));
            if(nums.length-1 != 0 && i!=nums.length-1){
                rightAvg=Math.round((right)/(nums.length-i-1));
            }else if(i==nums.length-1){
                rightAvg=0;
            }
            avg = Math.abs(leftAvg - rightAvg);
            // 
            // System.out.println("leftAvg\t"+leftAvg+"\trightAvg\t"+rightAvg+"\tavg\t"+avg);
            if(avg<min){
                min = avg;
                index = i;
            }
            // 
            // System.out.println("min\t"+min+"\tindex\t"+index);
            // System.out.println("--------------------------------");
        }
        

        return index;
    }
}
