public class Student {

    static {
        System.out.println("[STATIC BLOCK - Student] Student class definition loaded into memory.");
    }

    private String studentId;
    private String name;
    private String schoolName;
    private String registrationStatus;
    private String examCentre;

    {
        System.out.println("  [INSTANCE BLOCK] Initializing default candidate attributes...");
        this.registrationStatus = "PENDING_VERIFICATION";
        this.examCentre = "Central UNEB Assignment Centre";
    }

    public Student(String studentId, String name, String schoolName) {
        System.out.println("  [CONSTRUCTOR] Executing constructor for candidate: " + name);
        this.studentId = studentId;
        this.name = name;
        this.schoolName = schoolName;
        this.registrationStatus = "APPROVED";
    }

    public void displayStudentDetails() {
        System.out.println("  -> Candidate Profile: [ID: " + studentId + " | Name: " + name +
                " | School: " + schoolName + " | Centre: " + examCentre +
                " | Status: " + registrationStatus + "]\n");
    }
}
// branch name : branch 2