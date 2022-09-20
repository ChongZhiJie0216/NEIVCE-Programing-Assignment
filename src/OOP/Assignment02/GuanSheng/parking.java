package OOP.Assignment02.GuanSheng;

import java.util.ArrayList;
import java.util.Scanner;

public class parking {

    private int selection,ticket ;

    private String color , plate_no;
    //--------------------------------------------------------------------------------------
    parking(){
        plate_no  =" ";
        color     =" ";
        ticket    = 1 ;
    }
    String getplate_no(){
        return plate_no;
    }
    int getselection() {
        return selection;
    }
    String getcolor() {
        return color;
    }
    int getticket(){
        return ticket;
    }
    void setplate_no(String plate_no){
        this.plate_no = plate_no;

    }void setselection(int selection){
        this.selection =selection;

    }void setcolor(String color){
        this.color =color;
    }
    //--------------------------------------------------------------------------------------
    Scanner miku = new Scanner(System.in);
    ArrayList <String> car = new ArrayList<String>(5);
    ArrayList <String> motor = new ArrayList<String>(5);
    ArrayList<String> ticketN = new ArrayList<String>(5);

    //--------------------------------------------------------------------------------------
    void display(){//列出menu
        System.out.println();
        System.out.println("============================================");
        System.out.println("NEUC Car Management And Parking System");
        System.out.println("1. Car Entry");
        System.out.println("2. Motorbike Entry");
        System.out.println("3. Car Exit");
        System.out.println("4. Motorbike Exit");
        System.out.println("5. Display Parking Status");
        System.out.println("0. Exit");
        System.out.println("============================================");

    }void selection(){//scanner输入的选择
        System.out.println();
        System.out.print("PLS Enter U Choose:");
        setselection(miku.nextInt());
        checkselection();
    }
    void displayV(){//V=vehicle //scanner输入
        System.out.print("Pls Enter u vehicle number:");
        setplate_no(miku.next());
        //car.add(getplate_no());

        System.out.print("Pls Enter U vehicle color:");
        setcolor(miku.next());

    }void ticket(){//加ticket数量
        this.ticket++;

    }void parkingSlot (){
        System.out.println("----------------------------");
        System.out.println("!!The Parking Slot is full!!");
        System.out.println("----------------------------");

    }void checkselection(){
        while(true) {
            if(getselection()>5) {
                display();
                System.out.println("Wrong option");
                System.out.print("Pls Enter u number again between(1-5):");
                setselection(miku.nextInt());
            }else {
                break;}}}}

