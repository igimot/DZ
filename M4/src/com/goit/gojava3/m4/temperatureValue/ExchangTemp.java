package m4.temp;

import java.util.Scanner;

/**
 * Created by Oleg on 12.06.2016.
 */
public class ExchangTemp {
    public static  void main (String[] arg){
    System.out.println("Конвертер температур");
    System.out.println("Ведите температуру по цельсию целое цисло:");
    Scanner digC = new Scanner(System.in);
    double cel= digC.nextDouble();
    double exchCelToFar=(cel*1.8)+32;
        System.out.println("Ведите температуру по фаренгейту целое цисло:");
        Scanner digF = new Scanner(System.in);
        double far= digF.nextDouble();
        double exchFarToCel=(far-32)/1.8;
    System.out.println(digC+" градусов по цельсию равно "+exchCelToFar+" фаренгейтам");
        System.out.println(digF+" градусов по фаренгейту равно "+exchFarToCel+" цельсий");
    }
}
