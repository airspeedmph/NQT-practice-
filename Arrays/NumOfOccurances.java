class NumOfOccurances {
    
    public static int calculateOccurance(int []arr , int num ){
        int sum = 0 ; 
        for (int i = 0 ; i < arr.length; i ++){
            
            if ( arr[i]==num){
                sum++; 
            } 
            
        }
        return sum ; 
    }
    public static void main ( String []args ) 
    {
        int []c = {32, 35,62,32 ,54,77, 12};
        System.out.println(calculateOccurance(c , 32));
        
    }
}