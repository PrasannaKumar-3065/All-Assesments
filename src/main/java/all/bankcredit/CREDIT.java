package all.bankcredit;
import java.util.logging.*;

class CREDIT{
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    String holdername;
    int number;
    String date;
    protected CREDIT(String holdername, int number, String date){
        this.holdername = holdername;
        this.number = number;
        this.date = date;
    }
    protected CREDIT(CREDIT obj)
    {
        holdername=obj.holdername;
        number=obj.number;
        date=obj.date;

    }
    protected void check(int number){
        if(number == this.number){
            LOGGER.info("Same card number");
        }
        else{
            LOGGER.info("Different card number");
        }
    }
}
