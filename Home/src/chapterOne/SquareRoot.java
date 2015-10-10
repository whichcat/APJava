package chapterOne;

import static java.lang.Math.abs;

public class SquareRoot {
    public static void main(String[] args){
        double number = 41;
        double x = 1;
        double quotient = number/x;
        while (abs(x - quotient) > 0.0000000001){
            x = (quotient+x)/2;
            quotient = number/x;
        }
        System.out.println(x+" is the square root of "+number);
    }
    
}
