import java.util.Arrays;
import java.util.Scanner;

public class ex1
{
   public static void main(String[] args) {
        int []arr={0,5,12,13,14,15,16,17,18,19,20,40,100,99,5,5,5,5};
       int[]arr2={40,10,9,0,5};
       String str="noam";
       String str2="noajhgfyfyujfjjgcugubjnm";
       System.out.println(ex10(str,str2));
     //  int[]arr3=ex9(arr,5);
     //  for (int i=0;i<arr3.length;i++)
      // {
      //     System.out.println(arr3[i]);
      // }
       //System.out.println(ex8(arr2,50));
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
     public static  int[] ex9(int[] arr,int num)
     {
        int countTeenOfNum=0;
        int countEqualOfNum=0;
        int contBigOfNum=0;
        int []newArr=new int[3];
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]<num)
            {
                countTeenOfNum++;
            }
            if (arr[i]==num)
            {
                countEqualOfNum++;
            }
            if (arr[i]>num)
            {
                contBigOfNum++;
            }
        }
        newArr[0]=countTeenOfNum;
        newArr[1]=countEqualOfNum;
        newArr[2]=contBigOfNum;
        return newArr;
     }
     public   static boolean ex10(String str,String str2)
     {
         if (str==null||str.length()==0||str2==null||str2.length()==0)
             return false;
         char firstCharStr1=str.charAt(0);
         char lastCharStr1=str.charAt(str.length()-1);
         char firstCharStr2=str2.charAt(0);
         char lastCharStr2=str2.charAt(str2.length()-1);
         if(firstCharStr1==firstCharStr2&&lastCharStr1==lastCharStr2)
         {
             return true;
         }
         else
             {
             return false;
             }
     }
     public static  int ex11(String [] arr,char test) {
         int count = 0;
         for (int i = 0; i < arr.length; i++)
         {
             if (arr[i]!=null)
             {
                 for (int j =0; j <  arr[i].length(); j++)
                     if (arr[i].charAt(j) == test) {
                         count++;
                     }
             }

     }
         return  count;
     }
     public   static int ex12(String [] arr,String target) {
       int count = 0;

           if (target==null) {return 0;}

               for (int i =0; i<arr.length; i++)
                   if (arr[i]!=null)
                   {
                     if (arr[i].contains(target)) {
                         count++;
                     }
                   }
               return count;
           }
           public static String reversString (String str) {
            if (str==null||str.length()==0) return "מחרוזת לא תקינה";
            char [] arr=new  char[str.length()];
            for (int i =0; i<arr.length; i++)
            {
                arr[i]=str.charAt(i);

            }
            String  result="";
            for (int i =str.length()-1; i>=0; i--) {
            result += arr[i];

            }
            return result;
           }
        public void ex15()
        {
            double sum=0;//לצורך חישוב ממצוע מדוייק יותר
            double avg=0;
         Scanner in=new Scanner(System.in);
         int []arr=new int[10];
         for(int i=0;i<arr.length;i++)
         {
             System.out.println("הכנס מספר שלם");
             arr[i]=in.nextInt();
             sum+=arr[i];
         }
         avg=sum/arr.length;
         for (int i=0;i<arr.length;i++)
             {
             if(arr[i]>avg)
             {
                 System.out.println(arr[i]);
             }
             }
        }
       }


