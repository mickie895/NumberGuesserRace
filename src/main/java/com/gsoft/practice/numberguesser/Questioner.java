package com.gsoft.practice.numberguesser;
import java.util.Random;

public class Questioner {
    private final Random seed;

    public static final int QuestionSize = 100;
    private static final int MaxGuessCount = 100000;

    private int answer;
    private int guessed;
    private int score;

    public int getScore() {
        return score;
    }

    public enum Result{
        AnsIsSmaller,
        Collect,
        AnsIsBigger
    }

    public Questioner(){
        seed = new Random();
        CreateNextAnswer();
        guessed = 0;
        score = 0;
    }

    private void CreateNextAnswer(){
        answer = seed.nextInt(QuestionSize) + 1;
    }

    public Result Guess(int answer){
        guessed += 1;

        if (guessed > MaxGuessCount){
            throw new IllegalStateException("Max Count Achieved");
        }

        if (this.answer == answer){
            score++;
            CreateNextAnswer();
            return Result.Collect;
        }

        if (this.answer > answer){
            return Result.AnsIsBigger;
        }

        return Result.AnsIsSmaller;
    }
}
