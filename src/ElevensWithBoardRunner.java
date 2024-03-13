import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ElevensWithBoardRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElevensBoard board = new ElevensBoard();
        System.out.println(board);
        while (!board.gameIsWon() && board.anotherPlayIsPossible()) {
            System.out.print("Enter two or three cards to remove: ");
            String input = scanner.nextLine();
            String[] positions = input.split("\\s+");
            List<Integer> selectedCards = new ArrayList<>();
            for (String position : positions) {
                selectedCards.add(Integer.parseInt(position));
            }
            if (board.isLegal(selectedCards)) {
                board.replaceSelectedCards(selectedCards);
                System.out.println(board);
            } else {
                System.out.println("Invalid move!");
            }
        }
        if (board.gameIsWon()) {
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("Game over! No more moves possible.");
        }
    }
}