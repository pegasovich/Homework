package TestsMy.TestjUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    private Calc c = new Calc();

    @Test
    void add() {
        assertEquals(4, c.add(2,2));
    }

    @Test
    void sub() {
        assertEquals(0, c.sub(2,2));
    }


    @Test
    void addMem() {
        c.memplus(5);
        assertEquals(5, c.getMem());
    }

    @Test
    void subMem() {
        c.memminus(5);
        assertEquals(-5, c.getMem());
    }

    @Test
    void combineMem() {
        c.memminus(5);
        c.memplus(5);
        assertEquals(0, c.getMem());
    }
}