package com.ps;
    public class LeaseContract {
        String contractDate;
        String name;
        String email;
        String VehicleSold;
        double price;
        double monthlyPayment;

        public LeaseContract(String contractDate, String name, String email, String vehicleSold, double price, double monthlyPayment) {
            this.contractDate = contractDate;
            this.name = name;
            this.email = email;
            VehicleSold = vehicleSold;
            this.price = price;
            this.monthlyPayment = monthlyPayment;
        }

        public String getContractDate() {

            return contractDate;
        }

        public void setContractDate(String contractDate) {
            this.contractDate = contractDate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getVehicleSold() {
            return VehicleSold;
        }

        public void setVehicleSold(String vehicleSold) {
            VehicleSold = vehicleSold;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getMonthlyPayment() {
            return monthlyPayment;
        }

        public void setMonthlyPayment(double monthlyPayment) {
            this.monthlyPayment = monthlyPayment;
        }
    }

}
