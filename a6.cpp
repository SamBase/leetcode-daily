//sumitted by https://leetcode.com/mr_kamran/
//https://leetcode.com/problems/zigzag-conversion/discuss/3134053/C%2B%2B-or-Faster-than-95-or-Easy-Understanding-or-Clean-and-Concise-Code-or
class Solution {
public:

    string convert(string s, int numRows) {
    
    if(numRows <= 1) return s;

    vector<string>v(numRows, ""); 

    int j = 0, dir = -1;

    for(int i = 0; i < s.length(); i++)
    {

        if(j == numRows - 1 || j == 0) dir *= (-1); 
		 
        v[j] += s[i];

        if(dir == 1) j++;

        else j--;
    }

    string res;

    for(auto &it : v) res += it; 

    return res;

    }
};