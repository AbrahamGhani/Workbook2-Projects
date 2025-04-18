package com.pluralsight;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] testScores = {90, 94, 87, 12, 67, 76, 43, 100, 15, 24};

        Arrays.sort(testScores);


        int sumOfScores = 0;

        for (int score : testScores) {

            sumOfScores += score;

        }

        System.out.println("total: " + sumOfScores);

double averageScore = (double) sumOfScores / testScores.length;

int lowScore = testScores[0];
int highScore = testScores[testScores.length - 1];

int medianScore = testScores[testScores.length / 2];


        System.out.println("low: " + lowScore);
        System.out.println("high: " + highScore);
        System.out.println("avg: " + averageScore);
        System.out.println("median: " + medianScore);



    }
}