import java.util.Scanner;
public class shape {
    double getPerimeter()
    {
        return 0;
    }
    double getArea()
    {
        return  0;
    }
}
class circle extends shape
{
    double radius;
    circle(double radius)
    {
        this.radius=radius;
    }
    double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
    double getArea()
    {
        return Math.PI * radius * radius;
    }
}
class output{
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Radius");
    double radius =sc.nextDouble();
    circle c = new circle(radius);
    System.out.println("Area: "+ c.getArea()+"Perimeter: "+c.getPerimeter());
}
}