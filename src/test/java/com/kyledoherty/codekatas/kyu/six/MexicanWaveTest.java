package com.kyledoherty.codekatas.kyu.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MexicanWaveTest {

    @Test
    public void basicTest1() {
        String[] result = new String[] { "Hello", "hEllo", "heLlo", "helLo", "hellO" };
        assertArrayEquals(result, MexicanWave.wave("hello"));
    }

    @Test
    public void basicTest2() {
        String[] result = new String[] { "Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs", "codewaRs", "codewarS" };
        assertArrayEquals(result, MexicanWave.wave("codewars"));
    }

    @Test
    public void basicTest3() {
        String[] result = new String[] { };
        assertArrayEquals(result, MexicanWave.wave(""));
    }

    @Test
    public void basicTest4() {
        String[] result = new String[] { "Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS" };
        assertArrayEquals(result, MexicanWave.wave("two words"));
    }

    @Test
    public void basicTest5() {
        String[] result = new String[] { " Gap ", " gAp ", " gaP " };
        assertArrayEquals(result, MexicanWave.wave(" gap "));
    }

    @Test
    public void basicTest6() {
        String[] result = new String[] { "Ab cd ef", "aB cd ef", "ab Cd ef", "ab cD ef", "ab cd Ef", "ab cd eF" };
        assertArrayEquals(result, MexicanWave.wave("ab cd ef"));
    }

    @Test
    public void basicTest7() {
        String[] result = new String[] {"A       b    ", "a       B    "};
        assertArrayEquals(result, MexicanWave.wave("a       b    "));
    }

}