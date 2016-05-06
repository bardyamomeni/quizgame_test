package ir.bitwise.quizgame;

/**
 * Created by Bardya on 5/6/2016.
 */
public abstract class QuizGameBuilder<T extends QuizGameBuilder<T>> {

    String userId;

    public T userId(String userId){
        this.userId = userId;
        return getThis();
    }

    public abstract T getThis();

}
