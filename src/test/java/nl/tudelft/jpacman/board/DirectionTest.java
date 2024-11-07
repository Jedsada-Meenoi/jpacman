package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * A very simple (and not particularly useful)
 * test class to have a starting point where to put tests.
 *
 * @author Arie van Deursen
 */
public class DirectionTest {
    /**
     * Do we get the correct delta when moving north?
     */
    @Test
    void testNorth() {
        // method implementation
        Direction north = Direction.valueOf("NORTH");
        assertThat(north.getDeltaY()).isEqualTo(-1);
    }
    @Test
    void testSouth() {
        // method implementation
        Direction north = Direction.valueOf("SOUTH");
        assertThat(north.getDeltaY()).isEqualTo(1);
    }
    @Test
    void testEast() {
        // method implementation
        Direction north = Direction.valueOf("EAST");
        assertThat(north.getDeltaX()).isEqualTo(1);
    }
    @Test
    void testWest() {
        // method implementation
        Direction north = Direction.valueOf("WEST");
        assertThat(north.getDeltaX()).isEqualTo(-1);
    }
}
