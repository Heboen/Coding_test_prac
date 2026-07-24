import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        Arrays.sort(num_list);
        int len = num_list.length;
        int idx = 0;
        for(int i = 5; i < len; i++){
            answer[idx] = num_list[i];
            idx++;
        }
        return answer;
    }
}