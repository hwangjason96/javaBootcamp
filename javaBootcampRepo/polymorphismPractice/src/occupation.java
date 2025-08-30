public class occupation extends person {
    private String occupationName;
    private String occupationLocation;
    private double occupationSalary;
    private person assignedPerson;

    public occupation() {
        occupationName = "";
        occupationLocation = "";
        occupationSalary = 0.0;
        assignedPerson = new person();
    }
    public occupation(String inOccupationName) {
        occupationName = inOccupationName;
    }
    public occupation(String inOccupationName, String inOccupationLocation) {
        occupationName = inOccupationName;
        occupationLocation = inOccupationLocation;
    }
    public occupation(String inOccupationName, String inOccupationLocation, double inOccupationSalary) {
        occupationName = inOccupationName;
        occupationLocation = inOccupationLocation;
        occupationSalary = inOccupationSalary;
    }
    public occupation(String inOccupationName, String inOccupationLocation, double inOccupationSalary, person inPerson) {
        occupationName = inOccupationName;
        occupationLocation = inOccupationLocation;
        occupationSalary = inOccupationSalary;
        assignedPerson = new person(inPerson);
    }
    public occupation(occupation inOccupation) {
        occupationName = inOccupation.occupationName;
        occupationLocation = inOccupation.occupationLocation;
        occupationSalary = inOccupation.occupationSalary;
        assignedPerson = inOccupation.assignedPerson;
    }

}