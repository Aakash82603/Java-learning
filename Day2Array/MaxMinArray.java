package Day2Array;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] myarr = {22, 33, 44, 55, 11, 66, 77, 888, 9999};
        int max=myarr[0];
        int min=myarr[0];
       // int max=Integer.MIN_VALUE;
       // int min=Integer.MAX_VALUE;
        for(int i=0; i<myarr.length; i++)
        {
            if(myarr[i]>max)
            {
                max=myarr[i];
            } else if (myarr[i]<min) {
                min=myarr[i];

            }
        }
        System.out.println("Maximum element in the array is "+max);
        System.out.println("Minimum element in the array is "+min);
    }
}
