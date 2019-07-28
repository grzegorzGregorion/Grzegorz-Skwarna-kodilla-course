package com.kodilla.stream.beautifier;

public class PoemBeatuifier {
    public void beautify(String textToDecorate, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(textToDecorate);
        System.out.println("Result equals: " + result);
    }
}