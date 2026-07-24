class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] arr = myString.split("x");
        int len = arr.length;
        if(myString.endsWith("x")){
            len += 1;
        }
        answer = new int[len];
        answer[len-1] = 0;
        
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i].length();
            System.out.println(arr[i]);
        }
        return answer;
    }
}