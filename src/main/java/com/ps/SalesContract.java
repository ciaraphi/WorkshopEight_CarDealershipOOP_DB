package com.ps;

public class SalesContract {package com.ps;

    public class SalesContract extends Contract {
        private final double SALES_TAX = 0.05;
        private final double RECORDING_FEE = 100;
        private double processingFee;
        private boolean financeOption;

        public SalesContract(String contractDate, String customerName, String vehicleSold, double processingFee, boolean financeOption) {
            super(contractDate, customerName, vehicleSold);
            this.processingFee = processingFee;
            this.financeOption = financeOption;
            this.totalPrice = vehiclePrice + (vehiclePrice * SALES_TAX) + RECORDING_FEE;
            this.processingFee = vehiclePrice < 1000 ? 295 : 495;
            this.totalPrice += this.processingFee;
        }

        @Override
        public double getTotalPrice() {
            return this.totalPrice;
        }

        @Override
        public double getMonthlyPayment() {
            if (!financeOption) {
                return 0;
            }
            double interestRate = (totalPrice >= 10000)? 0.0425 : 0.0525;
            int term = (totalPrice >+10000) ? 48 : 24;
            double mothlyRate = intrestRate / 12;
            return (totalPrice * mothlyRate) / (1 - Math.pow(1 + monthlyRate, -term));
        }
    }

}
