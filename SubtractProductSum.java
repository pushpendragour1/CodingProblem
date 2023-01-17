/* 
Question [1281] Subtract the Product and Sum of Digits of an Integer
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
*/
package leetcode;
import java.util.Scanner;

public class SubtractProductSum{

   static int ansNumb(int num)
   {
    int product=1;
    int sum=0;
    if(num<0)
      num*= -1;
     while(num>0)
     {
        int digit = num%10;
         product *= digit;
         sum += digit; 
     }
     return (product - sum) ;
   }
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print(" Enter the digit of Number 1 to 1000 : ");
    int num = input.nextInt();
    int ans= ansNumb(num);  
    System.out.print(" The output " + ans); 
}
}