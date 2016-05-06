package ir.bitwise.quizgame;

/**
 * Created by Bardya on 5/6/2016.
 */
public abstract class QuizGameBuilder<T extends QuizGameBuilder<T>> {

    protected String userId;

    protected QuizGameIo io;

    public T userId(String userId){
        this.userId = userId;
        return getThis();
    }

    public T gameIo(QuizGameIo io){
        this.io = io;
        return getThis();
    }

    public abstract T getThis();

}
