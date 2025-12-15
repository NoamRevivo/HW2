import java.util.Arrays;

public class ex1
{
   public static void main(String[] args) {
        int []arr={0,5,12,13,14,15,16,17,18,19,20,40,100,99,5,5,5,5};
       int[]arr2={40,10,9,0,5};
       System.out.println(ex8(arr2,50));
    //   ex7(arr2);
     // boolean [] arr3=ex4(arr);
   //   for (int i=0;i<arr3.length;i++)
     // {
         // System.out.print(arr3[i]+",");
     // }
     //  System.out.println(ex6(arr,5));
      // System.out.println(Arrays.toString(arr3));
      //  int num=1;
       // boolean exist=ex1(arr,num);
       // System.out.println(exist);
    }
    public static boolean ex1(int[] arr,int num)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > num)
            {
                return  true;
            }
        }
        return false;
    }
     public static int[] ex2(int[] arr,int[] arr2)
     {
      int numOfArray=arr.length+arr2.length;
      int [] newArr=new int[numOfArray];
       for (int i = 0; i < arr.length; i++)
       {
          newArr[i] = arr[i];
      }
       int startIndexOfArr2 = arr.length;
       for (int j = 0; j < arr2.length; j++)
       {
          int targetIndex = startIndexOfArr2 + j;
          newArr[targetIndex] = arr2[j];
      }
        return newArr;
       }
     public static boolean [] ex4(int[] arr)
     {
      boolean []newArr=new boolean[arr.length];
      for (int i = 0; i < arr.length; i++)
     {
         if (arr[i] %2==0)
         {
            newArr[i]=true;
         }
         else
    {
              newArr[i]=false;
              }
       }
       return newArr;
     }
     public  static int ex6(int[] arr,int num)
     {
        int count=0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]==num)
            {
                count++;
            }
        }
        return count;
     }
     public   static void ex7(int[] arr) {
         for (int i = 0; i < arr.length; i++)
         {
             if (i%2==0)
             {
                arr[i]=arr[i]*3;
             }
             System.out.println(arr[i]);
         }
     }
     public   static int ex8(int[] arr,int num)
     {
         int sum=0;
         for (int i = 0; i < arr.length; i++)
         {
             sum+=arr[i];
             if (sum>num)
             {
               return i;
             }
         }
         return -1;
     }
     }

