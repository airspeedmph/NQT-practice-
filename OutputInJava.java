class OutputInJava {

    public static void main(String[] args) {
        double val = Math.PI;
        System.out.println(val); // this prints all the 15 digits of Pi
        // now we want to print only 2 digits after the decimal in pi
        // then we have to use the printf () method

        System.out.printf("%.2f", val);
        System.out.println();
        // if we want to print the 3 zeroes before the formatted digits then use following
        System.out.printf("%05.2f", val); // what this does is 5 from this means total 5 space to print digits and 0 is used to fill the empty spaces out of these 5 digits and .2 denotes to take only 2 values out of 15 values after the decimal point 
    }
}
