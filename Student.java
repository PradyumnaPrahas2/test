public class Student extends Person {
    private int year;
    private char section;
    private double cgpa;
    private int[] noOfGrades;
    private double fees;
    private int actual;
    int paidfees;
    // Instance initializer
    {
        // Initializing noOfGrades array with default values
        noOfGrades = new int[0];
    }

    // Constructor
    public Student(String name, int age, String gender, double weight, String nationality, int year, char section, double cgpa, int[] noOfGrades,int paidfees) {
        super(name, age, gender, weight, nationality);
        this.year = year;
        this.section = section;
        this.cgpa = cgpa;
        this.noOfGrades = noOfGrades;
        this.fees = calculateFees(year);
        this.paidfees=paidfees;;
    }

    // Method to calculate fees based on the year
    private double calculateFees(int year) {
        switch (year) {
            case 1:
                this.actual=20000;
                return 20000;
            case 2:
                this.actual=30000;
                return 30000;
            case 3:
                this.actual=40000;
                return 40000;
            case 4:
                this.actual=50000;
                return 35000;
            default:
                this.actual=0;
                this.paidfees=0;
                return 0; // No fees for other years
        }
    }

    // Method to calculate percentage and update CGPA
    public void calculatePercentage() {
        double ans=0;
        for(double i:noOfGrades){
            ans=ans+i;
        }
        double updatedCgpa=10*ans/(noOfGrades.length*10);
        // Update cgpa instance variable
        this.cgpa = updatedCgpa;
    }
    public void section(){
        System.out.println("Section: "+this.section);
    }
    public int paidfeeornot(){
        System.out.println("Actual fee: "+this.actual);
        System.out.println(("Paid fee: "+this.paidfees));
        System.out.println("Balance: "+(this.actual-this.paidfees));
        if(this.actual-this.paidfees==0){
            return 1;
        }
        else{
        return 0;}
    }
    public double getCgpa(){
        return this.cgpa;
    }

    // Method to check eligibility for applying to postgraduate program
    public boolean applyForPostGraduate() {
        if (year == 4 && cgpa > 8.0) {
            return true;
        }
        return false;
    }

    // Getter method for fees
    public double getFees() {
        return fees;
    }

    // Setter method for fees
    public void setFees(double fees) {
        this.fees = fees;
    }

    // Override canVote method
    @Override
    public void canVote(int c) {
        // Implement voting eligibility criteria specific to students if needed
        // For simplicity, let's keep the canVote method as it was before
        super.canVote(c);
    }
}
