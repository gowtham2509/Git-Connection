package BasicProgram;

import java.util.HashMap;
import java.util.Map;

public class Count {
    public static void main(String[] args) {
        int[] num={0,0,1,1,1,0,0,0,1,1,1,1,};
        //int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<num.length;i++){
            for(int j=1;j<num.length;j++){
                if(num[i]==num[j]){
                  if(map.containsKey(num[i])) {
                  }
                }
            }

        }

    }
}
