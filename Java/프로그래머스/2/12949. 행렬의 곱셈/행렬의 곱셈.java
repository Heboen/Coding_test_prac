import java.util.*;
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr2[0].length;
        int[][] answer = new int[rows][cols];
        for(int i= 0; i<arr1.length; i++){
            for(int j = 0; j<arr2[0].length; j++){
                int sum = 0;
                for(int r = 0; r<arr1[0].length; r++){
                    sum += arr1[i][r] * arr2[r][j];
                }
                answer[i][j] = sum;
            }
        }
        return answer;
    }
}