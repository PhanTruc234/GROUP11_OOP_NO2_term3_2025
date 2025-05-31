package QuanLySInhVien.src.models;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Subject implements IKey {
    private String subjectCode, subjectName;

    public Subject() {
    }

    public Subject(String subjectCode, String subjectName) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter subject code");
        subjectCode = scan.nextLine();
        System.out.println("Enter subject name");
        subjectName = scan.nextLine();
    }

    @Override
    public String toString() {
        return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + "]";
    }

    @Override
    public String getKeyValue() {
        return subjectCode;
    }

    @Override
    public boolean compareTo(Object obj) {
        if (obj instanceof Subject) {
            return ((Subject) obj).subjectCode.equalsIgnoreCase(this.subjectCode);
        }
        return false;
    }
}
