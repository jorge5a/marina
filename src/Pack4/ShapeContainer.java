package Pack4;

import Pack1.GeometricShape;
import Pack2.RegularPolygon;
import Pack3.Parallelogram;

import java.util.Arrays;

public class ShapeContainer {
    int rows; // number of rows in the array.
    int columns; // number of columns in the array.
    GeometricShape[][] geometricShapes;

    public ShapeContainer(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.geometricShapes = new GeometricShape[rows][columns];
    }

    public ShapeContainer() {
    }

    public int getRows() {
        return this.rows;
    }

    public int getColumns() {
        return columns;
    }

    public GeometricShape[][] getGeometricShapes() {
        return geometricShapes;
    }

    public GeometricShape getGeometricShape(int row, int col) {
        return geometricShapes[row][col];
    }


    @Override
    public String toString() {
        return "ShapeContainer{ " + getClass() +
                " rows=" + rows +
                ", columns=" + columns +
                ", geometricShapes=" + Arrays.toString(geometricShapes) +
                '}';
    }

    public void addShape(int row, int column, GeometricShape shape) {

        geometricShapes[row][column] = shape;
    }

    public double sumAreas() {
        double area = 0.0;


        if (geometricShapes.length!=geometricShapes[0].length) return -1;
        for (int i = 0; i < geometricShapes.length; i++) {
            System.out.print(i + ",  ");
            if (geometricShapes[i][i] != null) {
                //comentado
                area += geometricShapes[i][i].calculateArea();
                System.out.println("i: " + i);
            }
        }
        return area;
    }

    public double sumPerimeters(GeometricShape[][] geometricShape){
        double perimeter=0.0;
        GeometricShape shape;
        for (int i = 0; i < geometricShape.length; i++) {
            System.out.print(i + ",  "+(geometricShape.length-i));
            if (geometricShape[i] [geometricShape.length-i-1]!= null) {
                shape = geometricShape[i][geometricShape.length-i-1];
                if (shape instanceof Parallelogram) {
                    Parallelogram parall = (Parallelogram) shape;
                    perimeter += parall.calculatePerimeter();
                    System.out.println("i: " + i);
                }
                if (shape instanceof RegularPolygon) {
                    RegularPolygon regularPolygon = (RegularPolygon) shape;
                    perimeter += regularPolygon.calculatePerimeter();
                    System.out.println("i: " + i);
                }
            }
        }
        return perimeter;
    }

}

