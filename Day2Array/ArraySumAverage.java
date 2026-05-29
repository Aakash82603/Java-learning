package Day2Array;

public class ArraySumAverage {
    public static void main(String[] args) {
        int[]myarr={22,33,44,55,11,66,77,888,9999};
        int sum=0;
        int index=0;
        for(index =0; index<myarr.length; index++){
            sum=sum+myarr[index];
        }
        System.out.println("Sum of the array is "+sum);
        double Average=sum/myarr.length;
        System.out.println("Average of the array is "+Average);
    }



}
