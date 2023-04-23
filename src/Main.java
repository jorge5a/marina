import Pack2.RegularPolygon;
import Pack3.Parallelogram;
import Pack4.ShapeContainer;

public class Main {
    public static void main(String[] args) {

        ShapeContainer todo=new ShapeContainer(2,2);
        Parallelogram cuadrado=new Parallelogram(3,3,"rojo","verde");
        RegularPolygon poligono=new RegularPolygon(2,2,2,"","");
        todo.addShape(0,0,cuadrado);
        todo.addShape(1,0,cuadrado);
        todo.addShape(0,1,poligono);
        todo.addShape(1,1,poligono);
        todo.sumAreas();


    }
}