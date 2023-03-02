package all.dbconnection;
import java.util.Scanner;
import java.util.logging.Logger;

public class Connection 
{
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    public static void run()
    {
            Scanner sc = new Scanner(System.in);
            LOGGER.info("Enter connection string: "); 
            String s = sc.next();
            Object c = CONNECT.instance(s);
            int n = 0;
            while(n==0){
                try{
                    LOGGER.info("1.Edit conection 2.view connection 3.close 4.exit");
                    int m = sc.nextInt();
                    if(m==1){
                        LOGGER.info("Enter connection string: "); 
                        ((CONNECT)c).con = sc.next();
                        s = "Connection changed to: "+((CONNECT)c).con;
                        LOGGER.info(s); 

                    }
                    else if(m==2){
                        s = c+" Connected to: "+((CONNECT)c).con;
                        LOGGER.info(s);
                    }
                    else if(m==3){
                        ((CONNECT)c).close();
                        CONNECT.c = null;
                    }
                    else{
                        n=1;
                    }
                }catch(Exception e){
                    LOGGER.info("Input mismatch");
                    sc.nextLine();
                }
            }
        
    }
}