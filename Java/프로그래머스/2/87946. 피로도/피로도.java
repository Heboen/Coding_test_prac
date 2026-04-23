import java.util.*;

class Solution {
    private int dungeon;
    public int solution(int k, int[][] dungeons) {
        dungeon = 0;
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, 0, dungeons, visited);
        return dungeon;
    }
    
    private void dfs(int k, int cnt, int[][]dungeons,boolean[] visited){
        dungeon = Math.max(dungeon, cnt);
        for(int i = 0; i<dungeons.length; i++){
            int cost = dungeons[i][1];
            int minimun = dungeons[i][0];
            
            if (!visited[i] && k >=minimun){
                visited[i] = true;
                dfs(k-cost, cnt+1, dungeons,visited);
                visited[i] = false;
            }
        }
    }
}