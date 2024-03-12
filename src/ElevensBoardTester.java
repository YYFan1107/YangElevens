import java.util.List;

public class ElevensBoardTester {

    public static void main(String[] args) {
        // Create a new ElevensBoard
        ElevensBoard elevensBoard = new ElevensBoard();

        // Print the initial state
        System.out.println("Initial Board State:");
        System.out.println(elevensBoard);

        // Deal some cards to the board
        elevensBoard.deal(0);
        elevensBoard.deal(3);
        elevensBoard.deal(6);

        // Print the state after dealing cards
        System.out.println("Board State After Dealing Cards:");
        System.out.println(elevensBoard);

        // Replace selected cards
        List<Integer> selectedCards = elevensBoard.cardIndexes();
        System.out.println("Selected Cards to Replace: " + selectedCards);
        elevensBoard.replaceSelectedCards(selectedCards);

        // Print the state after replacing cards
        System.out.println("Board State After Replacing Selected Cards:");
        System.out.println(elevensBoard);

        // Check if the game is won
        if (elevensBoard.gameIsWon()) {
            System.out.println("Congratulations! You won the game!");
        } else {
            System.out.println("The game is not yet won.");
        }

        // Start a new game
        elevensBoard.newGame();

        // Print the state after starting a new game
        System.out.println("Board State After Starting a New Game:");
        System.out.println(elevensBoard);
    }
}