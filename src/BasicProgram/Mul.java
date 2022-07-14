package BasicProgram;

import java.util.HashMap;
import java.util.Map;

public class Mul {
    public static void main(String[] args) {
        String str="gowtham";
        char[] array=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],i+1);
            }
            else{
                map.put(array[i],1);
            }
        }
        System.out.println(map);
    }
}
