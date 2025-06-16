import com.kata.app.Anagram;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramGeneratorTest {



    @Test
    void testGenerateAnagrams() {
        List<String> result = Anagram.generateAnagrams("abc");
        assertEquals(6, result.size());
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("acb"));
        assertTrue(result.contains("bac"));
        assertTrue(result.contains("bca"));
        assertTrue(result.contains("cab"));
        assertTrue(result.contains("cba"));
    }

    @Test
    void testSingleCharacter() {
        List<String> result = Anagram.generateAnagrams("a");
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Anagram.generateAnagrams(""));
        assertThrows(IllegalArgumentException.class, () -> Anagram.generateAnagrams("123"));
    }
}
