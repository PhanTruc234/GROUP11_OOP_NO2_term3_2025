package QuanLySInhVien.src.bin;

import java.util.ArrayList;
import java.util.List;

import QuanLySInhVien.src.models.Attendence;
import QuanLySInhVien.src.models.ClassRoom;
import QuanLySInhVien.src.models.Schedule;
import QuanLySInhVien.src.models.Score;
import QuanLySInhVien.src.models.Student;
import QuanLySInhVien.src.models.Subject;
import QuanLySInhVien.src.models.Teacher;

public class DataMgr {
    private static DataMgr instance = null;

    List<Student> students;
    List<Teacher> teachers;
    List<Subject> subjects;
    List<ClassRoom> classRooms;
    List<Schedule> schedules;
    List<Attendence> attendences;
    List<Score> scores;

    private DataMgr() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        subjects = new ArrayList<>();
        classRooms = new ArrayList<>();
        schedules = new ArrayList<>();
        attendences = new ArrayList<>();
        scores = new ArrayList<>();
    }

    public synchronized static DataMgr getInstance() {
        if (instance == null) {
            instance = new DataMgr();
        }
        return instance;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public List<ClassRoom> getClassRooms() {
        return classRooms;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public List<Attendence> getAttendences() {
        return attendences;
    }

    public List<Score> getScores() {
        return scores;
    }
}
