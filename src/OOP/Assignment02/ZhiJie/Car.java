package OOP.Assignment02.ZhiJie;

import jdk.internal.access.JavaIOFileDescriptorAccess;

public class Car extends Vehicle{

        public Car (String model,String color,int wheel,int ticket,int times){
        super(model,color,4,ticket,times);
        }

        public Car() {
                super();
                setWheel(4);
        }
}
