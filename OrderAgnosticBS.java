package leetcode;

// order Agnostic Binary Search 
public class OrderAgnosticBS {
    public static void main(String[] args) {
       // int[] arr = {2,3,5,20,39,45,50,60,103,113,145,255,355,455};
        int[] arr = {99,84,81,70,49,39,32,5,3,1,-3,-8}; 
        int target = -3;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(" The element are exist in the index number :  " + ans);
    }
    public static int orderAgnosticBS(int[] arr, int target)
    {
        int start =0;
        int end = arr.length-1;
        boolean isAsn = arr[start]< arr[end];
        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(target == arr[mid])
              return mid;
            
            if(isAsn)
            {
                if(target < arr[mid])
                  end = mid-1;
                else
                  start = mid+1;
            }
            else
            {
                if(target > arr[mid])
                   end = mid-1;
                else
                  start = mid+1;
            }
        }
    return -1;
  }
}