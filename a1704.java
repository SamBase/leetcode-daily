class Solution {
    public boolean halvesAreAlike(String s) {
        int div = s.length()/2;
        char[] a = s.toLowerCase().substring(0, div).toCharArray();
        char[] b = s.toLowerCase().substring(div).toCharArray();
        
        int vowel=0;

        for (int i = 0; i < b.length; i++) {
            if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u'){
                vowel++;
            }
            if(b[i]=='a' || b[i]=='e' || b[i]=='i' || b[i]=='o' || b[i]=='u'){
                vowel--;
            }
        }
        
        if(vowel==0){return true;}

        return false;
    }
}
