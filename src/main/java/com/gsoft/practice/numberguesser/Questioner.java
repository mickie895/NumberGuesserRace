package com.gsoft.practice.numberguesser;
import java.util.Random;

public class Questioner {
    private Random seed;

    private static final int QuestionSize = 100;

    private int answer;

    public enum Result{
        AnsIsSmaller,
        Collect,
        AnsIsBigger
    }

    public Questioner(){
        seed = new Random();
        CreateNextAnswer();
    }

    private void CreateNextAnswer(){
        answer = seed.nextInt(QuestionSize) + 1;
    }

    public Result Guess(int answer){
        if (this.answer == answer){
            CreateNextAnswer();
            return Result.Collect;
        }

        if (this.answer > answer){
            return Result.AnsIsBigger;
        }

        return Result.AnsIsSmaller;
    }
}
