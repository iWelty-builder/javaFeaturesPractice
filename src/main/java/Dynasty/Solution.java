package Dynasty;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
        public static boolean checkDynasty(int[] places){
            Arrays.sort(places);
            int zeroNum=0;
            for (int place : places) {
                if (place == 0){
                    zeroNum++;
                }
            }

            if (zeroNum == 0) {
                for (int i = 0; i < places.length - 1; i++) {
                    int minus = places[i + 1] - places[i];
                    if (minus > 1) {
                        return false;
                    }
                }
                return true;
            }
            List<Integer> list = new ArrayList<>();
            for (int place : places) {
                list.add(place);
            }
            list.removeIf(i -> i == 0);

    //        [0,6,9,0,7] -> [0,0,6,7,9] 0,0,6,8,10
            for (int i = 0; i < list.size() - 1; i++) {
                int minus = list.get(i+1) - list.get(i);
                if (minus == 0){
                    return false;
                }
                if (minus > 1){
                    zeroNum=zeroNum-(minus-1);
                    if (zeroNum < 0){
                        return false;
                    }
                }
            }

            return true;
        }
}
