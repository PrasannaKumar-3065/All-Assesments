package all.main;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.*;

import all.bankcredit.BANK;
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
                    case 1:SimpleBankAccount.run();break;
                    case 2:Shape.run();break;
                    case 3:Gpa.run();break;
                    case 4:Connection.run();break;
                    case 5:AcccessPoints.run();break;
                    case 6:BANK.run();break;
                    case 7:CalculatorDs.run();break;
                    case 8:Collection.run();break;
                    case 9:Contacts.run();break;
                    case 10:Ds.run();break;
                    case 11:FilesRead.run();break;
                    case 12: StudentTest.run();break;
                    case 13:TicTacToe.run();break;
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
