public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   UNEB CANDIDATE REGISTRATION SYSTEM STARTUP");
        System.out.println("==================================================\n");

        System.out.println("--- STEP 1: Fetching General Exam Configuration ---");
        System.out.println("Exam Year: " + ExamConfig.examYear);
        System.out.println("Registration Fee: " + ExamConfig.registrationFee + " UGX");
        System.out.println("Grading Policy: " + ExamConfig.gradingPolicy + "\n");

        System.out.println("--- STEP 2: Registering First Candidate ---");
        Student student1 = new Student("U123/001", "Asem Ahmed", "Kampala SS");
        student1.displayStudentDetails();

        System.out.println("--- STEP 3: Registering Second Candidate ---");
        Student student2 = new Student("U123/002", "Sarah Namubiru", "Gayaza High School");
        student2.displayStudentDetails();

        System.out.println("==================================================");
        System.out.println("   REGISTRATION PROCESS COMPLETED SUCCESSFULLY");
        System.out.println("==================================================");
    }
}
// branch name : branch 5