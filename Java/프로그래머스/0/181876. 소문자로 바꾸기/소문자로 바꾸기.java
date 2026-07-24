class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] arr = myString.split("");
        for(String i : arr){
            i = i.toLowerCase();
            answer += i;
        }
        return answer;
    }
}