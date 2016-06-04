package DZ.M4.src.com.goit.gojava3.m4.temperatureValue;

/**
 * Created by Oleg on 04.06.2016.
 */
public class TempCelsFarin {
    private double celTemp;
    private double farTemp;
    public TempCelsFarin(){
        celTemp = 0;
        farTemp = 32;
    }
    public static double Celsium2Farenh(double c){
        return c * 9 / 5 + 32;
    }
    public static double Farenh2Celsium (double f){
        return (f - 32) * 5 / 9;
    }
    public double getCelTemp() {
        return celTemp;
    }

    public void setCelTemp(double celTemp) {
        this.celTemp = celTemp;
        this.farTemp = Celsium2Farenh(celTemp);
    }

    public double getFarTemp() {
        return farTemp;
    }

    public void setFarTemp(double farTemp) {
        this.farTemp = farTemp;
        this.celTemp = Farenh2Celsium(farTemp);
    }
}
