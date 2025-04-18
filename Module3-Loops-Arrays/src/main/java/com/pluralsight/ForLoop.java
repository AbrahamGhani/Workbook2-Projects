package com.pluralsight;

public class ForLoop {
/// Exercise 1 step 2 ForLoop

    public static void main(String[] args) throws InterruptedException {


        for (int iteration = 10; iteration >= 0 ; iteration--) {
            Thread.sleep(1000);
            System.out.println(iteration+ "...");

            if (iteration == 0){
                System.out.println("Launch!");
            }
        }



    }

}
