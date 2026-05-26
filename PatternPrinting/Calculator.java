
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        char Choice;
        System.out.println("Enter operation: +, -, *, /");
        Choice=sc.next().charAt(0);
        switch(Choice){
            case '+':
                System.out.println("The sum is: "+(a+b));
                break;
             case '-':
                System.out.println("The difference is: "+(a-b));
                break;
                case '*':
                    System.out.println("The product is: "+(a*b));
                    break;
                    case '/':
                        System.out.println("The quotient is: "+(a/b));
                        break;
                        default:
                            System.out.println("Invalid choice");


    }
    }

}
