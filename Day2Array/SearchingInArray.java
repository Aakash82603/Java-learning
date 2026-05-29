package Day2Array;

import java.util.Scanner;

public class SearchingInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] myarr= {4,66,44,33,22,12,21,345,77,888,9999};
        System.out.print("Enter the number do u want to search ");
        int num=sc.nextInt();
        //int index=0;
        boolean searchNumber= searchNumber(num,myarr);
        if(searchNumber){
            System.out.println("Number found in the array");
        }
        else{
            System.out.println("Number not found in the array");
        }



    }
    public static boolean searchNumber(int num, int[]myarr){
        int index=0;
       while(index<myarr.length){
           if(myarr[index]== num){
               return true;
           }
           index++;
       }

        return false;
    }
}
