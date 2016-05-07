package ir.bitwise.quizgame.io.parser;

import ir.bitwise.quizgame.io.ParseListener;

/**
 * Created by Bardya on 5/6/2016.
 */
public abstract class Parser<T> {

    public abstract void parseData(String input, ParseListener<T> parseListener);

}
