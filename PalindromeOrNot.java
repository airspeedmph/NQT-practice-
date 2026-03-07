
import java.util.*;
public class PalindromeOrNot{
    
        public static void check(int a ){
            int org =  a;
            int x = 0 ;
            
            while ( a >0){
                
            int b = a%10;
            a = a/10;
            
            x = x*10 + b;
            
                
            }
            if (x == org ){
                System.out.println(" the number is palindrome");
            }else {
                System.out.println ( " the num is not palindrom ");
            }
        }
    public static void main ( String []args ){
        
            
        
        Scanner sc = new Scanner( System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        check(a);
        
        
        sc.close();
    
    }
}