package all.shape;
import java.util.logging.*;

public class Circle extends Shapes{
    protected void perimeter(){
        ans = 2*3.14*Shapes.radius;
        LOGGER.log(Level.INFO,Double.toString(ans),"Perimeter of circle: "+ans);
    }

    protected void area(){
        ans = 3.14*(Shapes.radius*Shapes.radius);
        LOGGER.log(Level.INFO,Double.toString(ans),"Area of circle: "+ans);
    }

    protected Circle(double radius){
        Shapes.radius = radius;
    }
}