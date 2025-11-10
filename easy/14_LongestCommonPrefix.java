class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0) {
            return "";
        }

        String firstString = strs[0];

        for(int i = 0;i<firstString.length();i++) {

            char currChar = firstString.charAt(i);

            for(int j = 1;j<strs.length;j++) {
                if(i == strs[j].length() || strs[j].charAt(i) != currChar) {
                    return firstString.substring(0,i);
                }
            }

        }

        return firstString;
    }
}