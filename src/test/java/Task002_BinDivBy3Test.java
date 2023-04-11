import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task002_BinDivBy3Test {
    @Test
    public void checkRegexBinaryDivisibleBy3() {
        assertEquals(false, Task002_BinDivBy3.multipleOf3().matcher(" 0").matches());
        assertEquals(false, Task002_BinDivBy3.multipleOf3().matcher("abc").matches());
        assertEquals(true, Task002_BinDivBy3.multipleOf3().matcher("000").matches());

        assertEquals(true, Task002_BinDivBy3.multipleOf3().matcher("110").matches());
        assertEquals(false, Task002_BinDivBy3.multipleOf3().matcher("111").matches());
        assertEquals(true, Task002_BinDivBy3.multipleOf3().matcher(Integer.toBinaryString(12345678)).matches());
    }

}