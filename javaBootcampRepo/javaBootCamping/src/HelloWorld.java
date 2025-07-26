import java.util.Scanner;
//Much like python import, you need to import libraries you will use.
//same with #include with cpp

//Every line of code that runs in Java must be inside a class.
//The name of the class MUST match with the name of the file.
//In our case, the name is HelloWorld.java -> our class name is HelloWorld
public class HelloWorld {
    //The main method is the method that is in every java program.
    //Any code in the main is executed. (Much like the main function)
    //for c++.
    public static void main(String[] args) {
        //Notice the println -> it is a function like printf.
        //It prints a text and adds a new line.
        System.out.println("Hello World");
        //Notice the syntax:
            //System: the name of the class that includes member variables that is related to input and output.
            //out: the instance(field (apparently a member variable) object) of PrintStream (meaning, its datatype(?) is PrintStream) that is a member of the System Class. I think the most important part is that it gives access to PrintStream
            //println(): a method within the PrintStream class, can be used for out as it is part of the System class.

            //There is a chain that exists here:
            //You call the System Class and look for the member variable out,
            //the out then gives access to PrintStream class which then looks for the method println,
            //then the println fills the output stream with the String var within the parameter and outputs it to the console.

        //Let's try some recursion:
        int fibIndex = 0;
        System.out.printf("Tell me a number you would like to get the fibonnaci sequence of: ");
        Scanner cinEquivalent = new Scanner(System.in);
        fibIndex = cinEquivalent.nextInt();
        System.out.println("Great! the fibonacci sequence of: " + fibIndex + " is: " + fib(fibIndex));

    }
    public static int fib (int index) {
        if (index == 1 || index == 2) {
            return 1;
        }
        else if (index <= 0) {
            System.out.println("Error! there is no 0th member of the fibonnaci sequence!");
            return -1;
        }
        else {
            return (fib(index-1) + fib(index-2));
        }
    }

}