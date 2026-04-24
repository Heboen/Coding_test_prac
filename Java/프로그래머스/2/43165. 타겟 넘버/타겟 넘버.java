import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = dfs(numbers,target, 0);
        
        return answer;
    }
    public int dfs(int[] numbers, int target, int depth){
        int answer = 0;
        int sum = Arrays.stream(numbers).sum();
        if(depth==numbers.length){
            if(sum==target){
                return 1;
            }
            else{
                return 0;
            }
        }
        else{
            answer += dfs(numbers, target, depth+1);
            numbers[depth] *= -1;
            answer+= dfs(numbers, target, depth+1);
            return answer;
        }
    }
}