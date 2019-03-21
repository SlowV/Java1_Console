package view;

import controller.abtract.ApplicationController;
import controller.abtract.EmployeeController;
import controller.abtract.StudentControlller;
import controller.abtract.TeacherController;

import java.util.Scanner;

public class MainView {

    public static void mainView(){
        ApplicationController controller = null;
        GenerateMenu generateMenu = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("---------- Quản lý FPT APTECH ---------");
        System.out.println("1. Sinh viên");
        System.out.println("2. Nhân viên");
        System.out.println("3. Giáo viên");
        System.out.println("0. Thoát \n");

        System.out.println("Nhập lựa chọn của bạn: ");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                controller =  new StudentControlller();
                generateMenu = new StudentView();
                break;
            case 2:
                controller = new EmployeeController();
                generateMenu = new EmployeeView();
                break;
            case 3:
                controller = new TeacherController();
                generateMenu = new TeacherView();
                break;
            case 0:
                System.out.println("Hẹn gặp lại!");
                break;
            default:
                System.out.println("Lựa chọn sai vui lòng chọn lại!");
                break;
        }

        if (generateMenu != null) {
            generateMenu.menu(controller);
        }
    }
}
