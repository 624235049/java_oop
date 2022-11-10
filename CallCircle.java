import chap3.Circle;

public class CallCircle {

    public static void main(String[] args) {
        Circle ce = new Circle(5);
        double radius = ce.getRadius();
        System.out.println("Radius : " + radius);
        
        double computeArea = ce.computeArea();
        System.out.println("Area : " + Math.ceil(+ce.computeArea()));
        
        double computeCircumference = ce.computeCircmference();
        System.out.println("Circumference :" + Math.floor(+Math.PI * radius));
        
        double computeDiameter = ce.computeDiameter();
        System.out.println("Diameter :" + Math.floor(+2 * radius));

    }

}
