package OOP.Assignment02.GuanSheng;

public class motor extends car{

    void displayV(){//V=vehicle

        System.out.print("Pls Enter u Motor Number:");
        this.setplate_no(miku.nextLine());
        motor.add(getplate_no());

        System.out.print("Pls Enter U Motor Color:");
        this.setcolor(miku.nextLine());
        leftslot();
    }
    void displayS(){
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("The Motor Slot left " + getslot());
        System.out.println("=============MOTOR=============");
        for(int i = 0;i<motor.size();i++) {
            System.out.print(ticketN.get(i)+"["+ motor.get(i)+"]");

        }
    }void motorexit(){
        System.out.print("Pls Enter U Number Motor Ticket:");
        setnumber(miku.nextInt());

        if(getnumber()<20) {
            ticketN.remove(String.valueOf(getnumber()));
            motor.remove(motor.get(ticketN.size()));
            backslot();
            System.out.println("The Motor Have Been Move");}
        else {
            System.out.println("False, Pls Enter The Right Ticket");
        }

    }void displayNow(){
        System.out.println("The color of vehicle is:"+ this.getcolor());
        System.out.println("The Plate No vehicle is:"+this.getplate_no());
        System.out.println("The ticket of this vehicle is:"+this.getticket());
        System.out.println("The number of wheels vehicle is:2");
        System.out.println("--------------------------------------------");
        ticketN.add(String.valueOf(this.getticket()));
        this.ticket();

    }
}