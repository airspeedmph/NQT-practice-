import java.util.*; 
class StrictlyGreater {
    
    
    static Scanner sc= new Scanner (System.in ); 
    
    static int strictlyGreater(int []arr , int num ){
        int b = 0;
        for ( int i = 0 ; i<arr.length ; i ++){
            
            if ( arr[i]>num ){
                b ++ ; 
                
            }
        }
        return b ; 
    } 
    public static void main ( String[]args ){
        
        System.out.println("enter the elements of array ");
        int []a = new int [5]; 
        for (int i = 0 ; i <= 4; i++){
            a[i]= sc.nextInt(); 
            
        }
        System.out.println("enter the single element to check greater "); 
        int x = sc.nextInt(); 
        System.out.println(Arrays.toString(a)); 
        System.out.println("there are " + strictlyGreater(a , x) + "elements that are strictly greater than given num ")  ;
        
        
    }
}