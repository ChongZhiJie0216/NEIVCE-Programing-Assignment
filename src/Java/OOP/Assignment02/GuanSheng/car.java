package OOP.Assignment02.GuanSheng;

public class car extends parking{
    //private String color , plate_no;
    private int number;
    private int slot = 5;
    void displayV(){//V=vehicle
        System.out.print("Pls Enter u Car number:");
        miku.nextLine();
        setplate_no(miku.nextLine());
        car.add(getplate_no());

        System.out.print("Pls Enter U Car color:");
        this.setcolor(miku.next());
        leftslot();

        //--------------------------------------------------------------------------------------
    }int setnumber(int number){
        return this.number = number ;
    }int getnumber(){
        return this.number;
    }
    int leftslot(){//当车进来时候，自动扣1
        return this.slot -=1;
    }int getslot(){//获取现在车数量
        return this.slot;
    }int backslot(){//车退出时，车位+1
        return this.slot +=1;
    }
    //--------------------------------------------------------------------------------------
    void displayS(){
        System.out.println("--------------------------------------------");
        System.out.println("List Of All Parked as Follow:");
        System.out.println("The Car Slot left " + getslot());
        System.out.println("==============CAR==============");
        for(int i = 0;i<car.size();i++) {
            System.out.print(ticketN.get(i)+"["+ car.get(i)+"]");

        }
    }void carexit(){
        System.out.print("Pls Enter U Number Car Ticket:");
        setnumber(miku.nextInt());

        System.out.println(getnumber());

        if(getnumber()<20) {

            ticketN.remove(String.valueOf(getnumber()));
            car.remove(car.get(ticketN.size()));
            backslot();
            System.out.println("The Car Have Been Move");}

        else {
            System.out.println("false, Pls Enter The Right Ticket");
        }
        //--------------------------------------------------------------------------------------
    }void displayNow(){
        System.out.println("The color of vehicle is:"+ this.getcolor());
        System.out.println("The Plate No vehicle is:"+this.getplate_no());
        System.out.println("The ticket of this vehicle is:"+this.getticket());
        System.out.println("The number of wheels in this vehicle is:4");
        System.out.println("--------------------------------------------");
        ticketN.add(String.valueOf(this.getticket()));
        this.ticket();

    }
}