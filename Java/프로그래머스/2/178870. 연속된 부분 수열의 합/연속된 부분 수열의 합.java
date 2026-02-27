import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int n = sequence.length;
        int start = 0;
        int end = 0;
        int left = 0, right = 0;
        int short_len = Integer.MAX_VALUE;
        int sum = 0;
        
        while(true){
            if(sum == k){
                int len = right - left;
                if(len < short_len){
                    short_len = len;
                    start = left;
                    end = right-1;
                }
                   sum -= sequence[left++];
            }
            else if(sum > k){
                sum -= sequence[left++];
            }
            else{
                if(right == n) break;
                sum += sequence[right++];
            }
        }
        if (short_len == Integer.MAX_VALUE) return new int[] {0,0};
        return new int[] {start,end};
    }
}