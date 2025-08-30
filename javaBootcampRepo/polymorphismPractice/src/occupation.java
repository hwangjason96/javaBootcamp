//less general class has no extends.
public class occupation {
    private String occupationName;
    private String occupationLocation;
    private double occupationSalary;

    public occupation() {
        occupationName = "";
        occupationLocation = "";
        occupationSalary = 0.0;
    }
    public occupation(String inOccupationName) {
        occupationName = inOccupationName;
        occupationLocation = "";
        occupationSalary = 0.0;
    }
    public occupation(String inOccupationName, String inOccupationLocation) {
        occupationName = inOccupationName;
        occupationLocation = inOccupationLocation;
        occupationSalary = 0.0;
    }
    public occupation(String inOccupationName, String inOccupationLocation, double inOccupationSalary, person inPerson) {
        occupationName = inOccupationName;
        occupationLocation = inOccupationLocation;
        occupationSalary = inOccupationSalary;
    }
    public occupation(occupation inOccupation) {
        occupationName = inOccupation.occupationName;
        occupationLocation = inOccupation.occupationLocation;
        occupationSalary = inOccupation.occupationSalary;
    }

    //getter setter
    public Boolean isOccupied() {
        if (!occupationName.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    public String getOccupationName() {
        return occupationName;
    }
    public String getOccupationLocation() {
        return occupationLocation;
    }
    public double getOccupationSalary() {
        return occupationSalary;
    }

    public void setOccupationName(String inOccupationName) {
        occupationName = inOccupationName;
    }
    public void setOccupationLocation(String inOccupationLocation) {
        occupationLocation = inOccupationLocation;
    }
    public void setOccupationSalary(double inOccupationSalary) {
        occupationSalary = inOccupationSalary;
    }
}