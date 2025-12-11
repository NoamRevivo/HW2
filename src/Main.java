import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int x=90;
    int []arr={0,5,12,13,14,15,16,17,18,19,20,40,100,99};
    int[]arr2={40,10,9,0,5};
        System.out.println(ex1(arr,x));
        System.out.println(ex1(arr2,x));
        System.out.println(ex2(arr,arr2));
    }
    public static boolean ex1(int[] arr,int num)
    {
        boolean bigNum = false;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > num)
            {
                bigNum = true;
            }
        }
        return bigNum;
    }
    public static String ex2(int[] arr,int[] arr2)
    {
        int numOfArray=arr.length+arr2.length;
        int [] newArr=new int[numOfArray];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        int startIndexOfArr2 = arr.length;
        for (int j = 0; j < arr2.length; j++)
        {
            int targetIndex = startIndexOfArr2 + j;
            newArr[targetIndex] = arr2[j];
        }
        return Arrays.toString(newArr);

        }
    }