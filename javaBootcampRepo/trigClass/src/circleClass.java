//implementation of a class in Java!

//importing the math class so that I can do some magic.
import java.lang.Math;
import java.util.Scanner;
//changes
public class circleClass {
    //double is the only way the math class computes
    private static double radius;
    private static double angleRadian;

    //Constructors
    public circleClass(){
        radius = 0;
        angleRadian = 0;
    }
    public circleClass(double inRadius, double inAngleRadian) {
        radius = inRadius;
        angleRadian = inAngleRadian;
    }
    public circleClass(double inRadius){
        radius = inRadius;
        angleRadian = 0;
    }

    //getters
    public static double getRadius() {
        return radius;
    }
    public static double getAngleRadian() {
        return angleRadian;
    }

    //setters
    public static void setRadius(double inRadius) {
        radius = inRadius;
    }
    //setter took a while because there is really no way of knowing if the input is in radians or degrees,
    // unless you ask the user to answer a question.
    public static void setAngleRadian(double inAngle) {
        String isDegrees = "NotYNotN";
        //methods for strings! really nice to be honest.
        while(!isDegrees.equalsIgnoreCase("y") && !isDegrees.equalsIgnoreCase("n")){
            System.out.print("Is your angle in degrees? (type 'y' for yes, 'n' for no): ");
            Scanner cinEquiv = new Scanner(System.in);
            isDegrees = cinEquiv.nextLine();
            System.gc(); //flush the buffer! free the heap! (or attempt to anyway.)
            if (isDegrees.equalsIgnoreCase("y") || isDegrees.equalsIgnoreCase("n")) {
                break;
            }
            else {
                System.out.println("That is neither a yes nor a no!");
            }
        }
        if (isDegrees.equalsIgnoreCase("y")) {
            angleRadian = ((java.lang.Math.PI)/180)*inAngle;
        }
        else {
            angleRadian = inAngle;
        }
    }

    //some math things!
    public static double calculateArcLengthRadian() {
        //arclength formula is s = rtheta
        return (radius*angleRadian);
    }
    public static double calculateAreaOfArc() {
        //area of arclength is (theta/2pi)*pir^2 = theta*r^2/2
        return ((angleRadian*(radius*radius))/2);
    }

    //some output things... Or, you know, no operator overloading in java :'(
}