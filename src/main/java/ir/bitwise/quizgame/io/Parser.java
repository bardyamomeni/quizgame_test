package ir.bitwise.quizgame.io;

/**
 * Created by Bardya on 5/6/2016.
 */
public abstract class Parser<C, S, A> {

    public C parseCreateResponse(String input){
        return parseCreateResponseImpl(input);
    }

    public S parseStartResponse(String input){
        return parseStartResponseImpl(input);
    }

    public A parseAnswerResponse(String input){
        return parseAnswerResponseImpl(input);
    }

    protected abstract C parseCreateResponseImpl(String input);

    protected abstract S parseStartResponseImpl(String input);

    protected abstract A parseAnswerResponseImpl(String input);

}
