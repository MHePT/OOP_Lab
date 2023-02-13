package oop.lab;

public class Sheet7 {

    public class Stock {

        private String name, symbol;
        private double previousClosingPrice, currentprice;

        Stock() {
            name = "Untitled";
            symbol = "unnamed";
            previousClosingPrice = 0;
            currentprice = 0;
        }

        Stock(String name, String symbol, double previousClosingPrice, double currentprice) {
            this.name = name;
            this.symbol = symbol;
            this.previousClosingPrice = previousClosingPrice;
            this.currentprice = currentprice;
        }

        String GetName() {
            return name;
        }

        String GetSymbol() {
            return symbol;
        }

        double GetpreviousClosingPrice() {
            return previousClosingPrice;
        }

        double Getcurrentprice() {
            return currentprice;
        }

        void SetName(String name) {
            this.name = name;
        }

        void SetSymbol(String symbol) {
            this.symbol = symbol;
        }

        void SetpreviousClosingPrice(double previousClosingPrice) {
            this.previousClosingPrice = previousClosingPrice;
        }

        void Setcurrentprice(double currentprice) {
            this.currentprice = currentprice;
        }

        double getChangedPercent() {
            return currentprice / previousClosingPrice;
        }
    }

    public class MyPoint {

        private double x, y;

        MyPoint() {
            x = 0;
            y = 0;
        }

        MyPoint(double x, double y) {
            this.x = x;
            this.y = y;
        }

        double GetX() {
            return x;
        }

        double GetY() {
            return y;
        }

        void SetX(double x) {
            this.x = x;
        }

        void SetY(double y) {
            this.y = y;
        }

        double Distance(MyPoint Point) {
            double x = Point.GetX();
            double y = Point.GetY();

            return Math.pow(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2), 0.5);
        }
    }

}
