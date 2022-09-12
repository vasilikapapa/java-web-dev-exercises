package exercises.school;

public class Student {
private String name;
private int studentId;
private double gpa;
private int numberOfCredits;

    public Student(String name, int studentId, double gpa, int numberOfCredits){
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
        this.numberOfCredits = numberOfCredits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }
}

