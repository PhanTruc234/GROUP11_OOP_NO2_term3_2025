package QuanLySInhVien.src.controller;

import java.util.Scanner;

import QuanLySInhVien.src.bin.CrudManager;
import QuanLySInhVien.src.bin.DataMgr;
import QuanLySInhVien.src.models.Attendence;
import QuanLySInhVien.src.models.ClassRoom;
import QuanLySInhVien.src.models.IKey;
import QuanLySInhVien.src.models.Schedule;
import QuanLySInhVien.src.models.Score;
import QuanLySInhVien.src.models.Student;
import QuanLySInhVien.src.models.Subject;
import QuanLySInhVien.src.models.Teacher;

public class MenuController {
    private static MenuController instance = null;
    Scanner scan = new Scanner(System.in);
    private CrudManager<Teacher> teacherMgr = new CrudManager<>();
    private CrudManager<Student> studentMgr = new CrudManager<>();
    private CrudManager<Subject> subjectMgr = new CrudManager<>();
    private CrudManager<ClassRoom> classRoomMgr = new CrudManager<>();
    private CrudManager<Schedule> scheduleMgr = new CrudManager<>();
    private CrudManager<Attendence> attendenceMgr = new CrudManager<>();
    private CrudManager<Score> scoreMgr = new CrudManager<>();

    private MenuController() {
    }

    public <T extends IKey> boolean checkExist(java.util.List<T> list, String key) {
        for (T item : list) {
            if (item.getKeyValue().equalsIgnoreCase(key)) {
                return true;
            }
        }
        return false;
    }

    public synchronized static MenuController getInstance() {
        if (instance == null) {
            instance = new MenuController();
        }
        return instance;
    }

    public void showMenu() {
        System.out.println("\n===== MAIN MENU =====");
        System.out.println("1. Manage Teacher");
        System.out.println("2. Manage Student");
        System.out.println("3. Manage Subject");
        System.out.println("4. Manage ClassRoom");
        System.out.println("5. Manage Schedule");
        System.out.println("6. Manage Attendence");
        System.out.println("7. Manage Score");
        System.out.println("8. Exit");
        System.out.print("Choose: ");
    }

