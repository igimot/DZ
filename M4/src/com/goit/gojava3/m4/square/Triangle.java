package m4.figArea;

/**
 * Created by Oleg on 12.06.2016.
 */
public class Triangle extends Figure{
    int aT;
    int bT;

    Triangle(int aT, int bT){
        this.aT=aT;
        this.bT=bT;
    }
    @Override
    public double resArea() {
        double triArea = (aT* bT)/2;
        return triArea;
    }
}
