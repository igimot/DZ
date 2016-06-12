package m4.figArea;

/**
 * Created by Oleg on 12.06.2016.
 */
public class Main {
    public static void main(String[] arg){

        Figure circle= new Circle(5);
        System.out.println("Радиус круга при 5 = "+circle.resArea());
        Figure triangle= new Triangle(7, 8);
        System.out.println("Площадь треугольника при известных Сторона 7 и высота 8 = "+triangle.resArea());
        Figure rectangle= new Rectangle(56, 34);
        System.out.println("Площадь прямоугольника при известных сторонах 56 и 34 = "+rectangle.resArea());

    }
}
