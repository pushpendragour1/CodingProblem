package leetcode;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
               // 0  1   2   3  4  5  6  7   8   9   10  11  12   13   14   15
    int[] arr = {-8, -7, -2, 0, 2, 3, 5, 10, 19, 22, 29, 35, 40, 100, 300, 340};
    Scanner input = new Scanner(System.in);
    int target = input.nextInt();
    int ans = binarySearch(arr, target);
    System.out.print(ans);
}

public static int binarySearch(int[] arr, int target)
{
    int start =0;
    int end = arr.length -1;

    while(start <= end)
    {
         int mid = start + (end - start)/2;

         if(target < arr[mid])
         {
            end = mid -1;
         }
         else if(target >  arr[mid])
         {
            start = mid+1;
         }
         else
         {
            return mid;
         }
    }
    return -1;
}
    
}
