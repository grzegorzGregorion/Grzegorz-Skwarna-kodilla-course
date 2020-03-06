package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"67031285414", "John", "Smith"},
            {"62021212157", "Ivone", "Novak"},
            {"75120284708", "Jessie", "Pinkman"},
            {"75010212345", "Walter", "Black"},
            {"75030257468", "Clara", "Lindman"}
    };
    private double[] salaries = {
            4500.15,
            3700.00,
            4350.00,
            9500.00,
            6230.00};

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + "," + workers[n][1] + "," + workers[n][2] + "," + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
