import entity.Student;
import view.StudentView;

import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        studentView.generateMenu();
    }
}
