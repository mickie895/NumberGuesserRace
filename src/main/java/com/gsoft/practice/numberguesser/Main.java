package com.gsoft.practice.numberguesser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        Questioner question = new Questioner();
        System.out.println("Input A Number.");

        while(true) {

            try {
                int inputted = Integer.parseInt(in.readLine());
                switch (question.Guess(inputted)) {
                    case AnsIsSmaller -> System.out.println("That is too big. Try smaller number.");
                    case AnsIsBigger -> System.out.println("That is too small. Try bigger number.");
                    case Collect -> System.out.println("That is it! New number selected.");
                }
            }
            catch (NumberFormatException e){
                System.out.println("That's not number.");
                break;
            } catch (IOException e) {
                System.out.println("Something occurred.");
                break;
            }

        }
    }
}
