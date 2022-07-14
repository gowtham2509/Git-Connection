package BasicProgram;

public class Dup {
    public static void main(String[] args) {
        String str="anand";
        char[] array=str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(array[i]==array[j]){
                    System.out.println(array[i]);
                }
            }

        }
    }
}
