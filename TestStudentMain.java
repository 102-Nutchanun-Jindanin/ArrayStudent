public class TestStudentMain {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("11001", "สมชาย", "วิทยาการคอมพิวเตอร์", 3.70);
        students[1] = new Student("11002", "สมหญิง", "เทคโนโลยีสารสนเทศ", 3.60);
        students[2] = new Student("11003", "สมปอง", "วิศวกรรมซอฟต์แวร์", 4.00);
        for (int i = 0; i < students.length; i++) {
            students[i].displayInfo();
        }
    }
}
//68122250102 ณัฐชนันท์ จินดานิล 