package m4.figArea;

/**
 * Created by Oleg on 12.06.2016.
 */
public class Rectangle extends Figure{
    int aR;
    int bR;

    Rectangle(int aR, int bR){
        this.aR=aR;
        this.bR=bR;
    }
    @Override
    public double resArea() {
        double recArea = aR* bR;
        return recArea;
    }
}
