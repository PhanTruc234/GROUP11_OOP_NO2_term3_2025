package QuanLySInhVien.src.models;

import java.util.Scanner;

@SuppressWarnings("resource")
public class People {
    private String fullName, gender, address, birthDay;

    public People() {
    }

    public People(String fullName, String gender, String address, String birthDay) {
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.birthDay = birthDay;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter fullname");
        fullName = scan.nextLine();
        System.out.println("Enter gender");
        gender = scan.nextLine();
        System.out.println("Enter address");
        address = scan.nextLine();
        System.out.println("Enter birthday");
        birthDay = scan.nextLine();
    }

    @Override
    public String toString() {
        return "fullName=" + fullName + ", gender=" + gender + ", address=" + address + ", birthDay=" + birthDay;
    }

}
