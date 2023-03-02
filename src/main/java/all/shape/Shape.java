package all.shape;
import java.util.*;
import java.util.logging.*;

public class Shape {
    private static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    static Scanner sc = new Scanner(System.in);

    protected Shape(){
        LOGGER.info("Shapes\n");
    }

    public static void run(){
        int n = 1;
        do{
            try{
                LOGGER.log(Level.INFO,"\n1.Triangle 2.Rectangle 3.Circle 4.Exit\n");
                int choice = sc.nextInt();
                if(choice == 1){
                    LOGGER.log(Level.INFO,"\nenter side 1: ");
                    double side1 = sc.nextDouble();
                    LOGGER.log(Level.INFO,"\nenter side 2: ");
                    double side2 = sc.nextDouble();
                    LOGGER.log(Level.INFO,"\nenter base: ");
                    double base = sc.nextDouble();
                    LOGGER.log(Level.INFO,"\nenter height: ");
                    double height = sc.nextDouble();

                    Shapes s = new Triangle(side1,side2,base,height);
                    s.perimeter();
                    s.area();
                }
                else if(choice == 2){
                    LOGGER.log(Level.INFO,"enter length: ");
                    double length = sc.nextDouble();
                    LOGGER.log(Level.INFO,"enter breadth: ");
                    double breadth = sc.nextDouble();

                    Shapes s = new Rectangle(length, breadth);
                    s.perimeter();
                    s.area();
                }
                else if(choice == 3){
                    LOGGER.log(Level.INFO,"enter radius: ");
                    double radius = sc.nextDouble();

                    Shapes s = new Circle(radius);
                    s.perimeter();
                    s.area();
                }
                else{
                    LOGGER.log(Level.INFO,"exiting..");
                    n=0;
                }
            }catch(Exception e){
                String s = ""+e;
                LOGGER.info(s);
                sc.nextLine();
                LOGGER.info("_______________________________________________");
            }
        }while(n == 1);
    }
    
}
