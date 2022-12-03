class Solution {

    public String frequencySort(String s) {
        int[] array = new int[127];
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i)]++;
        }

        boolean foundMax = false;
        do {
            foundMax = false;
            int max = 0, index = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                    index = i;
                    foundMax = true;
                }
            }
            for (int i = 0; i < max; i++) {
                answer += (char) index;
            }
            if (max != 0)
                array[index] = 0;
        } while (foundMax);

        return answer;
    }
}
