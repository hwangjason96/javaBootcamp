public class person {
    private String name;
    private String nationality;
    private int age;
    private occupation job;

    //constructors.
    public person() {
        name = "";
        nationality = "";
        age = 0;
        //when you are assigning a class into a member variable, make sure you use the new keyword
        job = new occupation();
    }
    public person(String inName) {
        name = inName;
        nationality = "";
        age = 0;
    }
    public person(String inName, String inNationality) {
        name = inName;
        nationality = inNationality;
        age = 0;
    }
    public person(String inName, String inNationality, int inAge) {
        name = inName;
        nationality = inNationality;
        age = inAge;
    }
    public person(String inName, String inNationality, int inAge, occupation inJob) {
        name = inName;
        nationality = inNationality;
        age = inAge;
        job = new occupation(inJob);
    }
    public person(person inPerson) {
        name = inPerson.name;
        nationality = inPerson.nationality;
        age = inPerson.age;
        job = new occupation(inPerson.job);

    }

    //getters and setters.
    public String getName() {
        return name;
    }
    public String getNationality() {
        return nationality;
    }
    public int getAge() {
        return age;
    }
    public occupation getJob() {
        return job;
    }

    public void setName(String inName) {
        name = inName;
    }
    public void setNationality(String inNationality) {
        nationality = inNationality;
    }
    public void setAge(int inAge) {
        age = inAge;
    }
    public void setJob(occupation inJob) {
        job = new occupation(inJob);
    }
}