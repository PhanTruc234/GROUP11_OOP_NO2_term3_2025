package QuanLySInhVien.src.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@SuppressWarnings("resource")
public class Attendence implements IKey {
    enum STATUS {
        PRESENT, ABSENT, PA
    };

    private String studentId;
    private int scheduleId;
    private String createdAt, updatedAt;
    private STATUS status;

    public Attendence() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID:");
        studentId = scanner.nextLine();
        System.out.println("Enter schedule ID:");
        scheduleId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter status:");
        System.out.println("1 - PRESENT");
        System.out.println("2 - ABSENT");
        System.out.println("3 - PA");
        System.out.print("Choose: ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                status = STATUS.PRESENT;
                break;
            case 2:
                status = STATUS.ABSENT;
                break;
            default:
                status = STATUS.PA;
                break;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        Date date = new Date();
        createdAt = simpleDateFormat.format(date);
        updatedAt = createdAt;
    }

    @Override
    public String toString() {
        return "Attendence [studentId=" + studentId + ", scheduleId=" + scheduleId + ", createdAt=" + createdAt
                + ", updatedAt=" + updatedAt + ", status=" + getStatusString() + "]";
    }

    public String getStatusString() {
        switch (status) {
            case PRESENT:
                return "Present";
            case ABSENT:
                return "Absent";
            default:
                return "Pa";
        }
    }

    @Override
    public String getKeyValue() {
        return studentId + "-" + scheduleId + "-" + createdAt;
    }

    @Override
    public boolean compareTo(Object obj) {
        if (obj instanceof Attendence) {
            Attendence other = (Attendence) obj;
            return this.getKeyValue().equalsIgnoreCase(other.getKeyValue());
        }
        return false;
    }
}
