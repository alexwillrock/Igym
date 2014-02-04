package com.alexWillrock.Igym.calculator;

public class Gym extends Calculator{

    private final static double COEFFICIENT_GYM_1 = 1;
    private final static double COEFFICIENT_GYM_2 = 1.035;
    private final static double COEFFICIENT_GYM_3 = 1.08;
    private final static double COEFFICIENT_GYM_4 = 1.115;
    private final static double COEFFICIENT_GYM_5 = 1.15;
    private final static double COEFFICIENT_GYM_6 = 1.18;
    private final static double COEFFICIENT_GYM_7 = 1.22;
    private final static double COEFFICIENT_GYM_8 = 1.255;
    private final static double COEFFICIENT_GYM_9 = 1.29;
    private final static double COEFFICIENT_GYM_10 = 1.325;

    private double coefficient_gym[] = {0, COEFFICIENT_GYM_1, COEFFICIENT_GYM_2,
        COEFFICIENT_GYM_3, COEFFICIENT_GYM_4,
        COEFFICIENT_GYM_5, COEFFICIENT_GYM_6,
        COEFFICIENT_GYM_7, COEFFICIENT_GYM_8,
        COEFFICIENT_GYM_9, COEFFICIENT_GYM_10};

        private int weight;
        private int iteration;

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setIteration(int iteration) {
            this.iteration = iteration;
        }

        public double result(int iteration, int weight){
            return weight * coefficient_gym[iteration];
        }
}
