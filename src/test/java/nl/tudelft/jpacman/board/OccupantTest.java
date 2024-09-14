package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test suite to confirm that {@link Unit}s correctly (de)occupy squares.
 *
 * @author Jeroen Roosen 
 *
 */
class OccupantTest {

    /**
     * The unit under test.
     */
    private Unit unit;

    /**
     * Resets the unit under test.
     */
    @BeforeEach
    void setUp() {
        unit = new BasicUnit();
    }

    /**
     * Asserts that a unit has no square to start with.
     */
    @Test
    void noStartSquare() {
        // Remove the following placeholder:
        assertThat(unit.hasSquare()).isFalse();


    }

    /**
     * Tests that the unit indeed has the target square as its base after
     * occupation.
     */
    @Test
    void testOccupy() {
        // Add square for unit
        Square sq1 = new BasicSquare();
        //Given unit occupy sq1 location
        unit.occupy(sq1);

        assertThat(unit.getSquare()).isEqualTo(sq1);
        assertThat(sq1.getOccupants()).contains(unit);
    }

    /**
     * Test that the unit indeed has the target square as its base after
     * double occupation.
     */
    @Test
    void testReoccupy() {
        //Add square for unit
        Square sq1 = new BasicSquare();
        unit.occupy(sq1);       //Given unit occupy sq1 location
        Square sq2 = new BasicSquare();
        unit.occupy(sq2);       //Given unit occupy sq2 location

        assertThat(unit.getSquare()).isEqualTo(sq2);
        assertThat(sq1.getOccupants()).doesNotContain(unit);
        assertThat(sq2.getOccupants()).contains(unit);
    }
}
