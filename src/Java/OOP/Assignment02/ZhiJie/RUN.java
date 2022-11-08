package OOP.Assignment02.ZhiJie;

import java.util.Scanner;

public class RUN extends ParkingSystem {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem();
        Scanner sc = new Scanner(java.lang.System.in);
        int selection = 0;
        while (true) {
            parkingSystem.Menu();
            java.lang.System.out.print("Please Enter Option (0-3):");
            selection = sc.nextInt();
            if(selection >=4) {
                java.lang.System.out.print("!!! Please Enter Under 3 Selection !!!");
            } else if (selection == 1) {
                parkingSystem.vehicleEntry();
            } else if (selection == 2) {
                parkingSystem.vehicleExit();
            } else if (selection == 3) {
               parkingSystem.vehicleStatus();
            }else if (selection ==0){
                parkingSystem.exit();
                break;
            }
        }
    }
}

