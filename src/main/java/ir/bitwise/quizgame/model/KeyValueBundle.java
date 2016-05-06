package ir.bitwise.quizgame.model;

import java.util.HashMap;

/**
 * Created by Bardya on 5/6/2016.
 */
public class KeyValueBundle extends HashMap<String, String> {

    public String getString(String key, String defaultValue) {
        return get(key) == null ? defaultValue : get(key);
    }

    public int getInt(String key, int defaultValue) {
        return get(key) == null ? defaultValue : convertStringToInt(get(key),defaultValue);
    }

    private int convertStringToInt(String value, int defaultValue) {
        try {
            return Integer.parseInt(value);
        } catch (Exception e) {
            return defaultValue;
        }
    }
}
