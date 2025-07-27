import java.util.Scanner;
//trying things out in Java

public class mathAttempts {
    public static void main(String[] args) {
        System.out.print("Tell me a value to do a factorial:");
        Scanner cinVariable = new Scanner(System.in);
        int factorial_index = cinVariable.nextInt();
        long ans = fact(factorial_index);
        System.out.println("Great! The factorial of " + factorial_index + " is " + ans);

        //fibonnaci sequence
        int fib_Index = 0;
        ans = 0L;
        cinVariable.reset(); //Same as cin.ignore??
        System.gc(); //no way of freeing heap. this is the only way, and apparently its a "suggestion".
        System.out.print("Tell me a value to do a fibonacci:");
        cinVariable = new Scanner(System.in);
        fib_Index = cinVariable.nextInt();
        ans = fib(fib_Index);
        System.out.println("Great! The fibonacci of " + fib_Index + " is " + ans);

        //exponent calculator
        int baseNum = 0;
        int powerNum =0;
        ans = 0L;
        cinVariable.reset(); //Same as cin.ignore??
        System.gc(); //no way of freeing heap. this is the only way, and apparently its a "suggestion".
        System.out.print("Tell me a base you want to take the exponent of:");
        cinVariable = new Scanner(System.in);
        baseNum = cinVariable.nextInt();

        System.out.print("Tell me by how much would you like to power the base:");
        cinVariable.reset(); //Same as cin.ignore??
        System.gc(); //no way of freeing heap. this is the only way, and apparently its a "suggestion".
        powerNum = cinVariable.nextInt();
        ans = exponent(baseNum,powerNum);
        System.out.println( baseNum + " to the power of " + powerNum + " is " + ans);

        //I have so many questions...!!!!
        /*
        * How does heap even work in JAVA???? Almost every iteration of my code above does not indicate any attempt at freeing memory. Why??
        * ^My guess of the above is that it doesn't "need" to. Hence, the less robustness of it. I am still very confused as to how an
        * interpreted + compiled language doesn't need any dynamic memory allocation...*/
    }

    public static long fact (int index) {
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
//won't work with large numbers. stack overflow.
    public static long fib (int index) {
        if (index <= 0) {
            System.out.print("Wrong! Index cannot be less than or equal to zero!");
            return -1;
        }
        else if (index == 1 || index == 2) {
            return 1;
        }
        else {
            return (fib(index-1) + fib(index-2));
        }
    }

    public static long exponent (int base, int power){
        long answer = 1L;
        for (int i =0; i<power; i++) {
            answer *= base;
        }
        return answer;
    }
}