package leetcode;
import java.lang.*;

//1295. Find Numbers with Even Number of Digits
public class EvenDigit{

    //find the total number of even digit by calling evenString method which are return true if digit is even
static int countDigit(int[] arr) 
 { 
  int count=0;
  for(int num : arr)
    { 
      if(evenFormula(num))
         count++;
    }
    return count;
 }
static boolean evenFormula(int num)
 {
    if(num<0)
      num *= -1;

   int ans= (int)(Math.log10(num)) + 1;
   return (ans % 2 == 0); 
 }
 //funtion to integer convert into string and find length of the string and return true of false 
 /*static boolean evenString(int num)
 {
    String str = Integer.toString(num);// convert integer number into String
    int ans = str.length();
     return ans % 2 == 0;  
 }


 static boolean even(int num)
 {
    if(num <0)
      num *= -1; 
    int count=0;
    while(num>0)
    {
        num = num/10;
        count++;
    }
    return (count % 2 == 0); 
 }
  */
public static void main(String[] args) {
    int[] arr ={12,43,43,233,68336,34,345,3434,3434};
    int ans = countDigit(arr);
    System.out.println(" The array is contain total "+ ans + " Even Digit");
}
 
}