import controller.abtract.ApplicationController;
import controller.abtract.EmployeeController;
import controller.abtract.StudentControlller;
import entity.Student;
import view.MainView;
import view.StudentView;

import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        StudentView studentView = new StudentView();
//        studentView.GenerateMenu();
//
//        ApplicationController employeeController = new EmployeeController();
//
//        ApplicationController studentControlller = new StudentControlller();
//
//        employeeController.add();
//        employeeController.printList();
//
//        studentControlller.add();
//        studentControlller.printList();
        MainView.mainView();
    }
}
