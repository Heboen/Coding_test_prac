class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        String[] tmp = {};
        StringBuffer str = new StringBuffer();
        if(my_string.startsWith(" ")){
            my_string = my_string.trim();
        }
        tmp = my_string.split(" ");
        for(int i = 0; i < tmp.length; i++){
            if(!(tmp[i].equals(""))){
                str.append(tmp[i]);
                str.append(" ");
            }
        }
        answer = (str.toString()).split(" ");
        return answer;
    }
}