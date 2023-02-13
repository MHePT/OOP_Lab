package oop.lab;

public class Sheet5 {

    public class QuadraticEquation {

        double a, b, c;

        public double getDiscriminant() {

            if (b * b - 4 * a * c < 0) {
                return 0;
            } else {
                return b * b - 4 * a * c;
            } 
        }
             
        public double GetRoot1() {

            return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        }

        public double GetRoot2() {

            return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        }

    }

    public class Rectangle {

        double width, height;

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return 2 * (width + height);
        }
    }

}
