package nl.tudelft.jpacman.board;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for the Board functionality.
 */
public class BoardTest {
    private Square boardSquare;
    private Square[][] board1 = new Square[1][1];   // setting board 1x1
    @BeforeEach
    void setUp() {
        boardSquare = new BasicSquare();
    } // set square inside board space
    @Test
        public void validateBoard() {
        // method implementation
        board1[0][0] = boardSquare; //fill square space with basic square in board
        Board testBoard = new Board(board1);
        assertThat(testBoard.squareAt(0, 0)).isSameAs(boardSquare); //Validate board

    }
    @Test
        public void testSquareAt() {
        // method implementation
        board1[0][0] = null; //fill square space with null square in board
        Board testBoard = new Board(board1);
        assertThat(testBoard.squareAt(0, 0)).isNull(); //Validate for null

    }

}
