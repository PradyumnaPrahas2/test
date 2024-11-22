class University {
    public static void main(String[] args) {
        // Exercise 1: Create a regular student
        int[] studentGrades = {10,10,0,8,10,10,10,10,10,10}; // Example grades
        Student student = new Student("Pankaj", 21, "Male", 55.0, "Indonesian", 4, 'B', 8.8, studentGrades,50000);
        student.calculatePercentage();
        System.out.println("Student: " + student.getName());
        System.out.println("CGPA: " + student.getCgpa());
        student.canTalk();
        student.canWalk();
        int c=student.paidfeeornot();
        student.canVote(c);
        System.out.println();
        // Exercise 2: Create an undergraduate student
        int[] undergradGrades = {10,10,0,9,10,10,10,10,10,10}; // Example grades
        ScholarshipStudent undergradStudent = new ScholarshipStudent("Pragnya", 20, "Female", 70.5, "Indian", 3, 'A', 8.9, undergradGrades,0);
        System.out.println("Undergraduate Student: " + undergradStudent.getName());
        System.out.println("CGPA: " + undergradStudent.getCgpa());
        undergradStudent.canTalk();
        undergradStudent.canWalk();
        undergradStudent.canVote(1);
        System.out.println("Eligible for scholarship: " + undergradStudent.isEligible());
        System.out.println();

        // Exercise 3: Update undergraduate student's scholarship eligibility
        undergradStudent.setEligible(false); // Change eligibility status
        int[] undergradGradesi = {10,10,0,0,2,10,10,10,10,10}; // Example grades
        ScholarshipStudent undergradStudenti = new ScholarshipStudent("Samuel", 20, "Female", 70.5, "African", 2, 'A', 7.2, undergradGradesi,0);
        System.out.println("Undergraduate Student: " + undergradStudenti.getName());
        System.out.println("CGPA: " + undergradStudenti.getCgpa());
        undergradStudenti.canTalk();
        undergradStudenti.canWalk();
        undergradStudenti.canVote(1);
        System.out.println("Eligible for scholarship: " + undergradStudenti.isEligible());
        System.out.println();

        // Exercise 3: Update undergraduate student's scholarship eligibility
        undergradStudenti.setEligible(false); // Change eligibility status
        //Student 4
        System.out.println("Updated Eligibility for Scholarship: " + undergradStudent.isEligible());
        int[] undergradGradesii = {10,10,3,9,10,10,10,10,10,10}; // Example grades
        ScholarshipStudent undergradStudentii = new ScholarshipStudent("Tikku", 20, "Female", 70.5, "Indian", 3, 'A', 9.2, undergradGradesii,0);
        System.out.println("Undergraduate Student: " + undergradStudentii.getName());
        System.out.println("CGPA: " + undergradStudentii.getCgpa());
        undergradStudentii.canTalk();
        undergradStudentii.canWalk();
        undergradStudentii.canVote(1);
        System.out.println("Eligible for scholarship: " + undergradStudentii.isEligible());
        System.out.println();

        // Exercise 3: Update undergraduate student's scholarship eligibility
        undergradStudentii.setEligible(false); // Change eligibility status
        int[] s3grades={10,10,0,9,10,10,10,10,10,10};
        Student student3= new Student("Jim", 18, "Male", 49, "Canadian", 3, 'B', 8.9, s3grades,0);
        student3.calculatePercentage();
        System.out.println("student: " + student3.getName());
        System.out.println("CGPA: " + student3.getCgpa());
        student3.canTalk();
        student3.canWalk();
        c=student3.paidfeeornot();
        student3.canVote(c);
        System.out.println();
        //Student 5
        int[] s5grades={10,10,10,9,10,10,10,10,10,10};
        Student student5=new Student("Seema", 21, "Female", 69, "Indian", 4, 'A', 9.9, s5grades,50000);
        student5.calculatePercentage();
        System.out.println("student: " + student5.getName());
        System.out.println("CGPA: " + student5.getCgpa());
        student5.canTalk();
        student5.canWalk();
        c=student5.paidfeeornot();
        student5.canVote(c);
        System.out.println();
    }
} 