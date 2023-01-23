import java.util.Arrays;

class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1) return 1;
        
        int[] villagePeople = new int[n];
        
        
        for(int i=0;i<trust.length;i++){
            if(villagePeople[ trust[i][0] - 1] >= 0) villagePeople[trust[i][0] - 1] = -1;
            
            if(villagePeople[trust[i][1] - 1] >= 0) villagePeople[trust[i][1] - 1]++;
        }
        
        //System.out.println(Arrays.toString(villagePeople));
        
        int noOfJudges = 0;
        int position = -1;
        for(int i=0;i<villagePeople.length;i++){
            if(villagePeople[i] == 0) return -1;
            if(villagePeople[i]==n-1) {
                noOfJudges++;
                position = i;
            }
        }
        
        if(noOfJudges!=1)return -1;
        return position+1;
    }
}