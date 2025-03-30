import java.util.HashMap;

public class MorseCodeTranslator {
    private static final HashMap<Character, String> MORSE_CODE_DICT = new HashMap<>();
    private static final HashMap<String, Character> REVERSE_MORSE_CODE_DICT = new HashMap<>();

    static {
        MORSE_CODE_DICT.put('A', ".-");
        MORSE_CODE_DICT.put('B', "-...");
        MORSE_CODE_DICT.put('C', "-.-.");
        MORSE_CODE_DICT.put('D', "-..");
        MORSE_CODE_DICT.put('E', ".");
        MORSE_CODE_DICT.put('F', "..-.");
        MORSE_CODE_DICT.put('G', "--.");
        MORSE_CODE_DICT.put('H', "....");
        MORSE_CODE_DICT.put('I', "..");
        MORSE_CODE_DICT.put('J', ".---");
        MORSE_CODE_DICT.put('K', "-.-");
        MORSE_CODE_DICT.put('L', ".-..");
        MORSE_CODE_DICT.put('M', "--");
        MORSE_CODE_DICT.put('N', "-.");
        MORSE_CODE_DICT.put('O', "---");
        MORSE_CODE_DICT.put('P', ".--.");
        MORSE_CODE_DICT.put('Q', "--.-");
        MORSE_CODE_DICT.put('R', ".-.");
        MORSE_CODE_DICT.put('S', "...");
        MORSE_CODE_DICT.put('T', "-");
        MORSE_CODE_DICT.put('U', "..-");
        MORSE_CODE_DICT.put('V', "...-");
        MORSE_CODE_DICT.put('W', ".--");
        MORSE_CODE_DICT.put('X', "-..-");
        MORSE_CODE_DICT.put('Y', "-.--");
        MORSE_CODE_DICT.put('Z', "--..");
        MORSE_CODE_DICT.put(' ', "/");

        for (var entry : MORSE_CODE_DICT.entrySet()) {
            REVERSE_MORSE_CODE_DICT.put(entry.getValue(), entry.getKey());
        }
    }

    public String textToMorse(String text) {
        if (text == null || text.isEmpty()) {
        throw new IllegalArgumentException("Texten får inte vara null eller tom.");
    }
        StringBuilder morse = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            morse.append(MORSE_CODE_DICT.getOrDefault(c, "?")).append(" ");
        }
        return morse.toString().trim();
    }

    public String morseToText(String morse) {
        if (morse == null || morse.isEmpty()) {
        throw new IllegalArgumentException("Texten får inte vara null eller tom.");
    }
        StringBuilder english = new StringBuilder();
        for (String code : morse.split(" ")) {
            english.append(REVERSE_MORSE_CODE_DICT.getOrDefault(code, '?'));
        }
        return english.toString();
    }
}
