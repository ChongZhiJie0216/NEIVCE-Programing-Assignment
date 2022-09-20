package OOP.Assignment02.ZhiJie;

public class Vehicle {
        private String model;
        private String color;
        private int ticket;
        private int wheel;
        private long times;



        public Vehicle(String model, String color, int wheel, int ticket, long times) {
        this.model = model;
        this.color = color;
        this.wheel = wheel;
        this.ticket =ticket;
        this.times = times;
        }

        public Vehicle() {

        }

        public int getTicket() {
                return ticket;
        }

        public void setTicket(int ticket) {
                this.ticket = ticket;
        }

        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public int getWheel() {
                return wheel;
        }

        public void setWheel(int wheel) {
                this.wheel = wheel;
        }

        public long getTimes() {
                return times;
        }

        public void setTimes(long times) {
                this.times = times;
        }
}

