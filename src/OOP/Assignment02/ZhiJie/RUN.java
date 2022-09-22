package OOP.Assignment02.ZhiJie;

import java.util.Scanner;

public class RUN extends System {
    public static void main(String[] args) {
        System system = new System();
        Scanner sc = new Scanner(java.lang.System.in);
        int selection = 0;
        while (true) {
            system.Menu();
            java.lang.System.out.print("Please Enter Option (0-5):");
            selection = sc.nextInt();
            if(selection >=6) {
                java.lang.System.out.print("!!! Please Enter Under 5 Selection !!!");
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
                break;
            }
        }
    }
}

