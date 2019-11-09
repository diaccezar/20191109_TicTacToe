import javax.imageio.metadata.IIOMetadataFormatImpl;

public class TicTacToe {

    public static final char SYMBOL_X = 'X';
    public static final char SYMBOL_0 = '0';
    public static final int SIZE = 3;   // STATIC SCOPE

    public char[][] board = new char[SIZE][SIZE];  // INSTANCE SCOOPE

    public Player player1;
    public Player player2;

    public TicTacToe(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void initBoard() {
        // puts spaces into all locations on board
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // shows the current state of the game
    public void showBoard() {
        System.out.println("Board:");

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // must determine how I want to show the values on the board
                int x = i * SIZE + j + 1;
                System.out.print("|_" + x + "_| ");
            }
            System.out.println();

        }
    }

    public int readMove() {
        return -1;
    }

    public void makeMove(Player player, int position) {

    }

    public void playGame() {
        //init board
        initBoard();
        showBoard();
        readMove();
        Player currentPlayer = player1;

        // while not win   // trebuie facute urmatoarele metode
        // read move
        // make move
        // show board  = apelam metoda showBoard
        // test win
        // change player ?
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }

    }
}
