package com.alexWillrock.Igym.calculator;

public class Deadlift extends Calculator{

        private final static double COEFFICIENT_DEADLIFT_1 = 1;
        private final static double COEFFICIENT_DEADLIFT_2 = 1.0475;
        private final static double COEFFICIENT_DEADLIFT_3 = 1.13;
        private final static double COEFFICIENT_DEADLIFT_4 = 1.1575;
        private final static double COEFFICIENT_DEADLIFT_5 = 1.2;
        private final static double COEFFICIENT_DEADLIFT_6 = 1.242;
        private final static double COEFFICIENT_DEADLIFT_7 = 1.284;
        private final static double COEFFICIENT_DEADLIFT_8 = 1.326;
        private final static double COEFFICIENT_DEADLIFT_9 = 1.368;
        private final static double COEFFICIENT_DEADLIFT_10 = 1.41;

        private double coefficient_deadlift[] = {0, COEFFICIENT_DEADLIFT_1,COEFFICIENT_DEADLIFT_2,
                COEFFICIENT_DEADLIFT_3,COEFFICIENT_DEADLIFT_4,
                COEFFICIENT_DEADLIFT_5,COEFFICIENT_DEADLIFT_6,
                COEFFICIENT_DEADLIFT_7,COEFFICIENT_DEADLIFT_8,
                COEFFICIENT_DEADLIFT_9,COEFFICIENT_DEADLIFT_10
        };

        private int weight;
        private int iteration;

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setIteration(int iteration) {
            this.iteration = iteration;
        }

        public double result(int iteration, int weight){
            return weight * coefficient_deadlift[iteration];
        }
}
