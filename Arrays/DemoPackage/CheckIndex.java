public class CheckIndex {
    
    
    static int checkIndex ( int []num , int element ){
        
        for ( int i = 0 ; i < num.length ; i++){
            if ( element == num[i]){
                return i ;
            }
        }
        
        return -1 ; 
    }
    public static void main ( String []args ){
        
        int []arr = {32 , 53, 100 , 0 , -3 };
        System.out.println(checkIndex(arr, 100)); 
    }
}