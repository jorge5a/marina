package Pack1;

abstract public class GeometricShape {
    protected String fillColor;
    protected String colorContour;

    protected GeometricShape( String colorFill){
        this.fillColor=colorFill;
    }

    protected GeometricShape( String fillColor, String outlineColor){
        this(fillColor);
        this.colorContour=outlineColor;
    }
    protected GeometricShape(){

    }


    protected abstract double calculatePerimeter();

    public abstract double calculateArea();


}
