import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
    }
    public static boolean ex1(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                return true;
            }
        }
        return false;
    }

    public static int[] ex2(int[] arr, int[] arr2) {
        int numOfArray = arr.length + arr2.length;
        int[] newArr = new int[numOfArray];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        int startIndexOfArr2 = arr.length;
        for (int j = 0; j < arr2.length; j++) {
            int targetIndex = startIndexOfArr2 + j;
            newArr[targetIndex] = arr2[j];
        }
        return newArr;
    }
    public static int[] ex3(int[] arr) {
        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++)
        {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueCount++;
            }
        }
        int[] result = new int[uniqueCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++)
        {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    public static boolean[] ex4(int[] arr) {
        boolean[] newArr = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr[i] = true;
            } else {
                newArr[i] = false;
            }
        }
        return newArr;
    }

    public static int ex6(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }
    public static int ex5(int[] arr) {
        if (arr == null || arr.length < 3) return -1;
        int n = arr.length;
        int i = 0;
        for (i = 0; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1])
            {
                break;
            }
        }
        if (i == 0 || i == n - 1) return -1;
        int peakIndex = i;
        for (int j = peakIndex; j < n - 1; j++)
        {
            if (arr[j] <= arr[j + 1])
            {
                return -1;
            }
        }
        return peakIndex;
    }
    public static void ex7(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] * 3;
            }
            System.out.println(arr[i]);
        }
    }

    public static int ex8(int[] arr, int num) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > num) {
                return i;
            }
        }
        return -1;
    }

    public static int[] ex9(int[] arr, int num) {
        int countTeenOfNum = 0;
        int countEqualOfNum = 0;
        int contBigOfNum = 0;
        int[] newArr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < num) {
                countTeenOfNum++;
            }
            if (arr[i] == num) {
                countEqualOfNum++;
            }
            if (arr[i] > num) {
                contBigOfNum++;
            }
        }
        newArr[0] = countTeenOfNum;
        newArr[1] = countEqualOfNum;
        newArr[2] = contBigOfNum;
        return newArr;
    }

    public static boolean ex10(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0)
            return false;
        char firstCharStr1 = str.charAt(0);
        char lastCharStr1 = str.charAt(str.length() - 1);
        char firstCharStr2 = str2.charAt(0);
        char lastCharStr2 = str2.charAt(str2.length() - 1);
        if (firstCharStr1 == firstCharStr2 && lastCharStr1 == lastCharStr2) {
            return true;
        } else {
            return false;
        }
    }

    public static int ex11(String[] arr, char test) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                for (int j = 0; j < arr[i].length(); j++)
                    if (arr[i].charAt(j) == test) {
                        count++;
                    }
            }

        }
        return count;
    }

    public static int ex12(String[] arr, String target) {
        int count = 0;

        if (target == null) {
            return 0;
        }

        for (int i = 0; i < arr.length; i++)
            if (arr[i] != null) {
                if (arr[i].contains(target)) {
                    count++;
                }
            }
        return count;
    }

    public static String reversString(String str) {//ex 13
        if (str == null || str.length() == 0) return "מחרוזת לא תקינה";
        char[] arr = new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);

        }
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += arr[i];

        }
        return result;
    }
    public static String ex14(String str1, String str2) {
        String result = "";
        int length1 = str1.length();
        int length2 = str2.length();
        int maxLength;

        if (length1 > length2)
        {
            maxLength = length1;
        }
        else
        {
            maxLength = length2;
        }
        for (int i = 0; i < maxLength; i++) {
            if (i < length1)
            {
                result = result + str1.charAt(i);
            }
            if (i < length2)
            {
                result = result + str2.charAt(i);
            }
        }
        return result;
    }

    public void ex15() {
        double sum = 0;//לצורך חישוב ממצוע מדוייק יותר
        double avg = 0;
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("הכנס מספר שלם");
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        avg = sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                System.out.println(arr[i]);
            }
        }
    }

    public static char ex16(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == currentChar) {
                    return currentChar;
                }
            }
        }

        return '\0';
    }
    public static void ex17(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replace('a', 'c');
        }
    }
    public static int ex18(String[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < arr[minIndex].length()) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static char ex20(String str)
    {
        char minChar=str.charAt(0);
        int minCount=str.length();
        for (int i = 0; i <str.length(); i++)
        {
            char currentChar = str.charAt(i);
            int currentCount=0;
            for (int j =0; j <str.length(); j++)
            {
                if (str.charAt(j)==currentChar)
                {
                    currentCount++;
                }
            }
            if (currentCount<minCount)
            {
                minCount = currentCount;
                minChar = currentChar;
            }
        }
        return minChar;
    }

    public static boolean ex21(String str)
    {
        if (str.length() < 9) {
            return false;
        }
        int digitCount = 0;
        int specialCharCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                digitCount++;
            } else if (c == '$' || c == '%' || c == '&' || c == '!') {
                specialCharCount++;
            }
        }
        if (digitCount >= 2 && specialCharCount == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}



