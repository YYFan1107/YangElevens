import java.util.ArrayList;
import java.util.List;

public class ElevensBoardTester {

    public static void main(String[] args) {
        ElevensBoard board = new ElevensBoard();

        System.out.println("Initial Board:");
        System.out.println(board);

        List<Integer> selectedCards = new ArrayList<>();
        selectedCards.add(0);
        selectedCards.add(1);
        board.replaceSelectedCards(selectedCards);

        System.out.println("Board after replacing cards:");
        System.out.println(board);

        board.deal(2);
        board.deal(3);

        System.out.println("Board after dealing cards:");
        System.out.println(board);

        System.out.println("Is game won? " + board.gameIsWon());
    }
}