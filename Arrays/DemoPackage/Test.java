

public class Test {

    static void maxArray (int []num ){

        int ans = 0;

        for ( int i =0 ; i < num.length; i ++ ){

            if ( ans < num[i]){
                ans = num [i];
            }
        }
        System.out.println(ans + "is the greatest in the array ");



    }

    public static void main ( String [ ]args){
        
        
        System.out.println ( "this is new ");
        int []b = { 2 ,45, 1 , -1 , 0  };
        maxArray (b);
    }
}