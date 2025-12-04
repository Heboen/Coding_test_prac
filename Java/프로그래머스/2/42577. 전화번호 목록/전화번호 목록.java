import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length-1; i++){
            for(int j = 0; j < phone_book[i].length(); j++){
                if (phone_book[i+1].indexOf(phone_book[i]) == 0){
                    answer = false;
                }
            }
        }
        return answer;
    }
}