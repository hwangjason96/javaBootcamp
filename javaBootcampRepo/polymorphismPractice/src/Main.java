import java.util.ArrayList;
import java.util.Scanner;

//THIS IS A WRONG INTERPRETATION OF THE POLYMORPHISM CONCEPT.
//THE SPECIAL THING ABOUT POLYMORPHISM IS THIS (GIVEN TWO CLASSES, ONE GENERIC AND THE OTHER SPECIFIC) :
//generic var_name = new specific();
//The specific class adds onto the inherited function of the generic.
//This example is faulty in that my approach is a bit too general. It needs to be more specific.
//One cannot have a list of occupations that adds onto the class of a person.
//a specific job like a firefighter or a policeman is more apt.
public class Main {
    public static void main(String[] args) {
        //Write a program that enters a list of people in a group.
        //It should ask for: name, age, nationality.
        //It should also ask for their job, but if they do not have one, just type 0.
        ArrayList<person> group = new ArrayList<person>();
        String userInput = "yes";
        Scanner inputStream = new Scanner(System.in);
        int iteration = 0;
        occupation test = new occupation();

        System.out.print("Hello! Welcome to the group collection module! \nI want you all to input a person within your group.\n");
        System.out.print("\nI will be asking for:\nTheir name\nTheir nationality\nTheir age\nTheir occupation\n");
        System.out.print("\nIf you reach the end of your group, type 'no' or just press enter to end this module. Good luck!\n");
        System.out.print("What is the name of the group member number " + (iteration+1) + "?");
        userInput = inputStream.nextLine();

        while(!userInput.equalsIgnoreCase("no")){
            if (userInput.isEmpty()) {
                break;
            }
            else {
                group.add(new person(userInput));
                System.out.print("What is the nationality of the group member " + (iteration+1) + "?");
                group.get(iteration).setNationality(inputStream.next());
                System.out.print("What is the age of the group member " + (iteration+1) + "?");
                group.get(iteration).setAge(inputStream.nextInt());
                System.out.print("Does group member " + (iteration+1) + " have a job?\n Type 'yes' or 'no': ");
                userInput = inputStream.next();
                if (userInput.equalsIgnoreCase("yes")) {
                    System.out.print("What is the job of the group member " + (iteration+1) + "?");
                    userInput = inputStream.next();
                    group.get(iteration).setJob(new occupation(userInput));
                    System.out.print("In what area does member " + (iteration+1) + " work?");
                    group.get(iteration).getJob().setOccupationLocation(inputStream.next());
                    System.out.print("How much does group member " + (iteration+1) + " make?");
                    group.get(iteration).getJob().setOccupationSalary(inputStream.nextDouble());
                }
                else {
                    System.out.print("No shame in being in between jobs!");
                }
                iteration++;
                System.out.print("What is the name of the group member number " + (iteration+1) + "?");
                userInput = inputStream.next();
            }
        }
        for (int i =0; i<group.size();i++){
            System.out.print("Person " + i + " name: ");
            System.out.println(group.get(i).getName());
            System.out.print("Person " + i + " nationality: ");
            System.out.println(group.get(i).getNationality());
            System.out.print("Person " + i + " age: ");
            System.out.println(group.get(i).getAge());
            System.out.print("Is person " + i + " employed? ");
            if (group.get(i).getJob().isOccupied() == true) {
                System.out.println("Yes!");
                System.out.print("Person " + i + " occupation?");
                System.out.println(group.get(i).getJob().getOccupationName());
                System.out.print("Person " + i + " employed where?");
                System.out.println(group.get(i).getJob().getOccupationLocation());
                System.out.print("Person " + i + " Salary?");
                System.out.println(group.get(i).getJob().getOccupationSalary());
            }
            else {
                System.out.println("Nope!");
            }
        }
    }
}