package m4.point;

/**
 * Created by Oleg on 13.06.2016.
 */
public class Dots {

    public static double calc(DotPoint point1, DotPoint point2){

        return Math.sqrt((Math.pow((point2.getX()-point1.getX()), 2) + Math.pow((point2.getY()-point1.getY()), 2)));

    }
    }


