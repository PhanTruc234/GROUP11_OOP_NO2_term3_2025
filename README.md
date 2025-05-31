# Project Quản Lý Sinh Viên

## Mô tả chung
Đây là một ứng dụng quản lý sinh viên được xây dựng bằng Java. Ứng dụng hỗ trợ quản lý các đối tượng chính như Giáo viên, Sinh viên, Môn học, Lớp học, Lịch học, Điểm danh và Điểm số. Các chức năng chính gồm thêm, sửa, xóa, và hiển thị danh sách cho từng loại đối tượng.

Ứng dụng sử dụng mô hình **CRUD** (Create, Read, Update, Delete) với thiết kế hướng đối tượng (OOP) và cấu trúc module rõ ràng.

## Cấu trúc project

- `QuanLySInhVien.src.controller`
  - `Main.java` — Điểm bắt đầu chạy chương trình.
  - `MenuController.java` — Quản lý menu, xử lý luồng điều khiển và gọi các chức năng quản lý tương ứng.
  
- `QuanLySInhVien.src.bin`
  - `CrudManager.java` — Quản lý các thao tác CRUD chung cho các đối tượng.
  - `DataMgr.java` — Singleton quản lý dữ liệu danh sách các đối tượng trong hệ thống.
  
- `QuanLySInhVien.src.models`
  - Các class mô hình dữ liệu: `Student`, `Teacher`, `Subject`, `ClassRoom`, `Schedule`, `Attendence`, `Score`, v.v.
  - `IKey` — Interface chuẩn để lấy khóa định danh (key) cho từng đối tượng.

- `QuanLySInhVien.src.test`
  - `TestMenuController.java` — Lớp để khởi chạy và test chương trình qua menu.

## Các chức năng chính

### Quản lý Giáo viên (Teacher)
- Thêm mới giáo viên.
- Sửa thông tin giáo viên.
- Xóa giáo viên.
- Hiển thị danh sách giáo viên.

### Quản lý Sinh viên (Student)
- Thêm mới sinh viên.
- Sửa thông tin sinh viên.
- Xóa sinh viên.
- Hiển thị danh sách sinh viên.

### Quản lý Môn học (Subject)
- Thêm mới môn học.
- Sửa thông tin môn học.
- Xóa môn học.
- Hiển thị danh sách môn học.

### Quản lý Lớp học (ClassRoom)
- Thêm mới lớp học.
- Sửa thông tin lớp học.
- Xóa lớp học.
- Hiển thị danh sách lớp học.

### Quản lý Lịch học (Schedule)
- Thêm mới lịch học.
- Sửa thông tin lịch học.
- Xóa lịch học.
- Hiển thị danh sách lịch học.

### Quản lý Điểm danh (Attendence)
- Thêm mới điểm danh.
- Sửa điểm danh.
- Xóa điểm danh.
- Hiển thị danh sách điểm danh.

### Quản lý Điểm số (Score)
- Thêm mới điểm số.
- Sửa điểm số.
- Xóa điểm số.
- Hiển thị danh sách điểm số.

## Cách chạy chương trình

1. Clone hoặc tải project về máy.
2. Mở project trong IDE hỗ trợ Java (Eclipse, IntelliJ IDEA, NetBeans,...).
3. Biên dịch toàn bộ source code.
4. Chạy class `QuanLySInhVien.src.controller.Main` để bắt đầu chương trình.
5. Sử dụng menu điều khiển để thao tác với các đối tượng.

## Yêu cầu

- JDK 8 hoặc cao hơn.
- IDE hoặc môi trường biên dịch Java chuẩn.

## Hướng phát triển tiếp

- Lưu dữ liệu ra file hoặc database để lưu trữ bền vững.
- Thêm tính năng tìm kiếm, sắp xếp nâng cao.
- Tích hợp giao diện đồ họa (GUI) cho thân thiện hơn.
- Thêm xác thực và bảo mật thông tin.

## Liên hệ

Nếu có câu hỏi hoặc góp ý, vui lòng liên hệ:

- Email: your.email@example.com
- GitHub: https://github.com/yourusername

---

*Project được phát triển bởi [Tên bạn hoặc nhóm bạn]*  
*Ngày cập nhật: 2025*
