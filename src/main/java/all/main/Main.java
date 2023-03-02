package all.main;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.*;

import all.bankcredit.Bank;
import all.calculatords.CalculatorDs;
import all.collections.Collection;
import all.contacts.Contacts;
import all.datastructures.Ds;
import all.dbconnection.Connection;
import all.filereading.FilesRead;
import all.points.AcccessPoints;
import all.shape.Shape;
import all.simplebankaccount.SimpleBankAccount;
import all.studentds.StudentTest;
import all.studentgpa.Gpa;
import all.tictactoe.TicTacToe;

public class Main 
{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void main( String[] args ) throws CloneNotSupportedException, IOException
    {
        Scanner sc = new Scanner(System.in);
        int in = 0;
        do{
            try{
                Log.info("1.Simple-Bank-Account\n2.Shape-Area\n3.Student-Gpa\n4.Database-Connection\n5.Points-Difference\n6.Bank-Credit-Card\n7.Simple-Calculator\n8.Java-Collections\n9.Contacts\n10.DataStructures\n11.File-Reading\n12.Student-DataStructures\n13.TicTacToe\n14.Exit");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:SimpleBankAccount.Run();break;
                    case 2:Shape.Run();break;
                    case 3:Gpa.Run();break;
                    case 4:Connection.Run();break;
                    case 5:AcccessPoints.Run();break;
                    case 6:Bank.Run();break;
                    case 7:CalculatorDs.Run();break;
                    case 8:Collection.Run();break;
                    case 9:Contacts.Run();break;
                    case 10:Ds.Run();break;
                    case 11:FilesRead.Run();break;
                    case 12: StudentTest.Run();break;
                    case 13:TicTacToe.Run();break;
                    case 14:in=1;break;
                }
            }catch(Exception e){
                String s = ""+e;
                Log.info(s);
                sc.nextLine();
            }
        }while(in == 0);
        
    }
}
