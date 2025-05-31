package QuanLySInhVien.src.models;

import java.util.Scanner;

import QuanLySInhVien.src.bin.DataMgr;
import QuanLySInhVien.src.controller.MenuController;

@SuppressWarnings("resource")
public class Teacher extends People implements IKey {
    private String teacherId;

    public Teacher() {
    }

    public Teacher(String fullName, String gender, String address, String birthDay, String teacherId) {
        super(fullName, gender, address, birthDay);
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public void input() {
        super.input();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter teacher code: ");
        for (;;) {
            teacherId = scan.nextLine();
            boolean isExist = MenuController.getInstance().checkExist(
                    DataMgr.getInstance().getTeachers(), teacherId);
            if (isExist) {
                System.err.println("Enter again: ");
            } else {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", teacher code: " + teacherId;
    }

    @Override
    public String getKeyValue() {
        return teacherId;
    }

    @Override
    public boolean compareTo(Object obj) {
        if (obj instanceof Teacher) {
            if (((Teacher) obj).teacherId.equals(teacherId)) {
                return true;
            }
        }
        return false;
    }
}
