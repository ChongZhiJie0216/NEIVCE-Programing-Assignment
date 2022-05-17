package IntroductionProgramming.Assignment02;

import java.util.ArrayList;
import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> ids = new ArrayList<>();
        ArrayList<String> grades = new ArrayList<>();
        ArrayList<Integer> workingHours = new ArrayList<>();
        ArrayList<Integer> overtimesHours = new ArrayList<>();

        System.out.print("Enter amount of employee:");
        int qty = scanner.nextInt();
        double total = 0.0;
        for (int i = 0; i < qty; i++) {
            System.out.print("Enter Employee Name:");
            String name = scanner.next();
            names.add(name);

            System.out.print("Enter Employee ID:");
            String id = scanner.next();
            ids.add(id);

            System.out.println("Grade (A=100,B=75,C=50)(Please enter alphabet):");
            String grade = scanner.next();
            grades.add(grade);
            //int hourrate =getHourRate(grade);

            System.out.print("Enter Working Hours (months):");
            int workinghour = scanner.nextInt();
            workingHours.add(workinghour);

            System.out.println("Enter Overtime Hour:");
            int overtimehour = scanner.nextInt();
            overtimesHours.add(overtimehour);

            if (overtimehour == 0) {
                total += calcWage(workinghour, "Normal", grade);
            } else {
                total += calcWage(workinghour, "Overtime", grade);
            }
        }
        System.out.println("                                          " + "PAYROLL" + "                                                 ");
        System.out.println("========================================================================================================");
        System.out.println("EmployeeName   EmployeeID   Grades  HourRate(RM)   WorkingHours(M)    OvertimeHours(M)   GrossWages(RM)");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < names.size(); i++) {
            double wage =0.0;
            if ( overtimesHours.get(i)== 0) {
                wage = calcWage(workingHours.get(i), "Normal", grades.get(i));
            } else {
                wage = calcWage(workingHours.get(i), "Overtime", grades.get(i));
            }
            System.out.printf("%-16s %-12s %-8s %-15s %-19s %-17s %-14s %n", names.get(i),ids.get(i), grades.get(i), getHourRate(grades.get(i)), workingHours.get(i), overtimesHours.get(i), wage);
        }
        System.out.println("========================================================================================================");
        System.out.println("                                                                                             "+total);
        System.out.println("");
        System.out.println("========================================================================================================");
        System.out.println("Normal Rate = Working Hours * Hour Rate");
        System.out.println("OverTime Rate = Hour Rate * (Working Hours+OT Hours) * 1.25");
    }

    public static double calcWage(int workingHours, String type,String grades) {
        int hourrate =getHourRate(grades);
        double wage =0.0;
        if (type.equals("Normal")){
            wage = hourrate * workingHours;
        } else if (type.equals("Overtime")) {
            wage = hourrate * workingHours * 1.25;
        }
        return wage;
    }
    public static int getHourRate(String grade) {
        int hourRate = 0;
        if(grade.equalsIgnoreCase("A")) {
            hourRate = 100;
        }else if(grade.equalsIgnoreCase("B")) {
            hourRate = 75;
        }else if(grade.equalsIgnoreCase("C")) {
            hourRate = 50;
        }
        return hourRate;
    }
}
