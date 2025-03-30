import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMorseTest {

    private final MorseCodeTranslator translator = new MorseCodeTranslator();

    @Test
    public void testTextTillMorse() {
        String inputText = "HELLO";
        String expected = ".... . .-.. .-.. ---";
        String actual = translator.textToMorse(inputText);

        assertEquals(expected, actual);

    }

    @Test
    public void testMorseTillText() {
        String inputText = ".... . .-.. .-.. ---";
        String expected = "HELLO";
        String actual = translator.morseToText(inputText);

        assertEquals(expected, actual);

    }

    @Test
    public void testTextWithInvalidCharachterTillMorse() {
        String inputText = "HELLO?";
        String expected = ".... . .-.. .-.. --- ?";
        String actual = translator.textToMorse(inputText);

        assertEquals(expected, actual);
    }

    @Test
    public void testTextWithInvalidCharachter2TillMorse() {
        String inputText = "HELLO?";
        String expected = ".... . .-.. .-.. --- ?";
        String actual = translator.textToMorse(inputText);

        assertEquals(expected, actual);
    }

    @Test
    public void testTextWithInvalidCharachter3TillMorse() {
        String inputText = "HELLO!";
        String expected = ".... . .-.. .-.. --- ?";
        String actual = translator.textToMorse(inputText);

        assertEquals(expected, actual);
    }
    @Test
    public void testMorseInvalidToText() {
        String inputMorse = ".... . .-.. .-.. ---";
        String expected = "HELLO";

        String actual = translator.morseToText(inputMorse);

        assertEquals(expected, actual);
    }
}