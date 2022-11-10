package chap3;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    

    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double computeCircmference() {
        return 2 * Math.PI * radius;
    }

    public double computeDiameter() {
        return 2 * radius;
    }
    
}//end class
