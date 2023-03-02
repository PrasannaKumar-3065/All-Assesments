package all.tictactoe;

import java.util.logging.Logger;
import java.util.*;



public class TicTacToe extends Validate {

    private static final Logger LOGGER = Logger.getLogger("InfoLogging");

    public static void Run() {
        LOGGER.info("Enter dimensions for tic-tac-toe:");
        int dim = sc.nextInt();
        createGrid(dim);
        int st = 0;
        do {
            try{
                if (checkWin() == 0) {
                    show();
                    LOGGER.info("\n-- User1 --\nEnter row number");
                    int row = sc.nextInt();
                    LOGGER.info("\nEnter column number");
                    int col = sc.nextInt();
                    assign(1, row, col);
                    show();
                    if (checkWin() == 0) {
                        LOGGER.info("\n-- User2 --\nEnter row number");
                        row = sc.nextInt();
                        LOGGER.info("\nEnter column number");
                        col = sc.nextInt();
                        assign(2, row, col);
                        show();
                    }
                    else if(checkWin() == 2){
                        LOGGER.info("Draw");
                        st = 1;
                    } 
                    else {
                        LOGGER.info("Player 1 wins");
                        st = 1;
                    }

                }
                else if(checkWin() == 2){
                    LOGGER.info("Draw");
                    st = 1;
                }  
                else {
                    LOGGER.info("Player 2 wins");
                    st = 1;
                }
        }catch(Exception e){
            e.printStackTrace();
            sc.nextLine();
        }
        } while (st == 0);
    }
}
