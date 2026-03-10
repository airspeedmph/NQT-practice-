

public class SumOfArray {
    
    public static int sum ( int []num ){
        int sum = 0;
        for ( int i =0; i<num.length; i++){
            sum = sum + num[i];
        }
        
        return sum ;
    }
    public static void main (String [] args ){
        
        int []a = {10 , 20 , 33 , 4} ;
        int res = sum(a);
        System.out.println ( res);
        
        
    }
}