    public void manageTeachers() {
        for (;;) {
            System.out.println("\n--- Manage Teachers ---");
            System.out.println("1. Add teacher");
            System.out.println("2. Edit teacher");
            System.out.println("3. Delete teacher");
            System.out.println("4. Print teacher list");
            System.out.println("5. Back");
            System.out.print("Choose: ");

            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    teacherMgr.add(DataMgr.getInstance().getTeachers(), () -> {
                        Teacher t = new Teacher();
                        t.input();
                        return t;
                    });
                    break;
                case "2":
                    teacherMgr.edit(DataMgr.getInstance().getTeachers(), (t) -> {
                        System.out.println("Editing teacher " + t.getKeyValue());
                        t.input();
                    });
                    break;
                case "3":
                    teacherMgr.delete(DataMgr.getInstance().getTeachers());
                    break;
                case "4":
                    teacherMgr.print(DataMgr.getInstance().getTeachers());
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void manageStudents() {
        for (;;) {
            System.out.println("\n--- Manage Students ---");
            System.out.println("1. Add student");
            System.out.println("2. Edit student");
            System.out.println("3. Delete student");
            System.out.println("4. Print student list");
            System.out.println("5. Back");
            System.out.print("Choose: ");

            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    studentMgr.add(DataMgr.getInstance().getStudents(), () -> {
                        Student s = new Student();
                        s.input();
                        return s;
                    });
                    break;
                case "2":
                    studentMgr.edit(DataMgr.getInstance().getStudents(), (s) -> {
                        System.out.println("Editing student " + s.getKeyValue());
                        s.input();
                    });
                    break;
                case "3":
                    studentMgr.delete(DataMgr.getInstance().getStudents());
                    break;
                case "4":
                    studentMgr.print(DataMgr.getInstance().getStudents());
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void manageSubjects() {
        for (;;) {
            System.out.println("\n--- Manage Subjects ---");
            System.out.println("1. Add subject");
            System.out.println("2. Edit subject");
            System.out.println("3. Delete subject");
            System.out.println("4. Print subject list");
            System.out.println("5. Back");
            System.out.print("Choose: ");

            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    subjectMgr.add(DataMgr.getInstance().getSubjects(), () -> {
                        Subject sb = new Subject();
                        sb.input();
                        return sb;
                    });
                    break;
                case "2":
                    subjectMgr.edit(DataMgr.getInstance().getSubjects(), (sb) -> {
                        System.out.println("Editing subject " + sb.getKeyValue());
                        sb.input();
                    });
                    break;
                case "3":
                    subjectMgr.delete(DataMgr.getInstance().getSubjects());
                    break;
                case "4":
                    subjectMgr.print(DataMgr.getInstance().getSubjects());
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void manageScores() {
        for (;;) {
            System.out.println("\n--- Manage Scores ---");
            System.out.println("1. Add score");
            System.out.println("2. Edit score");
            System.out.println("3. Delete score");
            System.out.println("4. Print score list");
            System.out.println("5. Back");
            System.out.print("Choose: ");

            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    scoreMgr.add(DataMgr.getInstance().getScores(), () -> {
                        Score sc = new Score();
                        sc.input();
                        return sc;
                    });
                    break;
                case "2":
                    scoreMgr.edit(DataMgr.getInstance().getScores(), (sc) -> {
                        System.out.println("Editing score " + sc.getKeyValue());
                        sc.input();
                    });
                    break;
                case "3":
                    scoreMgr.delete(DataMgr.getInstance().getScores());
                    break;
                case "4":
                    scoreMgr.print(DataMgr.getInstance().getScores());
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void manageClassRooms() {
        for (;;) {
            System.out.println("\n--- Manage ClassRooms ---");
            System.out.println("1. Add classroom");
            System.out.println("2. Edit classroom");
            System.out.println("3. Delete classroom");
            System.out.println("4. Print classroom list");
            System.out.println("5. Back");
            System.out.print("Choose: ");

            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    classRoomMgr.add(DataMgr.getInstance().getClassRooms(), () -> {
                        ClassRoom c = new ClassRoom();
                        c.input();
                        return c;
                    });
                    break;
                case "2":
                    classRoomMgr.edit(DataMgr.getInstance().getClassRooms(), (c) -> {
                        System.out.println("Editing classroom " + c.getKeyValue());
                        c.input();
                    });
                    break;
                case "3":
                    classRoomMgr.delete(DataMgr.getInstance().getClassRooms());
                    break;
                case "4":
                    classRoomMgr.print(DataMgr.getInstance().getClassRooms());
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void manageSchedules() {
        for (;;) {
            System.out.println("\n--- Manage Schedules ---");
            System.out.println("1. Add schedule");
            System.out.println("2. Edit schedule");
            System.out.println("3. Delete schedule");
            System.out.println("4. Print schedule list");
            System.out.println("5. Back");
            System.out.print("Choose: ");

            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    scheduleMgr.add(DataMgr.getInstance().getSchedules(), () -> {
                        Schedule sch = new Schedule();
                        sch.input();
                        return sch;
                    });
                    break;
                case "2":
                    scheduleMgr.edit(DataMgr.getInstance().getSchedules(), (sch) -> {
                        System.out.println("Editing schedule " + sch.getKeyValue());
                        sch.input();
                    });
                    break;
                case "3":
                    scheduleMgr.delete(DataMgr.getInstance().getSchedules());
                    break;
                case "4":
                    scheduleMgr.print(DataMgr.getInstance().getSchedules());
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void manageAttendences() {
        for (;;) {
            System.out.println("\n--- Manage Attendences ---");
            System.out.println("1. Add attendence");
            System.out.println("2. Edit attendence");
            System.out.println("3. Delete attendence");
            System.out.println("4. Print attendence list");
            System.out.println("5. Back");
            System.out.print("Choose: ");

            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    attendenceMgr.add(DataMgr.getInstance().getAttendences(), () -> {
                        Attendence a = new Attendence();
                        a.input();
                        return a;
                    });
                    break;
                case "2":
                    attendenceMgr.edit(DataMgr.getInstance().getAttendences(), (a) -> {
                        System.out.println("Editing attendence " + a.getKeyValue());
                        a.input();
                    });
                    break;
                case "3":
                    attendenceMgr.delete(DataMgr.getInstance().getAttendences());
                    break;
                case "4":
                    attendenceMgr.print(DataMgr.getInstance().getAttendences());
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void start() {
        while (true) {
            showMenu();
            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    manageTeachers();
                    break;
                case "2":
                    manageStudents();
                    break;
                case "3":
                    manageSubjects();
                    break;
                case "4":
                    manageClassRooms();
                    break;
                case "5":
                    manageSchedules();
                    break;
                case "6":
                    manageAttendences();
                    break;
                case "7":
                    manageScores();
                    break;
                case "8":
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
