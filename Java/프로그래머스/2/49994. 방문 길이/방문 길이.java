import java.util.*;
class Solution {
    static int[] arx = {-1,1,0,0};//위아래 이동
    static int[] ary = {0,0,-1,1};//좌우 이동
    public int solution(String dirs) {
        boolean[][] visited = new boolean[121][121];//좌표별 이동했던 적이 있는지
        int x = 5, y = 5; //좌표평면(0,0) 
        int answer = 0;
        for(int i = 0; i < dirs.length(); i++){
            char way = dirs.charAt(i);//이동 커멘드
            int nx = 0, ny = 0; //다음 이동할 좌표값
            switch(way){ //커멘드별로 이동할 좌표를 계산하기 위해 switch-case문
                case 'U':{
                    nx = x + arx[0];
                    ny = y + ary[0];
                    break;
                }
                case 'D':{
                    nx = x + arx[1];
                    ny = y + ary[1];
                    break;
                }
                case 'L':{
                    nx = x + arx[2];
                    ny = y + ary[2];
                    break;
                }
                case 'R':{
                    nx = x + arx[3];
                    ny = y + ary[3];
                    break;
                }
            }
            if(!validation(nx,ny)) continue; //해당 좌표에 이동한 적이 없다면
            int start = x * 11 + y;
            int end = nx * 11 + ny;
            if(!visited[start][end]){ //양방향 계산
                visited[start][end] = true;
                visited[end][start] = true;
                answer++;
                
            }
            x = nx;
            y = ny;
        }
        return answer;
    }
    public static boolean validation(int nx, int ny){
        if( 0 <= nx && 0 <= ny && nx <= 10 && ny <= 10) return true;
        return false;
    }
}