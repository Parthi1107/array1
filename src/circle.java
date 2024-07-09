public class circle {
    double radius;
    circle circle = new circle(5);
    double diameter() {return 2 *radius;}
    double circumference() {return 2 * Math.PI *radius;}
    double area() {return Math.PI *Math.pow(radius,2);}
    public static void main(String[] args) {
        double diameter = circle.diameter();
        System.out.println(" Diameter:" + diameter);
        double circumference = circle.circumference();
        System.out.println(" Circumference:" + circumference);
        double area = circle.area();
        System.out.println(" Area:" + area);

    }


    
}
