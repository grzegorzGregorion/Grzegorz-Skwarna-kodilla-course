package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures {
    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<>();

        //dummy data
        stubResult.put(0, 25.5);
        stubResult.put(1, 22.5);
        stubResult.put(2, 7.8);
        stubResult.put(3, 34.3);
        stubResult.put(4, 22.5);

        return stubResult;
    }
}
