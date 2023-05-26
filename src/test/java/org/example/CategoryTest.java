package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CategoryTest {

    Category a;
    Category b;
    Category c;
    Category d;
    Category e;

    @BeforeEach
    void setUp() {
        a = new Category("A", null);
        b = new Category("B", a);
        c = new Category("C", a);
        d = new Category("D", b);
        e = new Category("E", b);
        a.setKeyWords(Arrays.asList("1","2","3"));
        e.setKeyWords(Arrays.asList("4","5","6"));
    }

    @Test
    void testKeyWords(){
        List<String> lista = (Arrays.asList("1","2","3"));
        assertEquals(a.getKeyWords(),lista);
    }

    @Test
    void testGetKeyWordsFromParent(){
        List<String> lista = (Arrays.asList("1","2","3"));
        assertEquals(d.getKeyWords(),lista);
    }

    @Test
    void testGetKeyWordsNotFromParent(){
        List<String> lista = (Arrays.asList("1","2","3"));
        assertNotEquals(e.getKeyWords(),lista);
    }

    @Test
    void testLevel(){
        int level = 2;
        assertEquals(level, d.getLevel());
    }

    /*@Test
    void testMain() {
        // Setup
        // Run the test
        Main.main(new String[]{"args"});

        // Verify the results
    }*/
}
