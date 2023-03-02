package all.shape;
import java.util.logging.*;


abstract class Shapes{
    protected static double radius;
    protected static double base;
    protected static double length;
    protected static double height;
    protected static double breadth;
    protected static double side1;
    protected static double side2;
    protected double ans;
    protected static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    protected abstract void perimeter();
    protected abstract void area();

}
