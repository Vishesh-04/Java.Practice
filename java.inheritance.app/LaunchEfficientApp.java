import java.util.*;


abstract class Shape{
    float area;
    abstract public void input();
    abstract public void calculate();
    public void display(){
        System.out.println("The area is "+ area);
    }
}


class Rectangle1 extends Shape
{
    float length,breadth;

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        length = scanner.nextFloat();
        System.out.println("Enter breadth of rectangle");
        breadth = scanner.nextFloat();
    }
    public void calculate(){
        area=length*breadth;
    }
}


class Square1 extends Shape
{
    float length;

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of square");
        length = scanner.nextFloat();
    }
    public void calculate(){
        area=length*length;
    }
}

class Circle1 extends Shape{
    float radius;

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        radius = scanner.nextFloat();
    }
    public void calculate(){
        area=3.14f*radius*radius;
    }
}


class Geometry{
    public void poly(Shape ref){
        ref.input();
        ref.calculate();
        ref.display();
    }
}


public class LaunchEfficientApp {

    public static void main(String[] args) {
        Rectangle1 rect = new Rectangle1();
        Square1 sq = new Square1() ;
        Circle1 c = new Circle1();
        
        Geometry g = new Geometry();
        g.poly(rect);
        g.poly(sq);
        g.poly(c);
    }
}