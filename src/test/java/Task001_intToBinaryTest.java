import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task001_intToBinaryTest {
    @Test
    public void checkMethodCountBits() {
        assertEquals(5, Task001_intToBinary.countBits(1234));
        assertEquals(1, Task001_intToBinary.countBits(4));
        assertEquals(3, Task001_intToBinary.countBits(7));
        assertEquals(2, Task001_intToBinary.countBits(9));
        assertEquals(2, Task001_intToBinary.countBits(10));
    }

}