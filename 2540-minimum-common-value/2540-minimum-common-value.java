import java.util.*;
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int[] newnums1 = Arrays.stream(nums1).distinct().toArray();
        int[] newnums2 = Arrays.stream(nums2).distinct().toArray();
        int minn = Integer.MAX_VALUE;
        for(int i = 0; i < newnums1.length; i++){
            hmap.put(newnums1[i], hmap.getOrDefault(newnums1[i], 0)+1);
        }
        for(int i = 0; i < newnums2.length; i++){
            hmap.put(newnums2[i], hmap.getOrDefault(newnums2[i], 0)+1);
        }

        for(int key : hmap.keySet()){
            if(hmap.get(key) > 1 && minn > key){
                minn = key;
            }
        }
        return minn == Integer.MAX_VALUE ? -1:minn;
    }
}