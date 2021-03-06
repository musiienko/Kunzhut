package com.example.alexm.kunzhutproject;

import java.util.ArrayList;
import java.util.List;

public class QuestionFactory {

    public static List<Question> getStudentVisaQuestions() {
        final List<Question> questions = new ArrayList<>();

        questions.add(new BooleanQuestion("Вам є повних 18 р.?"));
        questions.add(new BooleanQuestion("Ви вже подорожували до Америки?"));
        questions.add(new BooleanQuestion("У вас є медичне страхування?"));
        questions.add(new BooleanQuestion("Ви маєте квитки туди і назад?"));
        questions.add(new BooleanQuestion("Ви маєте міжнародний студентський квиток?"));

        return questions;
    }

    public static List<Question> getWorkingVisaQuestions() {
        final List<Question> questions = new ArrayList<>();

        questions.add(new BooleanQuestion("Вам є повних 18 р.?"));
        questions.add(new BooleanQuestion("У вас є діти?"));
        questions.add(new BooleanQuestion("Ви вже подорожували до Америки?"));
        questions.add(new BooleanQuestion("У вас є медичне страхування?"));
        questions.add(new BooleanQuestion("Ви маєте квитки туди і назад?"));
        questions.add(new BooleanQuestion("Ви подбали про місце ночівлі?"));

        return questions;
    }

    public static List<Question> getBusinessVisaQuestions() {
        final List<Question> questions = new ArrayList<>();

        questions.add(new BooleanQuestion("У вас є діти?"));
        questions.add(new BooleanQuestion("Ви вже подорожували до Америки?"));
        questions.add(new BooleanQuestion("У вас є медичне страхування?"));
        questions.add(new BooleanQuestion("Ви маєте квитки туди і назад?"));
        questions.add(new BooleanQuestion("Ви подбали про місце ночівлі?"));

        return questions;
    }

    public static List<Question> getExursionVisaQuestions() {
        final List<Question> questions = new ArrayList<>();

        questions.add(new BooleanQuestion("Вам є повних 18 р.?"));
        questions.add(new BooleanQuestion("Ви вже подорожували до Америки?"));
        questions.add(new BooleanQuestion("У вас є медичне страхування?"));
        questions.add(new BooleanQuestion("Ви маєте квитки туди і назад?"));
        questions.add(new BooleanQuestion("Ви подбали про місце ночівлі?"));

        return questions;
    }

    public static List<Question> getShoppingVisaQuestions() {
        final List<Question> questions = new ArrayList<>();

        questions.add(new BooleanQuestion("Вам є повних 18 р.?"));
        questions.add(new BooleanQuestion("Ви вже подорожували до Америки?"));
        questions.add(new BooleanQuestion("У вас є медичне страхування?"));
        questions.add(new BooleanQuestion("Ви маєте квитки туди і назад?"));
        questions.add(new BooleanQuestion("Ви подбали про місце ночівлі?"));
        questions.add(new BooleanQuestion("Ви вже обрали торговий центр?"));

        return questions;
    }
}
