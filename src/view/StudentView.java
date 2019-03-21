package view;

import controller.abtract.ApplicationController;

import java.util.Scanner;

public class StudentView implements GenerateMenu {

    public void menu(ApplicationController controller){
        Scanner sc = new Scanner(System.in);

        System.out.println("---- Quản lý sinh viên ----");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Sửa sinh viên");
        System.out.println("3. Danh sách sinh viên");
        System.out.println("4. Tìm kiếm sinh viên");
        System.out.println("5. Xóa sinh viên");
        System.out.println("0. Quay lại \n");
        System.out.println("Nhập lựa chọn của bạn:");
        int choice = sc.nextInt();
        String id;
        switch (choice){
            case 1:
                controller.add();
                break;
            case 2:
                System.out.println("Vui lòng nhập ID sinh viên: \n");
                id = sc.nextLine();
                controller.edit(id);
                break;
            case 3:
                controller.printList();
                break;
            case 4:
                System.out.println("Vui lòng nhập ID sinh viên: \n");
                id = sc.nextLine();
                controller.find(id);
                break;
            case 5:
                System.out.println("Vui lòng nhập ID sinh viên: \n");
                id = sc.nextLine();
                controller.destroy(id);
                break;
            case 0:
                MainView.mainView();
                break;
            default:
                System.out.println("Lựa chọn sai vui lòng chọn lại!");
                break;
        }
    }

}
