package com.Bridgelab;

    public class InvoiceGeneretor {
        private static final double MINIMUM_COST_PER_KILOMETER =1 ;
        private static final int  COST_PER_TIME = 1;

        public double caclulateFare(double distance, int time) {
            return distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        }
    }
