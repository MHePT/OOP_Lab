package oop.lab;

public class Quiz1 {

    public class LinearEquation {

        private int a, b, c, d, e, f;

        LinearEquation() {
            a = 0;
            b = 0;
            c = 0;
            d = 0;
            e = 0;
            f = 0;
        }

        LinearEquation(int a, int b, int c, int d, int e, int f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }

        int getA() {
            return a;
        }

        int getB() {
            return b;
        }

        int getC() {
            return c;
        }

        int getD() {
            return d;
        }

        int getE() {
            return e;
        }

        int getF() {
            return f;
        }

        void setA(int a) {
            this.a = a;

        }

        void setB(int b) {
            this.b = b;
        }

        void setC(int c) {
            this.c = c;
        }

        void setD(int d) {
            this.d = d;
        }

        void setE(int e) {
            this.e = e;
        }

        void setF(int f) {
            this.f = f;
        }

        Boolean isSolvable() {
            Boolean test = true;
            int m = a * d - b * c;
            if (m == 0) {
                test = false;
            }
            return test;
        }

        int getX() {
            return ((e * d) - (b * f)) / ((a * d) - (b * c));
        }

        int getY() {
            return ((a * f) - (e * c)) / ((a * d) - (b * c));
        }

    }

    public class Rectangle {

        private double side1, side2, side3;
        String color;
        boolean filled;

        Rectangle() {
            side1 = 1.0;
            side2 = 1.0;
            side3 = 1.0;
            color = "Red";
            filled = true;
        }

        Rectangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            color = "Red";
            filled = true;
        }

        double GetSide1() {
            return side1;
        }

        double GetSide2() {
            return side2;
        }

        double GetSide3() {
            return side3;
        }

        void SetSide1(int side1) {
            this.side1 = side1;
        }

        void SetSide2(int side2) {
            this.side2 = side2;
        }

        void SetSide3(int side3) {
            this.side3 = side3;
        }

        double GetArea() {
            double s = GetPerimeter() * 0.5;
            return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        }

        double GetPerimeter() {
            return side1 + side2 + side3;
        }

        @Override
        public String toString() {
            return "Side 1= " + side1 + "\nSide2 = " + side2 + "\nSide 3 = " + side3
                    + "\nColor = " + color + "\nFilled = " + filled + "\nArea = " + GetArea()
                    + "\nPerimeter = " + GetPerimeter();
        }
    }

}
