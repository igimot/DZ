package m4.temp2;

/**
 * Created by Oleg on 13.06.2016.
 */
public class CelToFarToCel {
    public static double exToCel(double far){

        return (far - 32)*1.8;
    }

    public static double exToFar(double cel){

        return (cel * 1.8) + 32;

    }
}
