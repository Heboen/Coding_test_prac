import java.util.*;

class Solution {
    int solution(int[][] land) {
        int answer = 0;
        for (int i = 1; i < land.length; i++){
            for(int j = 0; j < 4; j++){
                int max = 0;
                for(int r = 0; r<4; r++){
                    if(j == r) continue;//같은 열이라면 SKIP
                    max = Math.max(max, land[i-1][r]);//나머지 3개의 열 중에서 최대값
                }
                land[i][j] += max; //다음 행에 이전 행의 최대값 더함
            }
        }

        return Arrays.stream(land[land.length-1]).max().getAsInt();//최종적으로 마지막 행에는 모두 더해졌으므로 마지막 행에서 최대값이 최고점
    }
}