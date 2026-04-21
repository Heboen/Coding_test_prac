
import java.util.*;
class Solution {

    public long solution(int n) {
        if (n <= 2) return n; // 예외 케이스: 1칸 → 1, 2칸 → 2

        long[] dp = new long[n + 1];//해당 칸에 도착할 방법의 수를 저장할 배열
        dp[1] = 1L; //1번칸에 도착할 방법의 수는 1
        dp[2] = 2L; //2번칸에 도착할 방법의 수는 (1,1), (2) 로 2가지 방법이 있음

        // 점화식 적용: dp[i] = dp[i-1] + dp[i-2]
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
            //i번째 칸에 도착할 방법의 수는 1번째 직전에 도착하거나 2번째 전에 도착하는 방법들의 합
        }

        return dp[n];
    }

}