package ir.bitwise.quizgame.io;

import ir.bitwise.quizgame.QuizGame;

/**
 * Created by Bardya on 5/6/2016.
 */
public interface QuizGameIoListener<C,S,A> {

    void onCreateResponse(C c);

    void onStartResponse(S s);

    void onAnswerResponse(A a);
}
