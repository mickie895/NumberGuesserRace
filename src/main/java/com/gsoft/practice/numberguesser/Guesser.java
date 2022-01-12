package com.gsoft.practice.numberguesser;
import java.util.Random;

public class Guesser {

    private final Questioner questioner;

    public Guesser(Questioner questioner){
        this.questioner = questioner;
    }

    public void GuessLoop(){
        final Random seed = new Random();
        while (true){
            try {
                // もっと効率よくできるかな？
                questioner.Guess(seed.nextInt(12345) + 1);
            }catch (IllegalStateException e){
                break;
            }
        }
    }

}
