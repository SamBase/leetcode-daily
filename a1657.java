class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                int m = (int) word1.charAt(i) - 97;
                int n = (int) word2.charAt(i) - 97;
                array1[m]++;
                array2[n]++;
            }

            for (int i = 0; i < 26; i++) {
                // same alphabet exist
                if ((array1[i] == 0 && array2[i] != 0) || (array1[i] != 0 && array2[i] == 0)) {
                    return false;
                }
            }

            for (int i = 0; i < 26; i++) {
                if(array1[i]!=array2[i]){
                    int check = array1[i];
                    int swapped = 0;
                    for (int j = i+1; j < 26 && swapped==0; j++) {
                        if(check == array2[j]){
                            //swap
                            int temp = array2[i];
                            array2[i] = array2[j];
                            array2[j] = temp;
                            swapped = 1;
                        }
                    }
                }
            }

            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }

            }
            return true;

        } else {
            return false;
        }
    }
}
