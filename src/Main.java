import quanlydanhba.DanhBa;
import quanlydanhba.GhiDocFile;
import quanlydanhba.QuanLyDanhBa;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        QuanLyDanhBa quanLyDanhBa = new QuanLyDanhBa();
        int choice = 0;
        do {
            System.out.println("--QUẢN LÝ DANH BẠ--");
            System.out.println(
                    "1.Xem Danh sách.\n" +
                            "2.Thêm mới.\n" +
                            "3.Tìm kiếm .\n" +
                            "4.Xoá khỏi danh.\n" +
                            "5.Cập nhật.\n"+
                    "6.Ghi vào file.\n"+
                    "7.Đọc Từ file.\n"+
                            "8.Thoát.\n"
            );
            System.out.println("Chọn chức năng");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                quanLyDanhBa.display();
            }else if (choice == 2) {
                System.out.println("Nhập tên :");
                String hoTen =scanner1.nextLine();
                System.out.println("Nhập Sđt:");
                String soDT = scanner1.nextLine();
                System.out.println("Nhập địa chỉ");
                String diaChi = scanner1.nextLine();
                System.out.println("Nhập Email");
                String Email = scanner1.nextLine();
                DanhBa db = new DanhBa(hoTen,soDT,diaChi,Email);
                quanLyDanhBa.add(db);
            }else if (choice == 3) {
                System.out.println("Nhập tên cần tìm");String hoTen = scanner.nextLine();
                System.out.println(quanLyDanhBa.search(hoTen));
            }else if (choice == 4) {
                System.out.println("Nhập tên cần xoá");String hoTen = scanner.nextLine();
                quanLyDanhBa.delete(hoTen);

            }else if (choice == 5) {
                System.out.println("Nhập tên để cập nhật");String hoTen3 = scanner.nextLine();
                System.out.println("Nhập tên :");
                String hoTen =scanner1.nextLine();
                System.out.println("Nhập Sđt:");
                String soDT = scanner1.nextLine();
                System.out.println("Nhập địa chỉ");
                String diaChi = scanner1.nextLine();
                System.out.println("Nhập Email");
                String Email = scanner1.nextLine();
                DanhBa bd = new DanhBa(hoTen,soDT,diaChi,Email);
                quanLyDanhBa.edit(hoTen3,bd);
            }else if (choice == 6) {
                GhiDocFile.writerToFile("file3.csv",quanLyDanhBa.getdanhba());
            }else if (choice==7) {
                GhiDocFile.readFromFile("file3.csv");

            }
        }while (choice != 8);

    }
}
