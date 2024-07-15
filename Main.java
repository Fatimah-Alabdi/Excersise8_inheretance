//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape shape1 = new Shape();
        Shape shape2=new Shape("red",true);


        Circle circle1 = new Circle();
        Circle circle2=new Circle(2.5);
        Circle circle3=new Circle(3.0,"green",false);


Rectangle rectangle1 = new Rectangle();
Rectangle rectangle2=new Rectangle(5.0,6.0);
Rectangle rectangle3=new Rectangle(7.0,8.0,"blue",false);

Square square1 = new Square();
Square square2=new Square(4.0);
Square square3=new Square(5.0,"yellow",false);
        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println("------------");
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println("------------");
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println("------------");
        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square3);
        System.out.println("------------");
        System.out.println("Circle2 area: " + circle2.getArea());
        System.out.println("Circle2 perimeter: " + circle2.getPerimeter());
        System.out.println("------------");

        System.out.println("Rectangle2 area: " + rectangle2.getArea());
        System.out.println("Rectangle2 perimeter: " + rectangle2.getPerimeter());
        System.out.println("------------");
        System.out.println("Square2 area: " + square3.getArea());
        System.out.println("Square2 perimeter: " + square3.getPerimeter());

    }
}