package Pack2;

import Pack1.GeometricShape;

public  class RegularPolygon extends GeometricShape {
    protected int numberSides;// number of sides
    protected double side; // value of the side in cm.
    protected double angle; // angle value in degrees


 public  RegularPolygon(int sideNumber, double side, double angle, String fillColor, String outlineColor){
     super(fillColor,outlineColor);
     this.numberSides=sideNumber;
     this.side=side;
     this.angle=angle;
 }

 protected double calculateApothem(){
     double apothem=this.side/(2*Math.tan(Math.toRadians(this.angle)/2));
     return apothem;
 }

    @Override
    public String toString() {
        return "RegularPolygon{" +
                "numberSides=" + numberSides +
                ", side=" + side +
                ", angle=" + angle +
                ", fillColor='" + fillColor + '\'' +
                ", colorContour='" + colorContour + '\'' +
                '}';
    }

    @Override
    public double calculatePerimeter() {
             return this.side*this.numberSides;
    }

    @Override
    public double calculateArea() {
        System.out.println("Regular poly: "+calculateApothem() *calculatePerimeter()/2);
     return calculateApothem() *calculatePerimeter() / 2;
    }
}
