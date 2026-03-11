import java.util.*; 

class TakeArrayInput {
    static Scanner sc  = new Scanner ( System.in);
    public static void main ( String [] args ){
     
            int  [] a= new int [3];
            for ( int i =0 ; i < a.length; i++ ){
                System.out.println( "enter the element for " + a[i] + " th element of the array  "); 
                a[i]= sc.nextInt();
                
            }
            System.out.println ( Arrays.toString(a) ); 
        
        
        
    }
}