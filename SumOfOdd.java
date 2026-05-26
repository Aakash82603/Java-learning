import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Specified number to find sum  ");
        int n = input.nextInt();
        int sum=0;

        for(int i=1; i<=n; i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println(sum);

    }
}
