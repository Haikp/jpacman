package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.board.*;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateBoardTest {
    Square[][] boardSize = new Square[3][3];
    private final PacManSprites Sprite = new PacManSprites();
    private final BoardFactory TestFactory = new BoardFactory(Sprite);

    @Test
    void testCreateGround(){
        for (int i = 0; i < boardSize.length; i++)
        {
            for (int j = 0; j <boardSize[i].length; j++)
            {
                boardSize[i][j] = TestFactory.createGround();
            }
        }
    }

    @Test
    void testCreateWall(){
        for (int i = 0; i < boardSize.length; i++)
        {
            for (int j = 0; j <boardSize[i].length; j++)
            {
                boardSize[i][j] = TestFactory.createWall();
            }
        }
    }
    @Test
    void testBoardGeneration(){
        for (int i = 0; i < boardSize.length; i++)
        {
            for (int j = 0; j <boardSize[i].length; j++)
            {
                boardSize[i][j] = TestFactory.createGround();
            }
        }

        Board TestBoard = TestFactory.createBoard(boardSize);
    }
}
