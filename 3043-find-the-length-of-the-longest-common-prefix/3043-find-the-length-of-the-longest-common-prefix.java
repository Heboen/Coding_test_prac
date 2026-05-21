import java.util.*;

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int answer = 0;
        Set<String> preset = new HashSet<>();

        for(int s : arr1){
            String num = Integer.toString(s);
            for(int i = 1; i <= num.length(); i++){
                preset.add(num.substring(0,i));
            }
        }
        for(int a : arr2){
            String target = Integer.toString(a);
            for(int i = 1; i <= target.length(); i++){
                String pre = target.substring(0,i);
                if(preset.contains(pre)){
                    if(pre.length() > answer) answer = pre.length();
                }
            }
        }
        return answer;
    }
}