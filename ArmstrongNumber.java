import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = countOfDigits(n);
        boolean ans = isArmstrong(n,count);
        System.out.println(ans);
    }

    public static int countOfDigits(int n){
        int count = 0;
        while(n>0){
            n=n/10;
            count+=1;
        }
        return count;
    }

    public static boolean isArmstrong(int n, int count){
        int sum=0;
        int temp = n;
        while(n>0){
            int rem=n%10;
            int value = (int)Math.pow(rem,count);
            sum = sum+value;
            n=n/10;
        }
        if(sum == temp){
            return true;
        }
        else{
            return false;
        }
    }

}
