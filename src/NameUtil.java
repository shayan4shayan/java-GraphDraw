import java.util.ArrayList;
import java.util.List;

public class NameUtil {
    private static NameUtil instance;

    public static NameUtil getInstance() {
        if (instance == null) {
            instance = new NameUtil();
        }
        return instance;
    }

    private List<Character> characters = new ArrayList<>();

    private String lastName = "";

    public NameUtil() {
        initCharacters();
    }

    private void initCharacters() {
        characters.add('a');
        characters.add('b');
        characters.add('c');
        characters.add('d');
        characters.add('e');
        characters.add('f');
        characters.add('g');
        characters.add('h');
        characters.add('i');
        characters.add('j');
        characters.add('k');
        characters.add('l');
        characters.add('m');
        characters.add('n');
        characters.add('o');
        characters.add('p');
        characters.add('q');
        characters.add('r');
        characters.add('s');
        characters.add('t');
        characters.add('u');
        characters.add('v');
        characters.add('w');
        characters.add('x');
        characters.add('y');
        characters.add('z');
    }

    public String getName() {
        if (lastName.isEmpty()) {
            return deliverAndUpdateName('a');
        }
        char ch = getNextChar();
        if (ch == 'a') {
            lastName += ch;
        }
        return deliverAndUpdateName(ch);
    }

    private char getNextChar() {
        char ch = lastName.charAt(lastName.length() - 1);
        if (ch == 'z') return 'a';
        int index = characters.indexOf(ch);
        return characters.get(index + 1);
    }

    private String deliverAndUpdateName(char ch) {
        if (this.lastName.isEmpty()) {
            lastName = String.valueOf(ch);
        } else {
            lastName = lastName.substring(0, lastName.length() - 1) + ch;
        }
        return lastName;
    }
}
