package Day2Array;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.InputArray();
        boolean IsIncr = IsIncreasing(arr);
        boolean IsDecr = IsDecreasing(arr);
        if(IsIncr || IsDecr){
            System.out.println("The array is sorted .");
        }
        else{
            System.out.println("The array is not sorted .");
        }
    }

    public static boolean IsIncreasing(int[] arr)
    {

        for (int i = 1; i < arr.length; i++)
        {
            {
                if (arr[i] > arr[i - 1])
                {
                    return false;
                }
            }

        }
        return true;
    }


        public static boolean IsDecreasing(int[] arr)
        {

            for (int i = 1; i < arr.length; i++)
            {
                if (arr[i] < arr[i - 1])
                {
                    return false;
                }
            }
            return true;
        }

    }




