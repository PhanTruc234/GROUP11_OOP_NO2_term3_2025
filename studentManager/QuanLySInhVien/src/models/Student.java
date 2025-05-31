package QuanLySInhVien.src.models;

import java.util.Scanner;

import QuanLySInhVien.src.bin.DataMgr;
import QuanLySInhVien.src.controller.MenuController;

@SuppressWarnings("resource")
public class Student extends People implements IKey {
    private String studentId;

    public Student() {
    }

    public Student(String studentId, String fullname, String gender, String address, String birthday) {
        super(fullname, gender, address, birthday);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public void input() {
        super.input();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rollNo: ");
        for (;;) {
            studentId = scan.nextLine();
            boolean isExist = MenuController.getInstance().checkExist(
                    DataMgr.getInstance().getStudents(), studentId);
            if (isExist) {
                System.err.println("Enter again: ");
            } else {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", rollNo: " + studentId;
    }

    @Override
    public String getKeyValue() {
        return studentId;
    }

    @Override
    public boolean compareTo(Object obj) {
        if (obj instanceof Student) {
            if (((Student) obj).studentId.equalsIgnoreCase(studentId)) {
                return true;
            }
        }
        return false;
    }
}
