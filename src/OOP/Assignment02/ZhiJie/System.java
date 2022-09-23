package OOP.Assignment02.ZhiJie;

import java.util.ArrayList;
import java.util.Scanner;


public class System extends Vehicle {
    int exit = 0;
    int t = 0;
    int w = 0;
    long times = 0;
    long totaltimes = 0;
    double totalprice = 0;

    Scanner sc = new Scanner(java.lang.System.in);
    static ArrayList<Vehicle> Parking = new ArrayList<Vehicle>();
        void Menu(){
            java.lang.System.out.println("\n");
            java.lang.System.out.println("New Era University Car Management & Parking System");
            java.lang.System.out.println("Select one option");
            java.lang.System.out.println("1.Enter Car");
            java.lang.System.out.println("2.Enter Motorbike");
            java.lang.System.out.println("3.Car Exit");
            java.lang.System.out.println("4.Motorbike Exit");
            java.lang.System.out.println("5.Parking Status");
            java.lang.System.out.println("0.Exit");
        }

        void CarEnter () {//Car进入
            Car car = new Car();//呼叫Car里面的内容
            java.lang.System.out.print("Enter Car Plate:");
            car.setModel(sc.nextLine());
            java.lang.System.out.print("Enter Car Color:");
            car.setColor(sc.nextLine());
            t++;
            car.setTicket(t);
            Parking.add(car);
            java.lang.System.out.print("\nThe Model of this Vehicle is:" + car.getModel());
            java.lang.System.out.print("\nThe Color of this Vehicle is:" + car.getColor());
            java.lang.System.out.print("\nThe Ticket Number of this Vehicle is:" + car.getTicket());
            java.lang.System.out.print("\nThe Number of Wheel is :" + car.getWheel());
            times = java.lang.System.currentTimeMillis();
            car.setTimes(times);
        }

        void MotorbikeEnter () {
            Motorbike motor = new Motorbike();
            java.lang.System.out.print("Enter Motorbike Plate:");
            motor.setModel(sc.nextLine());
            java.lang.System.out.print("Enter Motorbike Color:");
            motor.setColor(sc.nextLine());
            t++;
            motor.setTicket(t);
            Parking.add(motor);
            java.lang.System.out.print("\nThe Model of this Vehicle is:" + motor.getModel());
            java.lang.System.out.print("\nThe Color of this Vehicle is:" + motor.getColor());
            java.lang.System.out.print("\nThe Ticket Number of this Vehicle is:" + motor.getTicket());
            java.lang.System.out.print("\nThe Number of Wheel is :" + motor.getWheel());
            times = java.lang.System.currentTimeMillis();
            motor.setTimes(times);
        }
        void CarExit () {
            java.lang.System.out.print("Enter Car Ticket Number to Exit:");
            exit = sc.nextInt();
            priceTotals();

        }
        void MotorbikeExit () {
            java.lang.System.out.print("Enter Motorbike Ticket Number to Exit:");
            exit = sc.nextInt();
            priceTotals();
        }
        void check () {
            java.lang.System.out.println("List All Parked Vehicle as follows:");
            java.lang.System.out.println("\n=========Car==========");
            for (int i = 0; i < Parking.size(); i++) {
                if (Parking.get(i) instanceof Car) {
                    java.lang.System.out.print("|" + "Ticket:" + Parking.get(i).getTicket() + "  " + "Plate:" + Parking.get(i).getModel() + "|");

                }
            }
            java.lang.System.out.println("\n=======Motorbike=======");
            for (int i = 0; i < Parking.size(); i++) {
                if (Parking.get(i) instanceof Motorbike) {
                    java.lang.System.out.print("|" + "Ticket:" + Parking.get(i).getTicket() + "  " + "Plate:" + Parking.get(i).getModel() + "|");
                }
            }
        }
        void priceTotals(){
            for (int i = 0; i < Parking.size(); i++) {
                if (Parking.get(i).getTicket() == exit) {
                    java.lang.System.out.print("\nThe Model of this Vehicle is:" + Parking.get(i).getModel());
                    java.lang.System.out.print("\nThe Color of this Vehicle is:" + Parking.get(i).getColor());
                    java.lang.System.out.print("\nThe Number of Wheel is :" + Parking.get(i).getWheel());
                    //Time Calculator System
                    totaltimes = (java.lang.System.currentTimeMillis() - Parking.get(i).getTimes()) / 1000;
                    if(Parking.get(i).getWheel() ==4){
                        totalprice = (totaltimes * 0.50);
                    }else if(Parking.get(i).getWheel() ==2)
                        totalprice = (totaltimes * 0.25);
                    java.lang.System.out.println("\nYour Parking Times is :" + totaltimes);
                    java.lang.System.out.printf("\nYour Parking Fees is RM:%.2f", totalprice);
                    Parking.remove(i);
                }
            }
        }
        void exit () {
            java.lang.System.out.println("\n Thanks you for using this program");
        }
    }
