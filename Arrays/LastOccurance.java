public class LastOccurance{
    
    public static int lastOccurance ( int []arr , int num ){
        int occ = -1; 
        for ( int i = 0 ; i < arr.length; i ++ ){
            if ( arr[i]==num ){
                occ = i ; 
            }
            
            
        }
        return occ ; 
    }
    public static void main ( String []args){
        
        System.out.println ( "find last occurance"); 
        int []a = {12 , 25 , 3 , 2 , 7,5,0 , 3,2,3, 6,2,6}; 
        System.out.println("the last occurance of" + 3 + " is following "+lastOccurance(a, 0)) ; 
        
        
        
    }
}