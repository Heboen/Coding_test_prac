import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strnum = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            strnum[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strnum, (a,b) -> (b+a).compareTo(a+b));
        
        if(strnum[0].equals("0")){ return "0";}
        
        StringBuffer strb = new StringBuffer();
        
        for(int i = 0; i < strnum.length; i++){
            strb.append(strnum[i]);
        }
        return strb.toString();
        
    }
    
}