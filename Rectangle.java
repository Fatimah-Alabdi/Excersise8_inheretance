public class Rectangle extends Shape {
    private double width=1.0;
    private double length=1.0;
public Rectangle(){

}
public Rectangle(double width, double length){
    this.width=width;
    this.length=length;
}
    public Rectangle(double width,double length,String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double height) {
        this.length = length;
    }
    public double getArea() {
        return width*length;
    }
    public double getPerimeter() {
        return 2*(width+length);
    }
    public String toString() {
        return super.toString()+" \nwidth="+width+" \nheight="+length;
    }
}
