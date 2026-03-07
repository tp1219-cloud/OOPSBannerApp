public class UC7OOPSBannerApp {

    // Inner Static Class
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter methods
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility methods to create patterns
    static String[] getOPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    static String[] getPPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    static String[] getSPattern() {
        return new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        CharacterPatternMap[] characters = {
            new CharacterPatternMap('O', getOPattern()),
            new CharacterPatternMap('O', getOPattern()),
            new CharacterPatternMap('P', getPPattern()),
            new CharacterPatternMap('S', getSPattern())
        };

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap c : characters) {
                line.append(c.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}