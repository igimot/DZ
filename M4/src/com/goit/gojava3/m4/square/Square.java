package DZ.M4.src.com.goit.gojava3.m4.square.square;

/**
 * Created by Oleg on 04.06.2016.
 */
public class Square {
    public static void main(String[] args){
       Triangle figTriangle = new Triangle(){};
        Rectangle figRectangle = new Rectangle(){};
        Circle figCircle = new Circle() {};
        System.out.println(figTriangle.squareTriangleIf);
        System.out.println("First side = "+figTriangle.firstSideTriangle);
        System.out.println("Second side = "+figTriangle.secondSideTriangle);
        System.out.println("Third side = "+figTriangle.thirdSideTriangle);
        System.out.println("Square tringle = "+figTriangle.squaEquals);
        System.out.println("If square = "+figTriangle.squaEquals+" then it "+figTriangle.squareTriangleEquals);
        /** Запуск прямоугольника*/
        System.out.println(" ");
         System.out.println(figRectangle.squareRectIf);
         System.out.println("First side = "+figRectangle.firstSideRect);
         System.out.println("Second side = "+figRectangle.secondSideRect);
         System.out.println("Square rectangle = "+figRectangle.squaEqualsRect);
         System.out.println("If square = "+figRectangle.squaEqualsRect+" then it "+figRectangle.squareRectEquals);
        /** Запуск прямоугольника*/
        System.out.println(" ");
        System.out.println(figCircle.squareCircif);
        System.out.println("If R circle = "+figCircle.firstSideCirc );
        System.out.println("Square circle = "+figCircle.squaEqualsCircl);
        System.out.println("If square = "+figCircle.squaEqualsCircl+" then it "+figRectangle.squareRectEquals);




    }
}
