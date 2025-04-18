package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // Roll the Dice //
Dice dice = new Dice();
int roll1;
int roll2;
int sum;
int twoCounter = 0;
int fourCounter = 0;
int sixCounter = 0;
int sevenCounter = 0;
int elseCounter = 0;
        for (int i = 0; i < 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();

            System.out.println(roll1 + "\n" + roll2 + "\n\n");
            sum = roll1 + roll2;
            switch (sum){
                case 2:
                    twoCounter++;
                    break;
                case 4:
                    fourCounter++;
                    break;
                case 6:
                    sixCounter++;
                    break;
                case 7:
                    sevenCounter++;
                    break;
                default:
                    elseCounter++;
            }

        }


        System.out.println("2s: " + twoCounter);
        System.out.println("4s: " + fourCounter);
        System.out.println("6s: " + sixCounter);
        System.out.println("7s: " + sevenCounter);
        System.out.println("else: " + elseCounter);


    }
}