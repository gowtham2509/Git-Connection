package BasicProgram;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int count=1;
        for(int i=1;i<=num;i++){
            if(num%i==2)
                count++;
        }
        if(count==2)
            System.out.print("Prime Number");
        else
            System.out.println("Not Prime");
    }
}
