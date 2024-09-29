package cleancode.minesweeper.tobe.io;

import cleancode.minesweeper.tobe.GameBoard;
import cleancode.minesweeper.tobe.GameException;

public interface OutputHandler {

    void showGameStartComments();

    void showBoard(GameBoard board);

    void showGameWinningComment();

    void showGameLosingComment();

    void showCommentForSelectingCell();

    void showCommentForUserAction();

    void showExceptionMessage(GameException e);

    void showSimpleMessage(String message);

}

/**
 * DIP (Dependency Inversion Principle) - 역전
 *
 * DI (Dependency Injection) - "3" 제 3자가 의존성을 주입 / 런타임 시점에 이루어짐
 * 주입 : 필요한 의존성을 외부에서 주입
 *
 * IoC (Inversion of Control) - Spring Context
 */