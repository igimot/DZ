package m4.point;

import java.util.Scanner;

/**
 * Created by Oleg on 13.06.2016.
 */
public class LengthBetDots {
    public static  void main (String[] arg){
        System.out.println("Вычисляем расстояние между двумя точками, представленными " +
                           "координатами в двумерном пространстве (x1, y1), (x2, y2).");
        System.out.println("Введите координаты x1 пробел y1");
        Scanner scan1= new Scanner(System.in);
        int dotX1=scan1.nextInt();
        int dotY1=scan1.nextInt();
        System.out.println("Введите координаты x2 пробел y2");
        Scanner scan2= new Scanner(System.in);
        double dotX2=scan2.nextDouble();
        double dotY2=scan2.nextDouble();
        DotPoint point1 = new DotPoint(dotX1, dotY1);
        DotPoint point2 = new DotPoint(dotX2, dotY2);

        System.out.println("Расстояние между двумя точками "+Dots.calc(point1, point2));

    }
}
