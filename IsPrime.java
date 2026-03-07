
import java.util.*;
public class IsPrime{
    public static boolean isPrime(int num ){
        if (num <= 1){
            return false;
        }
       
        for (int i =2 ; i <num ; i ++ ){
            if ( num %i==0){
                return false;
            }
            
        }
        return true  ;
    }
    
    public static void main (String [ ]args) {
        System.out.println("enter you num");
        Scanner sc = new Scanner ( System.in);
        int a = sc.nextInt();
        if (isPrime(a)){
            System.out.println("the num is prime ");
        }else {
            System.out.println("not prime ");
        }
        sc.close();
        
        
    }
}