package OOP.Assignment02.ZhiJie;

import java.util.Scanner;

public class RUN extends SystemRunning{
    public static void main(String[] args) {
        MenusCars menus =  new MenusCars();
        SystemRunning system = new SystemRunning();
        Scanner sc = new Scanner(System.in);
        int selection = 0;
        int exit = 0;
        while (true) {
            menus.MenuCars();
            System.out.print("Please Enter Option (0-5):");
            selection = sc.nextInt();
            if(selection >=5) {
                System.out.print("!!! Please Enter Under 5 Selection !!!");
            } else if (selection == 1) {
                system.CarEnter();
            } else if (selection == 2) {
                system.MotorbikeEnter();
            } else if (selection == 3) {
                system.CarExit();
            } else if (selection == 4) {
                system.MotorbikeExit();
            } else if (selection == 5) {
                system.check();
            }else if (selection ==0){
                system.exit();
            }
        }
        }
    }

