package view;

import controller.StudentController;

import java.util.Scanner;

public class StudentView {

    public void generateMenu(){
        StudentController controller = new StudentController();
        Scanner sc = new Scanner(System.in);
        System.out.println("---------- QUẢN LÝ SINH VIÊN ---------");
        System.out.println("1. Thêm sinh viên.");
        System.out.println("2. Danh sách sinh viên.");
        System.out.println("0. Thoát.");

        System.out.println("Nhap lua chon cua ban!");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                controller.add();
                break;
            case 2:
                controller.listStudent();
                break;
            default:
                System.out.println("Lựa chọn sai vui lòng chọn lại!");
                break;
        }

    }

}
