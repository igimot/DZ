package m4.temp;


import java.util.Scanner;

/**
 * Created by Oleg on 12.06.2016.
 */
public class MainExchangTemp2 {
    public static  void main (String[] arg){
    System.out.println("Конвертер температур");
     System.out.println("Ведите температуру в цельсиях целое цисло:");
          Scanner digC = new Scanner(System.in);
          double cel= digC.nextDouble();
     System.out.println("Ведите температуру по фаренгейту целое цисло:");
          Scanner digF = new Scanner(System.in);
          double far= digF.nextDouble();

    System.out.println(cel+" градусов по цельсию равно "+CelToFarToCel.exToFar(cel)+" фаренгейтам");
    System.out.println(far+" градусов по фаренгейту равно "+CelToFarToCel.exToCel(far)+" цельсию");
    }
}
