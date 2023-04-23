package Pack3;

import Pack1.GeometricShape;

public class Parallelogram extends GeometricShape {
    double side1, side2;   // a parallelogram has 4 sides, two of which are equal
    double angle1, angle2;    // a parallelogram has 4 angles, two of them equal.

  Parallelogram(double side1, double side2, double angle1, double angle2){
      this.side1=side1;
     this.side2=side2;
     this.angle1=angle1;
     this.angle2=angle2;
 }
    public Parallelogram(double side, double angle,String fillColor, String outlineColor) {
        super(fillColor,outlineColor);
        this.side1 = side;
        this.side2 = side;
        this.angle1=this.angle2=angle;
    }


    public double calculatePerimeter() {
        return 2*(this.side1+this.side2);
    }


    public double calculateArea() {
      double area=0.0;
        area=this.side1 * Math.sin(Math.toRadians(this.angle1)) * this.side2;
        System.out.println("Area of "+getClass()+" is "+area);
      return area;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", angle1=" + angle1 +
                ", angle2=" + angle2 +
                '}';
    }
}
