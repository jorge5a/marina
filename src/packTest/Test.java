package packTest;

import Pack1.GeometricShape;
import Pack2.RegularPolygon;
import Pack3.Parallelogram;
import Pack4.ShapeContainer;

public class Test {
    public static void main(String[] args) {
        GeometricShape [][] geometricShape;
        RegularPolygon polygon = new RegularPolygon(5,3.0,72.0,"red","black");
        RegularPolygon polygon2 = new RegularPolygon(4,3.7,90.0,"red","white");
        Parallelogram parallelogram = new Parallelogram(12.0,2.0,"red","yrllow");
        //ShapeContainer paraPolygon = new (ShapeContainer)polygon;
        ShapeContainer shapeContainer = new ShapeContainer(3,3);
        shapeContainer.addShape(0,0,parallelogram);
        shapeContainer.addShape(0,1,polygon);
        shapeContainer.addShape(1,0,parallelogram);
        shapeContainer.addShape(1,1,parallelogram);
        shapeContainer.addShape(2,2,polygon2);

        geometricShape= shapeContainer.getGeometricShapes();
        System.out.println(shapeContainer.toString());
        for (int i=0; i<shapeContainer.getRows(); i++){
            System.out.print(i+",  ");
            for (int j=0; j<shapeContainer.getColumns(); j++) {
                System.out.print(j+" "+geometricShape);
            }
            System.out.println();
            }

        double area=shapeContainer.sumAreas();
        System.out.println("areas: "+area);
        double perimeter=shapeContainer.sumPerimeters(geometricShape);
        System.out.println("Sum of the perimeters: "+perimeter);
         }



    }

