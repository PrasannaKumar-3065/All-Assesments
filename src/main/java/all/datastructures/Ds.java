package all.datastructures;
import java.util.*;
import java.util.logging.Logger;

public class Ds {
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    protected Ds(){
        LOGGER.info("Ds initiated");
    }
    public static void run(){

        Scanner sc = new Scanner(System.in);
        int n = 0;
        do{
            try{
                LOGGER.info("1.LinkedList 2.Array 3.Exit");
                int choice = sc.nextInt();
                if(choice == 1){
                    List l = new List();
                    l.accessList();
                }
                else if(choice == 2){
                    Array arr = new Array();
                    arr.accessArray();
                }
                else if(choice == 3){
                    n = 1;
                }
            }catch(Exception e){
                String s = ""+e;
                LOGGER.info(s);
            }
        }while(n == 0);
        

    }
}
