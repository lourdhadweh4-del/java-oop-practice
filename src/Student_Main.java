class Student {
    int studentID;
    String name;
    int grade;

    public Student () { // a default constructor doesn't take a value

        this(0, "Unknown", 0);

    }
    public Student(int studentID, String name, int grade) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;

    }
}
    public class Student_Main {
        public static void main(String[] args) {
            Student B1 = new Student (1987, "Tom", 90);
            System.out.println("Student ID is: "+ B1.studentID + "\nName is: " + B1.name + "\nGrade is: " + B1.grade);

        }
    }

