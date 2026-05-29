package Day2Array;

import java.util.Scanner;

public class OccurrenceArray {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=ArrayUtility.InputArray();
        System.out.println("Enter the element do u want to check: ");
        int num = sc.nextInt();
        int occurrence=0;
        occurrence=numberOfOccurrence(num,arr);
        System.out.println("The occurrence of "+num+" is "+occurrence);


    }
    public static int numberOfOccurrence(int num, int[] arr){
        int occurrence=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                occurrence++;
            }
        }
        return occurrence;
    }
}
