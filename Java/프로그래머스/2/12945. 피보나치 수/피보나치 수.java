import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int f1 = 1;
        int tmp = 0;
        int fn = 1;
        for(int i = 2; i < n; i++){
            tmp = fn;
            fn = fn % 1234567 + f1 % 1234567;
            f1 = tmp;
            
            answer = fn % 1234567;
        }
        return answer;
    }
        
}
