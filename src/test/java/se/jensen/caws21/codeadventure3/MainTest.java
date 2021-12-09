package se.jensen.caws21.codeadventure3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {



    @Test
    void myAdd() {
        Assertions.assertEquals(10,Main.myAdd(5,9));
        Assertions.assertEquals(50,Main.myAdd(25,25));
    }
}