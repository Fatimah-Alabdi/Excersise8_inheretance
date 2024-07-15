public class Square extends Rectangle {
    private double side;
    public Square(){

    }
    public Square(double side) {
        this.side = side;
    }

    public Square( double side,String color, boolean filled) {
        //super(color, filled);
        super(side,side,color,filled);
        this.side = side;
    }
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double width) {
        super.setWidth(side);
        super.setLength(side);

    }
    public void setLength(double length) {
        super.setLength(side);
        super.setWidth(side);
    }
    public String toString() {
        return super.toString() + " side =" + getSide();
    }

}

