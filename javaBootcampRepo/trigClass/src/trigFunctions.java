//trigFunctions!
//import math library for some shenanigans
import java.lang.Math;

public class trigFunctions {
    public static double sin(double angle) {
        //Power Series!
        //sigma(as n goes to some number): ((-1)^n)/(2n+1)!)x^(2n+1)
        double answer = 0;
        //we are limited to 20 as larger numbers yield a zero for the factorial function.
        //I need to learn more dynamic programming and how to do things that could help.
        for (int i =0 ; i<20; i++){
            answer += (pow(-1,i)/(fact(2*i+1)))*pow(angle,(2*i+1));
        }
        return answer;
    }
    public static long pow(double base, int power) {
        long answer = 1L;
        for (int i = 0; i<power; i++){
            answer *= base;
        }
        return answer;
    }
    public static long fact(int index) {
        long answer = 0L;
        for (int i = 0; i<index+1; i++) {
            if (i == 0) {
                answer = 1L;
            }
            else {
                answer *= i;
            }
        }
        return answer;
    }
}