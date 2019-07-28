package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeatuifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        SaySomething saySomething = new SaySomething();
        saySomething.say();

        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        Executor codeToExecute = () -> System.out.println("This is fourth text to be displayed!");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(4, 6, (a, b) -> a + b);
        expressionExecutor.executeExpression(4, 6, (a, b) -> a - b);
        expressionExecutor.executeExpression(4, 6, (a, b) -> a * b);
        expressionExecutor.executeExpression(4, 6, (a, b) -> a / b);
        expressionExecutor.executeExpression(4, 6, (a, b) -> Math.pow(a, b));

        expressionExecutor.executeExpression(4, 6, FunctionalCalculator::addAtoB);
        expressionExecutor.executeExpression(4, 6, FunctionalCalculator::subracttBfromA);
        expressionExecutor.executeExpression(4, 6, FunctionalCalculator::multiplyAbyB);
        expressionExecutor.executeExpression(4, 6, FunctionalCalculator::divideAbyB);
        expressionExecutor.executeExpression(4, 6, FunctionalCalculator::powerAbyB);

        PoemBeatuifier poemBeatuifier = new PoemBeatuifier();

        poemBeatuifier.beautify("First text: 1 34 5", (textToDecorate) -> textToDecorate.toUpperCase());
        poemBeatuifier.beautify("SECOND text: 1 34 5", (textToDecorate) -> textToDecorate.toLowerCase());
        poemBeatuifier.beautify("third text: 1 5 5", (textToDecorate) -> "AAAA " + textToDecorate + " BBBB");
        poemBeatuifier.beautify("This is short text to be changed", (textToDecorate) -> textToDecorate.replace(" ", "  aBZBa  "));
        poemBeatuifier.beautify("      This is short text to be changed. Change is meant to leading and trailing whitespace omitted.            ", (textToDecorate) -> textToDecorate.trim());
        poemBeatuifier.beautify("This is short text to be changed. Change is meant to be a color modification.", (textToDecorate) -> (char)27 + "[35m" + textToDecorate);
    }
}
