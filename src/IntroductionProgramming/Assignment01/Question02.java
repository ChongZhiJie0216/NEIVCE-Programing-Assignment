package IntroductionProgramming.Assignment01;

import java.util.Random;
import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random= new Random();

        int Qty=0;
        int userAns=0;
        int Num;
        int Num2;
        int operation;
        int ans = 0;
        int score=0;
        int CorrectAns=0;
        int WrongAns=0;
        String operator=null;

        System.out.println("Welcome to Mathematics Games");
        System.out.print("Please Enter Question Quantity:");
        Qty=scanner.nextInt();

        for(int i=1;i<=Qty;i++){
            Num = random.nextInt(10);
            Num2=random.nextInt(10);
            operation=random.nextInt(5);

            if(operation==0) {
                operator="+";
                ans = Num + Num2;
            } else if(operation==1) {
                operator="-";
                ans = Num - Num2;
            } else if(operation==2) {
                operator = "x";
                ans = Num * Num2;
            } else if (operation==3) {
                operator ="÷";
                ans = Num / Num2;
            }

            System.out.println("What is "+ Num + operator + Num2+"?");
            System.out.print("Please Enter Answer:");
            userAns=scanner.nextInt();

            if(userAns==ans) {
                System.out.println("Correct");
                score++;
                CorrectAns++;
            }else  {
                System.out.println("Wrong");
                System.out.println("The correct answer is :"+ans);
                WrongAns++;
            }
        }
        System.out.println("========Thanks for playing!======");
        System.out.println("You have scored "+score+"/"+Qty);
        System.out.println("Correct:"+CorrectAns);
        System.out.println("Wrong:"+WrongAns);
    }
}
