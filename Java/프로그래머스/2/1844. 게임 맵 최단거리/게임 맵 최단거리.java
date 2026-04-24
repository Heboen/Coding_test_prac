import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[] dx = new int[] {-1,1,0,0};
        int[] dy = new int[] {0,0,-1,1};
        
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0,0});
        while (!queue.isEmpty()){
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            
            for (int i = 0; i<4;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(0<=nx && nx < n && 0<=ny&& ny < m &&maps[nx][ny] == 1){
                    maps[nx][ny] = maps[x][y] +1;
                    queue.offer(new int[] {nx,ny});
                }
            }
        }if(maps[n-1][m-1] != 1){
            return maps[n-1][m-1];
        }else{
            return -1;
        }

    }
}