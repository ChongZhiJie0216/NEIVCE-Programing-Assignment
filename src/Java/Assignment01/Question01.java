package Assignment01;

import java.util.ArrayList;
import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> FoodList = new ArrayList<String>();
        ArrayList<Integer> FoodQtyList = new ArrayList<Integer>();

        System.out.println("Food              Price(RM)");
        System.out.println("A.Potato Chips        5.00");
        System.out.println("B.Cookie              2.50");
        System.out.println("C.ApplePie            4.50");
        System.out.println("D.Milo                2.00");
        System.out.println("E.Water               1.00");

        String input = "Y";
        String code = "";
        double total = 0;
        double payment = 0;
        double change =0;

        int qty = 0;
        while (input.equals("Y")) {
                System.out.print("Enter a Code(A-E):");
                code = scanner.next();
                FoodList.add(code);

                System.out.print("Enter a Qty:");
                qty = scanner.nextInt();
                FoodQtyList.add(qty);

                System.out.println("If you went Continue Order?(Y/N)");
                input = scanner.next();
            }for (int i = 0; i < FoodList.size(); i++) {
            switch (FoodList.get(i)) {
                case "A" -> total += 5.00 * FoodQtyList.get(i);
                case "B" -> total += 2.50 * FoodQtyList.get(i);
                case "C" -> total += 4.50 * FoodQtyList.get(i);
                case "D" -> total += 2.00 * FoodQtyList.get(i);
                case "E" -> total += 1.00 * FoodQtyList.get(i);
            }
        }
        System.out.printf("TotalPrice:RM%.2f %n", total);
        System.out.print("Please Enter your Payment Amount:RM");
        payment = scanner.nextDouble();
        while (payment<total){
            System.out.print("Error :Please Insert More Amount...");
            System.out.print("Please Enter your Payment Amount:RM");
            payment = scanner.nextDouble();
        }
        System.out.println("==================Receipt==================");
        change = payment-total;
        for (int i=0;i<FoodList.size();i++){
            switch (FoodList.get(i)){
                case "A"-> System.out.printf("Potato Chips        5.00* %d = RM %.2f %n",FoodQtyList.get(i),5.00 * FoodQtyList.get(i));
                case "B"-> System.out.printf("Cookie              2.50* %d = RM %.2f %n",FoodQtyList.get(i),2.50 * FoodQtyList.get(i));
                case "C"-> System.out.printf("ApplePie            4.50* %d = RM %.2f %n",FoodQtyList.get(i),4.50 * FoodQtyList.get(i));
                case "D"-> System.out.printf("Milo                2.00* %d = RM %.2f %n",FoodQtyList.get(i),2.00 * FoodQtyList.get(i));
                case "E"-> System.out.printf("Water               1.00* %d = RM %.2f %n",FoodQtyList.get(i),1.00 * FoodQtyList.get(i));
            }
        }
        System.out.printf("Total:RM%.2f %n",total);
        System.out.printf("Payment:RM%.2f %n",payment);
        System.out.printf("Change:RM%.2f %n",change);
        }
    }