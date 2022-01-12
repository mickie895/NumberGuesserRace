package com.gsoft.practice.numberguesser;

public class Main {
    public static void main(String[] args) {
        Questioner questioner = new Questioner();

        System.out.println("Auto guesser Activated...");

        Guesser guesser = new Guesser(questioner);
        guesser.GuessLoop();

        System.out.print("Your score is ");
        System.out.println(questioner.getScore());
    }
}
