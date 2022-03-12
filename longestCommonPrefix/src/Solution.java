/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestPrefix = "";
        // finding the shtortest word amongst them
        int min=strs[0].length();
        for (int i=1;i<strs.length;i++){
            if (strs[i].length()<min){
                min=strs[i].length();
            }
        }
        // looking letters from 0 to the end of the minimal
        // length word

        for (int i=0;i<min;i++){
            char prefix=strs[0].charAt(i);
            boolean isNotEqual=true;
            for (int j=0;j< strs.length;j++){
                if (prefix!=strs[j].charAt(i)){
                    isNotEqual=false;
                }
            }
            if (isNotEqual) {
                longestPrefix += prefix;
            }else{
                break;
            }

        }
        System.out.println(longestPrefix);

        return longestPrefix;
    }
}
