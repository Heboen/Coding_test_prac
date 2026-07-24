class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        if(my_string.startsWith(" ")){
            my_string = my_string.trim();
        }
        answer = my_string.split(" ");
        return answer;
    }
}