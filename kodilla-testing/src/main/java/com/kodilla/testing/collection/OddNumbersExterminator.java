package com.kodilla.testing.collection;

import java.lang.*;
import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        int temporaryValue = 0;
        ArrayList<Integer> theEvenList = new ArrayList<Integer>();
        for (int n = 0; n < numbers.size(); n++) {
            temporaryValue = numbers.get(n);
            if (temporaryValue % 2 == 0) {
                theEvenList.add(temporaryValue);
            }
        }
        return theEvenList;
    }
}