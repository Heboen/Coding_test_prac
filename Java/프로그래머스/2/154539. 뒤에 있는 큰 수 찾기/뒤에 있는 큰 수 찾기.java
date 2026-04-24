import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        //숫자들을 저장할 스택
        for(int i = numbers.length-1; i >= 0; i--){
            //오른쪽부터 탐색
            while(!stack.isEmpty() && stack.peek() <= numbers[i]){
                stack.pop();
                //스택의 top에 있는 값이 i번째 숫자보다 작다면 pop
            }
            if (stack.isEmpty()){
                //스택이 비어있다면 i번째 숫자보다 큰 숫자는 없다는 의미이므로 -1
                answer[i] = -1;
            }
            else{
                //스택이 비어있지않다면 i번째 숫자보다 크다는 의미이므로 해당 숫자를 저장
                answer[i]= stack.peek();
            }
            stack.push(numbers[i]);
        }
//         for(int i = 0; i < numbers.length; i++){
//             if (i==(numbers.length)-1){
//                 answer[i] = -1;
//                 break;
//             }
//             for(int j = i+1; j<numbers.length; j++){
//                 if (numbers[i] < numbers[j]){
//                     answer[i]=numbers[j];
//                     break;
//                 }
//                 if(j==numbers.length-1 && numbers[i] >= numbers[j]){
//                     answer[i] = -1;
//                 }
//             }
        
//         }
        return answer;
    }
}