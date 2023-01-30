//solution by https://leetcode.com/singhabhinash/
//https://leetcode.com/problems/n-th-tribonacci-number/discuss/3115577/Day-30-oror-DP-Easiest-Beginner-Friendly-Sol-oror-O(n)-time-and-O(n)-space
class Solution {
public:
    int tribonacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        vector<int> Tribonacci(n+1);
        Tribonacci[0] = 0;
        Tribonacci[1] = 1;
        Tribonacci[2] = 1;
        for(int i = 3; i < n+1; i++){
            Tribonacci[i] = Tribonacci[i-1] + Tribonacci[i-2] + Tribonacci[i-3];
        }
        return Tribonacci[n];
    }
};