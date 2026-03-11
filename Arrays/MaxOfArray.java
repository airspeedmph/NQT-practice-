package Arrays;

public class MaxOfArray {


    static void maxOfArray ( int []num ){

        int ans =0;
        for ( int i = 0 ; i <num.length ; i ++) {
            if ( ans < num [ i]){
                ans = num[i];
                
            }

        }
        System.out.println ( ans + " is the largest element among the array ");
    }
    public static void main ( String []args ){
        int [] b = {12 , 5 , 56 , -1 , 0 };
        maxOfArray(b);
        
    }
}
