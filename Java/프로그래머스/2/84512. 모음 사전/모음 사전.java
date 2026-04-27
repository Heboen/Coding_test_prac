import java.util.*;

class Solution {
    int answer, cnt;
    public int solution(String word) {
        dfs(new StringBuilder(), word);
        return answer;
    }
    boolean dfs(StringBuilder sb, String word){
        if(sb.toString().equals(word))return true; //word와 같다면 true리턴
        if(sb.length() >= 5) return false; //길이가 5이상이면 false 리턴
        
        for(char c : "AEIOU".toCharArray()){
            sb.append(c);
            cnt++;
            if(dfs(sb,word)){
                answer = cnt;
                return true;
            }
            sb.deleteCharAt(sb.length() - 1);
            
        }
        return false;
    }
}