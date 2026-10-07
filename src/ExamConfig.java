public class ExamConfig {
    public static int examYear;
    public static double registrationFee;
    public static String gradingPolicy;

    static {
        System.out.println("[STATIC BLOCK - ExamConfig] Loading central UNEB examination settings...");
        examYear = 2026;
        registrationFee = 150000.0;
        gradingPolicy = "UNEB Standard Grading Policy v2026";
        System.out.println("[STATIC BLOCK - ExamConfig] Settings loaded successfully.");
        System.out.println("------------------------------------------------------------");
    }
}

// branch name : branch 5