import java.util.*;
class Rectangle{
    float length,breadth,area;

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
    public void display(){
        System.out.println("The area of rectangle is "+area);
    }
}


class Square{
    float length,area;

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of square");
        length = scanner.nextFloat();
    }
    public void calculate(){
        area=length*length;
    }
    public void display(){
        System.out.println("The area of square is "+area);
    }
}

class Circle{
    float radius,area;

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        radius = scanner.nextFloat();
    }
    public void calculate(){
        area=3.14f*radius*radius;
    }
    public void display(){
        System.out.println("The area of circle is  "+area);
    }
}



public class LaunchApp {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.input();
        rect.calculate();
        rect.display();

        Square sq = new Square();
        sq.input();
        sq.calculate();
        sq.display();
        
        Circle c = new Circle();
        c.input();
        c.calculate();
        c.display();
    }
}