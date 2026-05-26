import java.util.Scanner;

public class DegreeConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to convert from Celsius to Fahrenheit (C) or from Fahrenheit to Celsius (F)?");
        char choice=sc.next().charAt(0);
        if(choice=='F'){
            System.out.println("Enter the temperature in Celsius:");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

        }
        else if(choice=='C'){
            System.out.println("Enter the temperature in Fahrenheit:");
            double fahrenheit = sc.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is: " + celsius);
        }
        else{
            System.out.println("Wrong choice");
        }
    }
}
