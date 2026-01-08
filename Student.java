public class Student {
    private String studentId;
    private String name;
    private String major;
    private double gpa;
    public static int studentCount = 0;
    /*public Student() {
        studentCount++;
    }
    public Student(String studentId) {
        this.studentId = studentId;
        studentCount++;
    }
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        studentCount++;
    }
    public Student(String studentId, String name, String major) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        studentCount++;
    }*/
    public Student(String studentId, String name, String major, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
        studentCount++;
    }
    public void displayInfo() {
        System.out.println("ID : " + studentId + " Name : " + name + " Major : " + major + " GPA : " + gpa);
    }
}
//68122250102 ณัฐชนันท์ จินดานิล 