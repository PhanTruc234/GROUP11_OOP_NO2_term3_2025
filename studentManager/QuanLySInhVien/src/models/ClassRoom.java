package QuanLySInhVien.src.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("resource")
public class ClassRoom implements IKey {
    private String classCode;
    private String className;
    private Teacher teacher;
    private Subject subject;
    private List<Student> studentList;

    public ClassRoom() {
        studentList = new ArrayList<>();
    }

    public ClassRoom(String classCode, String className, Teacher teacher, Subject subject) {
        this.classCode = classCode;
        this.className = className;
        this.teacher = teacher;
        this.subject = subject;
        this.studentList = new ArrayList<>();
    }

    // Getter - Setter
    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        if (student != null) {
            studentList.add(student);
        }
    }

    public boolean removeStudentById(String studentId) {
        return studentList.removeIf(s -> s.getStudentId().equals(studentId));
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter class code: ");
        classCode = scan.nextLine();

        System.out.print("Enter class name: ");
        className = scan.nextLine();

        System.out.println("--- Enter teacher information ---");
        teacher = new Teacher();
        teacher.input();

        System.out.println("--- Enter subject information ---");
        subject = new Subject();
        subject.input();
    }

    public void printStudentList() {
        System.out.println("=== Student List ===");
        if (studentList.isEmpty()) {
            System.out.println("No students in class.");
        } else {
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
    }

    @Override
    public String toString() {
        return "ClassRoom [classCode=" + classCode +
                ", className=" + className +
                ", teacher=" + (teacher != null ? teacher.getFullName() : "None") +
                ", subject=" + (subject != null ? subject.getSubjectName() : "None") +
                ", totalStudents=" + studentList.size() + "]";
    }

    @Override
    public String getKeyValue() {
        return this.classCode;
    }

    @Override
    public boolean compareTo(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof ClassRoom))
            return false;
        ClassRoom other = (ClassRoom) obj;
        return this.classCode.equals(other.classCode);
    }
}
