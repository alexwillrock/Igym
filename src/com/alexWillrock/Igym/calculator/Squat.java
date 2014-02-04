package com.alexWillrock.Igym.calculator;

public class Squat extends Calculator{

    private final static double COEFFICIENT_SQUAT_1 = 1;
    private final static double COEFFICIENT_SQUAT_2 = 1.0475;
    private final static double COEFFICIENT_SQUAT_3 = 1.13;
    private final static double COEFFICIENT_SQUAT_4 = 1.1575;
    private final static double COEFFICIENT_SQUAT_5 = 1.2;
    private final static double COEFFICIENT_SQUAT_6 = 1.242;
    private final static double COEFFICIENT_SQUAT_7 = 1.284;
    private final static double COEFFICIENT_SQUAT_8 = 1.326;
    private final static double COEFFICIENT_SQUAT_9 = 1.368;
    private final static double COEFFICIENT_SQUAT_10 = 1.41;

    private double coefficient_squat[] = {0, COEFFICIENT_SQUAT_1, COEFFICIENT_SQUAT_2,
            COEFFICIENT_SQUAT_3, COEFFICIENT_SQUAT_4,
            COEFFICIENT_SQUAT_5, COEFFICIENT_SQUAT_6,
            COEFFICIENT_SQUAT_7, COEFFICIENT_SQUAT_8,
            COEFFICIENT_SQUAT_9, COEFFICIENT_SQUAT_10};

    private int weight;
    private int iteration;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setIteration(int iteration) {
        this.iteration = iteration;
    }

    public double result(int iteration, int weight){
        return weight * coefficient_squat[iteration];
    }
}
