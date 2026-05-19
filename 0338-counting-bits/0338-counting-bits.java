class Solution {
    public int[] countBits(int n) {
        int[] answer = new int[n+1];

        for(int i = 1; i <= n; i++){ //i를 1과 AND 연산을 하면 짝수면 0 홀수면 1이 반환
            answer[i] = (i&1) + answer[i/2];
            //i번째 숫자는 i를 1과 AND 연산한 값과 i/2번째의 갯수를 더한 값과 같다
            //ex) i=9일때 비트는 1001이며, 9를 1과 AND 연산하면 1 + i/2번째 => 4는 100이므로 1개 
            //따라서 정답은 1001 => 2개
        }
        return answer;
    }
}