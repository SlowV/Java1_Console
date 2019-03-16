package controller;

import entity.Student;
import view.StudentView;

import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class StudentController {

    private static ArrayList<Student> studentArrayList = new ArrayList<>();

    public void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("------- THÊM SINH VIÊN -------");
        System.out.println("Ma sinh vien: ");
        String maSv = scanner.nextLine();
        System.out.println("Ten sinh vien: ");
        String ten = scanner.nextLine();
        System.out.println("Email sinh vien:");
        String email = scanner.nextLine();
        System.out.println("Tuoi sinh vien:");
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dia chi sinh vien:");
        String address = scanner.nextLine();
        System.out.println("So dien thoai sinh vien:");
        String phone =  scanner.nextLine();

        Student student = new Student(maSv, ten, email, tuoi, address, phone);

        studentArrayList.add(student);

        System.out.println("Them sinh vien thanh cong!");
        System.out.println("-----*-------*-------*-----");

        System.out.println();

        StudentView studentView = new StudentView();

        studentView.generateMenu();
    }

    public void listStudent(){
        if (studentArrayList.isEmpty()){
            studentArrayList.add(new Student("A001", "Hoai Anh", "AnhHoai2k@gmail.com", 18, "Ha Noi", "0123456789"));
            studentArrayList.add(new Student("A002", "Hoai Em", "AnhEm2k@gmail.com", 19, "Ha Nam", "0123456789"));
            studentArrayList.add(new Student("A003", "Hoai Chi", "AnhChi2k@gmail.com", 20, "Ha Giang", "0123456789"));
        }

        System.out.println("\t \t \t \t \t \t \t  \t \t \t \t \t \t \t \t DANH SACH SINH VIEN \n");
        System.out.println( String.format("%-10s|", "STT")
                + String.format("%-20s|", " Ma Sv")
                + String.format("%-20s|", " Ten sinh vien")
                + String.format("%-25s|", " Email")
                + String.format("%-15s|", " Tuoi")
                + String.format("%-20s|", " Dia chi")
                + String.format("%-20s", " So dien thoai"));
        System.out.println("------------------------------------------------------------" +
                "-----------------------------------------------------------------------");
        for (int i = 0; i < studentArrayList.size(); i++) {
            System.out.println(String.format("%-10d| ", i + 1)
                    + String.format("%-19s| ", studentArrayList.get(i).getId())
                    + String.format("%-19s| ", studentArrayList.get(i).getName())
                    + String.format("%-24s| ", studentArrayList.get(i).getEmail())
                    + String.format("%-14d| ", studentArrayList.get(i).getAge())
                    + String.format("%-19s| ", studentArrayList.get(i).getAddress())
                    + String.format("%-20s ", studentArrayList.get(i).getPhone()));
            System.out.println("------------------------------------------------------------" +
                    "-----------------------------------------------------------------------");
        }
    }
}
