import java.util.*;
class InputWithScanner{
    public static void main (String []arges ){
        
        Scanner input = new Scanner (System.in);
        //taking int input 
        int a = input.nextInt();
        System.out.println(a);
        
        //taking float input 
        float f= input.nextFloat();
        System.out.println(f);
        
        //taking double input 
        double d =input.nextDouble();
        System.out.println(d );
        
        /// IMP taking first character as an input 
        // here the next method takes whole line input unitl the whitespace and then the charat method extracts the is  first character from the 0th position 
        char c = input.next().charAt(0);
    }
}