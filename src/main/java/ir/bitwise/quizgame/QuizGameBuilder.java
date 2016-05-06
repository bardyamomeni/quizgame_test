package ir.bitwise.quizgame;

/**
 * Created by Bardya on 5/6/2016.
 */
public abstract class QuizGameBuilder<B extends QuizGameBuilder<B>> {

    protected String userId;

    protected QuizGameIo io;

    public B userId(String userId){
        this.userId = userId;
        return getThis();
    }

    public B gameIo(QuizGameIo io){
        this.io = io;
        return getThis();
    }

    public abstract B getThis();

    public abstract <T extends QuizGame> T build();

}
