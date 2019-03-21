package controller.abtract;


import entity.Student;
import sun.applet.Main;
import view.EmployeeView;
import view.GenerateMenu;
import view.MainView;
import view.StudentView;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

import static utility.UtilitySystem.clear;
import static utility.UtilitySystem.statusToString;

public class StudentControlller implements ApplicationController {

    private static ArrayList<Student> studentArrayList = new ArrayList<>();

    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        String rollNumber;
        String name;
        String email;
        int age;
        String address;
        String phone;
        int status;
        while (true) {
            System.out.println("Mã sinh viên ");
            rollNumber = sc.nextLine();
            System.out.println("Họ và tên: ");
            name = sc.nextLine();
            System.out.println("Email: ");
            email = sc.nextLine();
            System.out.println("Tuổi: ");
            age = sc.nextInt();
            sc.nextLine();
            System.out.println("Địa chỉ: ");
            address = sc.nextLine();
            System.out.println("Số điện thoại: ");
            phone = sc.nextLine();
            System.out.println("Trạng thái(1 ACTIVE, 2 DEACTIVE):  ");
            status = sc.nextInt();

            while (true){
                if(status == 1 || status == 2){
                    break;
                }else{
                    System.out.println("Nhập trạng thái sai, vui lòng nhập 1(ACTIVE) hoặc 2(DEACTIVE)");
                    status = sc.nextInt();
                }
            }

            boolean checkExistRollNumber = true;
            while (checkExistRollNumber){
                checkExistRollNumber = checkExistRollNumber(rollNumber);
                System.out.println("Mã sinh viên đã tồn tại! \n");
                System.out.println("Nhập mã sinh viên mới :");
                rollNumber = sc.nextLine();
            }

            Student student = new Student(name, email, age, address, phone, status, rollNumber);
            studentArrayList.add(student);

            System.out.println("Thêm sinh viên thành công! bạn có muốn tiếp tục thêm sinh viên ? \n");
            System.out.println("1. Đồng ý \t \t 2. Quay lại \n");
            System.out.println("Nhập lựa chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice ==  2){
                MainView.mainView();
                break;
            }

        }
    }

    @Override
    public void printList() {
        Scanner sc = new Scanner(System.in);
        String statusString = "";
        if (studentArrayList.isEmpty()){
            studentArrayList.add(new Student("Trịnh Quốc Việt", "quocviet.hn98@gmail.com", 42, "Xuân phương - Hà Nội", "0349555602", 1, "A001"));
            studentArrayList.add(new Student("Trịnh Hoàng Loan", "hoangloan2025@gmail.com", 15, "Xuân phương - Hà Nội", "0349555602", 1, "A002"));
            studentArrayList.add(new Student("Trịnh Hoàng Nam", "hoangnam2028@gmail.com", 12, "Xuân phương - Hà Nội", "0349555602", 1, "A003"));
            studentArrayList.add(new Student("Trịnh Hoàng Yến", "hoangyen2031@gmail.com", 8, "Xuân phương - Hà Nội", "0349555602", 1, "A004"));
            studentArrayList.add(new Student("Vũ Hoài Anh", "hoaianh.hn20@gmail.com", 40, "Xuân phương - Hà Nội", "0349555602", 1, "A005"));
        }

        System.out.println("Tổng số sinh viên: " + studentArrayList.size() + "\t \t \t  \t \t \t \t \t \t \t \t DANH SÁCH SINH VIÊN \n");
        System.out.println( String.format("%-9s|", "STT")
                + String.format("%-15s|", " Mã SV")
                + String.format("%-20s|", " Họ và tên")
                + String.format("%-25s|", " Email")
                + String.format("%-10s|", " Tuổi")
                + String.format("%-40s|", " Địa chỉ")
                + String.format("%-20s|", " Số điện thoại")
                + String.format("%-10s", " Trạng thái"));
        System.out.println("------------------------------------------------------------" +
                "-----------------------------------------------------------------------------------------------------");
        for (int i = 0; i < studentArrayList.size(); i++) {
            statusString = statusToString(studentArrayList.get(i).getStatus());
            System.out.println(String.format("%-9d| ", i + 1)
                    + String.format("%-14s| ", studentArrayList.get(i).getRollNumber())
                    + String.format("%-19s| ", studentArrayList.get(i).getName())
                    + String.format("%-24s| ", studentArrayList.get(i).getEmail())
                    + String.format("%-9d| ", studentArrayList.get(i).getAge())
                    + String.format("%-39s| ", studentArrayList.get(i).getAddress())
                    + String.format("%-19s| ", studentArrayList.get(i).getPhone())
                    + String.format("%-10s ", statusString));
            System.out.println("------------------------------------------------------------" +
                    "-----------------------------------------------------------------------------------------------------");
        }
        System.out.println("<====  Ấn enter để quay lại!");
        sc.nextLine();
        MainView.mainView();
    }

    @Override
    public void edit(String id) {

    }

    @Override
    public void destroy(String id) {

    }

    @Override
    public void find(String id) {

    }

    private boolean checkExistRollNumber(String rollNumber){
        if (studentArrayList != null){
            for (Student student : studentArrayList) {
                if ( rollNumber.equals(student.getRollNumber())) {
                    return true;
                }
            }
        }
        return false;
    }
}
