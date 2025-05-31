package QuanLySInhVien.src.models;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Score implements IKey {
    private String studentId;
    private String subjectId;
    private double score;

    public Score() {
    }

    public Score(String studentId, String subjectId, double score) {
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.score = score;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        studentId = scanner.nextLine();

        System.out.print("Enter subject ID: ");
        subjectId = scanner.nextLine();

        System.out.print("Enter score: ");
        score = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public String getKeyValue() {
        return studentId + "-" + subjectId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Score other = (Score) obj;
        return studentId.equalsIgnoreCase(other.studentId)
                && subjectId.equalsIgnoreCase(other.subjectId);
    }

    @Override
    public int hashCode() {
        return studentId.toLowerCase().hashCode() * 31 + subjectId.toLowerCase().hashCode();
    }

    @Override
    public boolean compareTo(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Score))
            return false;

        Score other = (Score) obj;
        return this.studentId.equalsIgnoreCase(other.studentId)
                && this.subjectId.equalsIgnoreCase(other.subjectId);
    }

    @Override
    public String toString() {
        return "Score [studentId=" + studentId + ", subjectId=" + subjectId + ", score=" + score + "]";
    }
}
