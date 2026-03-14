public class Sorted {
    
    
    static boolean sorted(int arr []){
        boolean check = true; 
        for (int i =0 ; i <arr.length-1; i++){
            if ( arr[i]> arr[i+1]){
                check = false ; 
                break; 
            }
            
        }
        return check; 
       
    }
    public static void main ( String []args){
        
        int []a = {2,3,4,5,6,8,9};
        
        System.out.println(sorted(a)); 
    }
}