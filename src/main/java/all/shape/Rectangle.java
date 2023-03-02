package all.shape;
import java.util.logging.*;

public class Rectangle extends Shapes{
    protected void perimeter(){
        ans = 2*(Shapes.length+Shapes.breadth);
        LOGGER.log(Level.INFO,Double.toString(ans),"Perimeter of rectangle: "+ans);
    }

    protected void area(){
        ans = (Shapes.length*Shapes.breadth);
        LOGGER.log(Level.INFO,Double.toString(ans),"Area of rectangle: "+ans);
    }
    protected Rectangle(double length, double breadth){
        Shapes.length = length;
        Shapes.breadth = breadth;
    }
}
