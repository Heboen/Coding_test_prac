import java.util.*;

class Solution {
    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        char[][] maze = new char[n][m];
        int[] start = new int[2];
        int[] lever = new int[2];
        int[] exit = new int[2];
        
        for(int r = 0; r < n; r++){
            maze[r] = maps[r].toCharArray();
            for(int c = 0; c < m; c++){
                if(maze[r][c] =='S'){
                    start[0] = r;
                    start[1] = c;
                }else if(maze[r][c] =='L'){
                    lever[0] = r;
                    lever[1] = c;
                }else if(maze[r][c] == 'E'){
                    exit[0] = r;
                    exit[1] = c;
                }
            }
        }
        int toLever = bfs(maze, start, lever, n, m);
        if(toLever == -1) return -1;
        
        int toExit = bfs(maze, lever, exit, n, m);
        if(toExit == -1) return -1;
        
        return toLever + toExit;
        
    }
    private int bfs(char[][] maze, int[] start, int[] target, int n, int m){
        boolean[][] visited = new boolean[n][m];
        int[] dr = {0,0,-1,1};
        int[] dc = {-1,1,0,0};
        
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{start[0], start[1], 0});
        visited[start[0]][start[1]] = true;
        
        while(!queue.isEmpty()){
            int[] current = queue.remove();
            int r = current[0];
            int c = current[1];
            int distance = current[2];
            
            for(int d = 0; d < 4; d++){
                int nr = r + dr[d];
                int nc = c + dc[d];
                
                if (nr >= 0 && nc >= 0 && nr < n && nc < m && maze[nr][nc] != 'X'){
                    if(!visited[nr][nc]){
                        if(nr == target[0] && nc == target[1]) return distance +1;
                        queue.offer(new int[]{nr, nc, distance+1});
                        visited[nr][nc] = true;
                    }
                }
            }
        }
        return -1;
    }
}