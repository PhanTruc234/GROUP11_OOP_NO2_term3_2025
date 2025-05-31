package QuanLySInhVien.src.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("resource")
public class Schedule implements IKey {
    private int scheduleId;
    private String teacherId;
    private Teacher teacher;
    private String subjectCode, classCode, createdAt, expiredAt;
    private List<String> teachingTime;
    private float fromTime, toTime;

    public Schedule() {
        teachingTime = new ArrayList<>();
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
    }

    public List<String> getTeachingTime() {
        return teachingTime;
    }

    public void setTeachingTime(List<String> teachingTime) {
        this.teachingTime = teachingTime;
    }

    public float getFromTime() {
        return fromTime;
    }

    public void setFromTime(float fromTime) {
        this.fromTime = fromTime;
    }

    public float getToTime() {
        return toTime;
    }

    public void setToTime(float toTime) {
        this.toTime = toTime;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter schedule ID: ");
        scheduleId = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter class code: ");
        classCode = scanner.nextLine();

        System.out.print("Enter subject code: ");
        subjectCode = scanner.nextLine();

        System.out.print("Enter teacher ID: ");
        teacherId = scanner.nextLine();

        System.out.print("Enter created at (format HH:mm:ss dd/MM/yyyy): ");
        createdAt = scanner.nextLine();

        System.out.print("Enter expired at (format HH:mm:ss dd/MM/yyyy): ");
        expiredAt = scanner.nextLine();

        System.out.print("Enter number of teaching time entries: ");
        int n = Integer.parseInt(scanner.nextLine());
        teachingTime.clear();
        for (int i = 0; i < n; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            teachingTime.add(scanner.nextLine());
        }

        System.out.print("Enter from time (float): ");
        fromTime = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter to time (float): ");
        toTime = Float.parseFloat(scanner.nextLine());
    }

    public void assignTeacher(List<Teacher> teacherList) {
        for (Teacher t : teacherList) {
            if (t.getTeacherId().equals(this.teacherId)) {
                this.teacher = t;
                break;
            }
        }
    }

    @Override
    public String toString() {
        String teacherInfo = (teacher != null) ? teacher.toString() : "No teacher assigned";
        return "Schedule [scheduleId=" + scheduleId + ", classCode=" + classCode + ", subjectCode=" + subjectCode +
                ", teacherId=" + teacherId + ", teacher=" + teacherInfo + ", createdAt=" + createdAt + ", expiredAt="
                + expiredAt + ", fromTime=" + fromTime + ", toTime=" + toTime + "]";
    }

    public void display() {
        System.out.println(toString());
        System.out.println("Teaching time:");
        for (String value : teachingTime) {
            System.out.println("- " + value);
        }
    }

    @Override
    public String getKeyValue() {
        return String.valueOf(scheduleId);
    }

    @Override
    public boolean compareTo(Object obj) {
        if (obj instanceof Schedule) {
            Schedule other = (Schedule) obj;
            return this.getKeyValue().equals(other.getKeyValue());
        }
        return false;
    }
}
