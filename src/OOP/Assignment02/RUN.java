package OOP.Assignment02;

import java.util.ArrayList;
import java.util.Scanner;

public class RUN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> Parking = new ArrayList<Vehicle>();
        MenusCars menus =  new MenusCars();
        int selection = 0;
        String Plate = "";
        String Color = "";
        int exit = 0;
        int t =0;
        int w =0;
        long times=0;
        long totaltimes=0;
        double totalprice=0;
        while (true) {
            menus.MenuCars();
            System.out.println("");
            System.out.print("Enter Option:");
            selection = sc.nextInt();
            if (selection == 1) {
                Car car = new Car();
                System.out.print("Enter Car Plate:");
                sc.nextLine();
                car.setModel(sc.nextLine());
                System.out.print("Enter Car Color:");
                car.setColor(sc.nextLine());
                t++;
                car.setTicket(t);
                Parking.add(car);
                System.out.print("\nThe Model of this Vehicle is:"+car.getModel());
                System.out.print("\nThe Color of this Vehicle is:"+car.getColor());
                System.out.print("\nThe Ticket Number of this Vehicle is:"+car.getTicket());
                System.out.print("\nThe Number of Wheel is :"+car.getWheel());
                times=System.currentTimeMillis();
                car.setTimes(times);
            } else if (selection == 2) {
                Motorbike motor = new Motorbike();
                System.out.print("Enter Motorbike Plate:");
                sc.nextLine();
                motor.setModel(sc.nextLine());
                System.out.print("Enter Motorbike Color:");
                motor.setColor(sc.nextLine());
                t++;
                motor.setTicket(t);
                Parking.add(motor);
                System.out.print("\nThe Model of this Vehicle is:"+motor.getModel());
                System.out.print("\nThe Color of this Vehicle is:"+motor.getColor());
                System.out.print("\nThe Ticket Number of this Vehicle is:"+motor.getTicket());
                System.out.print("\nThe Number of Wheel is :"+motor.getWheel());
                times=System.currentTimeMillis();
                motor.setTimes(times);
            } else if (selection == 3) {
                System.out.print("Enter Car Ticket Number to Exit:");
                exit = sc.nextInt();
                for (int i = 0; i < Parking.size(); i++) {
                    if (Parking.get(i).getTicket()==exit) {
                        System.out.print("\nThe Model of this Vehicle is:"+Parking.get(i).getModel());
                        System.out.print("\nThe Color of this Vehicle is:"+Parking.get(i).getColor());
                        System.out.print("\nThe Number of Wheel is :"+Parking.get(i).getWheel());

                        totaltimes=(System.currentTimeMillis()-Parking.get(i).getTimes())/1000;
                        totalprice = (totaltimes * 0.60);
                        System.out.println("\nYour Parking Times is :"+totaltimes);
                        System.out.printf("\nYour Parking Fees is :%.2f",totalprice);
                        Parking.remove(i);
                    }
                }
            } else if (selection == 4) {
                System.out.print("Enter Motorbike Ticket Number to Exit:");
                exit = sc.nextInt();
                for (int i = 0; i < Parking.size(); i++) {
                    if (Parking.get(i).getTicket()==exit) {
                        System.out.print("\nThe Model of this Vehicle is:"+Parking.get(i).getModel());
                        System.out.print("\nThe Color of this Vehicle is:"+Parking.get(i).getColor());
                        System.out.print("\nThe Number of Wheel is :"+Parking.get(i).getWheel());

                        totaltimes=(System.currentTimeMillis()-Parking.get(i).getTimes())/1000;
                        totalprice = (totaltimes * 0.30);
                        System.out.println("\nYour Parking Times is :"+totaltimes);
                        System.out.printf("\nYour Parking Fees is :%.2f",totalprice);
                        Parking.remove(i);
                    }
                }
            } else if (selection == 5) {
                System.out.println("List All Parked Vehicle as follows:");
                System.out.println("\n=========Car==========");
                for (int i = 0; i < Parking.size(); i++) {
                    if (Parking.get(i) instanceof Car) {
                        System.out.print("|" +"Ticket:"+Parking.get(i).getTicket()+"  "+"Plate:"+Parking.get(i).getModel() + "|");

                    }
                }
                System.out.println("\n=======Motorbike=======");
                for (int i = 0; i < Parking.size(); i++) {
                    if (Parking.get(i) instanceof Motorbike) {
                        System.out.print("|" +"Ticket:"+Parking.get(i).getTicket()+"  "+"Plate:"+Parking.get(i).getModel() + "|");
                    }
                }
            }else if (selection ==0){
                System.out.println("\n Thanks you for using this program");
            }
        }
    }
}

