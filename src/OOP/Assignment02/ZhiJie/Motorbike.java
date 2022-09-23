package OOP.Assignment02.ZhiJie;

public class Motorbike extends Vehicle {
    public Motorbike(String model, String color, int ticket,int wheel,long times){
        super(model,color,2,ticket,times);
    }

    public Motorbike() {
        super();
        setWheel(2);
    }
    public static void timer(){
        int i = 0;
        java.lang.System.out.print("\nThe Model of this Vehicle is:" + System.Parking.get(i).getModel());
        java.lang.System.out.print("\nThe Color of this Vehicle is:" + System.Parking.get(i).getColor());
        java.lang.System.out.print("\nThe Number of Wheel is :" + System.Parking.get(i).getWheel());
        //Time Calculator System
        long totaltimes = (java.lang.System.currentTimeMillis() - System.Parking.get(i).getTimes()) / 1000;
        double totalprice = (totaltimes * 0.50);
        java.lang.System.out.println("\nYour Parking Times is :" + totaltimes);
        java.lang.System.out.printf("\nYour Parking Fees is RM:%.2f", totalprice);
        System.Parking.remove(i);
    }
}
