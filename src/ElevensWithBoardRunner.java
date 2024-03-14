import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ElevensWithBoardRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElevensBoard board = new ElevensBoard();
        while (!board.gameIsWon()) {
            System.out.println(board);
            if (!board.anotherPlayIsPossible()) {
                System.out.println("No play is possible!  Try again!");
                break;
            }
            System.out.print("Enter two or three cards to remove: ");
            String cardInput = sc.nextLine();
            String[] pos = cardInput.split(" ");
            System.out.println("got " + pos.length + " index values to work with");
            List<Integer> selected = new ArrayList<>();
            for (String val : pos) {
                selected.add(Integer.parseInt(val));
            }
            if (board.isLegal(selected)) {
                board.replaceSelectedCards(selected);
            } else {
                System.out.println("Invalid move!");
            }
        }
        if (board.gameIsWon()) {
            System.out.println("You won!");
        }
    }
}