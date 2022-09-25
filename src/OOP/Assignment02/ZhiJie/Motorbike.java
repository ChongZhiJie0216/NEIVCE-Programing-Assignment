package OOP.Assignment02.ZhiJie;

public class Motorbike extends Vehicle {
    public Motorbike(String model, String color, int ticket,int wheel,long times){
        super(model,color,2,ticket,times);
    }

    public Motorbike() {
        super();
        setWheel(2);
    }
}
