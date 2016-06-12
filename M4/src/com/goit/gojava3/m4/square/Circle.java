package m4.figArea;

/**
 * Created by Oleg on 12.06.2016.
 */
public class Circle extends Figure {

    int rad;
    Circle(int rad){
        this.rad=rad;
    }

    @Override
    public double resArea() {
        double radCirc=Math.PI*(rad*rad);
        return radCirc;
    }


}
