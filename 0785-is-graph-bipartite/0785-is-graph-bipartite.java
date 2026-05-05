import java.util.*;

class Solution {
    static boolean[] visited;
    static boolean[] color;

    public boolean isBipartite(int[][] graph) {
        visited = new boolean[graph.length];
        color = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                color[i] = true;
                if(!dfs(graph,i)) return false;
            }
        }

        return true;
    }

    boolean dfs(int[][] graph, int curr) {
        visited[curr] = true;
        for (int nextv : graph[curr]) {
            if (!visited[nextv]) {
                color[nextv] = !color[curr];
                visited[nextv] = true;
                if (!dfs(graph, nextv)) {
                    return false;
                }
            } else {
                if (color[curr] == color[nextv]) {
                    return false;
                }
            }
        }
        return true;
    }
}