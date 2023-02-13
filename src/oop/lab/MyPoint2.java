package oop.lab;

public class MyPoint2 {
    
     private double x, y;

        MyPoint2() {
            x = 0;
            y = 0;
        }

        MyPoint2(double x, double y) {
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

        double Distance(MyPoint2 Point) {
            double x = Point.GetX();
            double y = Point.GetY();

            return Math.pow(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2), 0.5);
        }
    
    
}
