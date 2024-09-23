package cleancode.minesweeper.tobe.io;

import cleancode.minesweeper.tobe.GameBoard;
import cleancode.minesweeper.tobe.GameException;

import java.util.List;
import java.util.stream.IntStream;

public interface OutputHandler {

    void showGameStartComments();

    void showBoard(GameBoard board);

    void printGameWinningComment();

    void printGameLosingComment();

    void printCommentForSelectingCell();

    void printCommentForUserAction();

    void printExceptionMessage(GameException e);

    void printSimpleMessage(String message);

}
