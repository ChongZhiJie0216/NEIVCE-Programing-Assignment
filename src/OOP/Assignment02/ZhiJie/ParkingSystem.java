package OOP.Assignment02.ZhiJie;

import java.util.ArrayList;
import java.util.Scanner;

public class ParkingSystem extends Vehicle {
    static ArrayList<Vehicle> Parking = new ArrayList<Vehicle>();
    int exit = 0;
    int t = 0;
    int w = 0;
    long times = 0;
    long totaltimes = 0;
    double totalprice = 0;
    Scanner sc = new Scanner(System.in);

    void Menu() {
        System.out.println("\n");
        System.out.println("New Era University Car Management & Parking System");
        System.out.println("Select one option");
        System.out.println("1.Entry Vehicle ");
        System.out.println("2.Vehicle Exit");
        System.out.println("3.Parking Status");
        System.out.println("0.Exit");
    }

    void vehicleEntry() {
        Vehicle vehicle = null;
        System.out.println("Select one option");
        System.out.println("1.Car");
        System.out.println("2.Motorbike");
        System.out.print("Please Enter Selection (1-2):");
        int vehicles = sc.nextInt();
        sc.nextLine();
        if (vehicles == 1) {
            vehicle = new Car();
        } else if (vehicles == 2) {
            vehicle = new Motorbike();
        } else {
            System.out.println("Please Reenter Selection(1/2)");
            return;
        }
        System.out.print("Enter Vehicle Plate:");
        vehicle.setModel(sc.nextLine());
        System.out.print("Enter Vehicle Color:");
        vehicle.setColor(sc.nextLine());
        t++;
        vehicle.setTicket(t);
        Parking.add(vehicle);
        System.out.print("\nThe Plate of this Vehicle is:" + vehicle.getModel());
        System.out.print("\nThe Color of this Vehicle is:" + vehicle.getColor());
        System.out.print("\nThe Wheel of this Vehicle is:" + vehicle.getWheel());
        System.out.print("\nThe Ticket Number of this Vehicle is:" + vehicle.getTicket());
        times = System.currentTimeMillis();
        vehicle.setTimes(times);
    }

    void vehicleExit() {
        System.out.print("Enter Vehicle Ticket Number to Exit:");
        exit = sc.nextInt();
        for (int i = 0; i < Parking.size(); i++) {
            if (Parking.get(i).getTicket() == exit) {
                System.out.print("\nThe Model of this Vehicle is:" + Parking.get(i).getModel());
                System.out.print("\nThe Color of this Vehicle is:" + Parking.get(i).getColor());
                System.out.print("\nThe Number of Wheel is :" + Parking.get(i).getWheel());
                //Time Calculator System
                totaltimes = (System.currentTimeMillis() - Parking.get(i).getTimes()) / 1000;
                if (Parking.get(i).getWheel() == 4) {
                    totalprice = (totaltimes * 0.50);
                } else if (Parking.get(i).getWheel() == 2) totalprice = (totaltimes * 0.25);
                System.out.println("\nYour Parking Times is :" + totaltimes);
                System.out.printf("\nYour Parking Fees is RM:%.2f", totalprice);
                Parking.remove(i);
            }
        }
    }

    void vehicleStatus() {
        System.out.println("List All Parked Vehicle as follows:");
        System.out.println("=========Car==========");
        for (int i = 0; i < Parking.size(); i++) {
            if (Parking.get(i) instanceof Car) {
                System.out.print("|" + "Ticket:" + Parking.get(i).getTicket() + "  " + "Plate:" + Parking.get(i).getModel() + "|\n");
            }
        }
        System.out.println("=======Motorbike=======");
        for (int i = 0; i < Parking.size(); i++) {
            if (Parking.get(i) instanceof Motorbike) {
                System.out.print("|" + "Ticket:" + Parking.get(i).getTicket() + "  " + "Plate:" + Parking.get(i).getModel() + "|\n");
            }
        }
    }

    void exit() {
        System.out.println("\n Thanks you for using this program");
    }
}
