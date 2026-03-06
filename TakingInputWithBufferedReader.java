import java.io.*;

class TakingInputWithBufferedReader{
    public static void main ( String []args) throws IOException 
    {
        
        // taking input in string  with the buffered reader and then printing it 
        System.out.println("hello there");
        System.out.println("input your name");
        BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println(name);
        
        // taking input in the int format with buffered reader  and then printing it 
        // 
        System.out.println("enter you age and press enter");
        int age =Integer.parseInt (br.readLine());
        System.out.println(age);
        
        //taking float input from buffered reader 
        System.out.println("enter the number is float ");
        float f = Float.parseFloat(br.readLine());
        System.out.println(f);
    }
}