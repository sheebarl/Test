import org.junit.jupiter.api.Test;
import se.jensen.caws21.codeadventure3.Main;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void subtract() {
        assertEquals(32, Main.subtract(50,18));
        assertEquals(3,Main.subtract(5,2));
        assertEquals(5,Main.subtract(12,7));

    }
}