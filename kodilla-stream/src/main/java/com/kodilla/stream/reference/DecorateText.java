package com.kodilla.stream.reference;

public class DecorateText {
    public static String changeToUpperCase(String a) {
        return a.toUpperCase();
    }

    public static String changeColorFontToMagenta(String a) {
        return (char)27 + "[35m" + a;
    }
}
