package com.example.alexm.kunzhutproject;

public class BooleanQuestion extends Question{

    private boolean answer;

    public void setAnswer(boolean answer){
        this.answer = answer;
    }
    
    public boolean getAnswer() {
        return answer;
    }

    public BooleanQuestion(String questionTitle) {
        super(questionTitle);
    }
}
