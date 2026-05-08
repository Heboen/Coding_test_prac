import java.util.*;
class Solution {
    static int MAX_VAL = 1000001;
    public int solution(int x, int y, int n) {
        int answer = 0;
        int[] dp = new int[y+1];//dp 배열
        Arrays.fill(dp,MAX_VAL);//최소 횟수를 구하는 것이므로 배열을 MAX_VAL로 채움
        dp[x] = 0;//처음은 0
        for(int i = x; i <= y; i++){
            if(dp[i]==MAX_VAL) continue;
            
            if(i + n <= y) dp[i+n] = Math.min(dp[i+n], dp[i] + 1); //x에 n을 더하는 경우
            if(i * 2 <= y) dp[i*2] = Math.min(dp[i*2], dp[i] + 1);//x에 2를 곱하는 경우
            if(i * 3 <= y) dp[i*3] = Math.min(dp[i*3], dp[i] + 1);//x에 3을 곱하는 경우
        }
        
        return dp[y] == MAX_VAL ? -1: dp[y]; //만약 변환할 수 없다면 -1을 그게 아니라면 연산 횟수를 리턴
    }
}