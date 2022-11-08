package OOP.Assignment01.Question02;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Question02 {
    private String name;

    public Question02(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Question02> names = new ArrayList<Question02>();
        Menu menu = new Menu();
        int option = 0;
        System.out.println("Enter Subject Name:");
        String subject = sc.next();
        while (true) {
            menu.Menus();
            option = sc.nextInt();
            if (option == 1) {
                System.out.println("Add Student Name:");
                String add = sc.next();
                names.add(new Question02(add));
            }
            if (option == 2) {
                System.out.println("Enter Student Name");
                String del = sc.next();
                for (int i = 0; i < names.size(); i++) {
                    if (names.get(i).getName().equals(del)) {
                        names.remove(i);
                    }
                }
                names.remove(new Question02(del));
            }
            if (option == 3) {
                System.out.println("The student in the course:");
                for (int i = 0; i < names.size(); i++) {
                    names.get(i).getName();
                    System.out.println(names.get(i).getName());
                }
            }
            if (option == 0) {
                break;
            }
        }
    }
}