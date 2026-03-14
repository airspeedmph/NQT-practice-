import java.util.*;

class ReturnSmallestAndLargest {
    
    static int []returnArray(int []arr ){ 
        int max  = Integer.MIN_VALUE;
   int min = Integer.MAX_VALUE; 
  int[]a={0,0}; 
   
    for (int i = 0 ; i < arr.length; i ++ ){
       max=  Math.max(arr[i], max);
       min=  Math.min(arr[i], min);
        
    }
    a[0]=min;
    a[1]=max;
    return a;
}  


public static void main ( String[]args){
        int []z={13,9,8,7,5,};
        System.out.println(Arrays.toString(returnArray(z))); 
        
    }
}