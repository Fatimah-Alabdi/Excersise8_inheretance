public class Square extends Rectangle {
public Square(){

    }
    public Square(double side) {
      super.setWidth(side);
      super.setLength(side);
    }

    public Square( double side,String color, boolean filled) {
        
        super(side,side,color,filled);
     
    }
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }


    public String toString() {
        return super.toString() + " side =" + getSide();
    }
    
   

}

