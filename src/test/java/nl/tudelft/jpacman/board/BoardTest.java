package nl.tudelft.jpacman.board;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {
    private Square boardSquare;
    private Square[][] board1 = new Square[1][1];
    @BeforeEach
    void setUp() {
        boardSquare = new BasicSquare();
    }
    @Test
        public void ValidateBoard(){
        board1[0][0] = boardSquare;
        Board testBoard = new Board(board1);
        assertThat(testBoard.squareAt(0, 0)).isSameAs(boardSquare);

    }
    @Test
        public void testSquareAt(){
        Square[][] board2 = new Square[1][1];
        board2[0][0] = null;
        Board testBoard = new Board(board2);
        assertThat(testBoard.squareAt(0, 0)).isNull();

    }

}
