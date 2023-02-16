import java.util.HashMap;


public class Logik {


    private HashMap<Character, String> translate;

    private String Engtomorse;

    private String Morsetoeng;


    public Logik() {
        Engtomorse = "";
        Morsetoeng = "";
        translate = new HashMap<>();

    }


    public String setEngtomorse(String input1) {
        String[] Morsecode = {"-*", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**", "*---", "-*-", "*-**", "--", "*-", "---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--", "-**-", "-*--", "--**", "*----", "**---", "***--", "****-", "*****", "-****", "--***", "---**", "----*", "-----", "*-*-*-", "--**--", "**--**"};
        char[] Letter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', ',', '?'};
        String[] array = input1.split(" ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < Letter.length; j++) {
                if (array[i].compareTo(String.valueOf(Letter[j])) == 0) {
                    Engtomorse += (Morsecode[j]) + " ";
                }
            }

        }
        return Engtomorse;
    }

    public String setMorsetoeng (String input2) {
        char[] Letter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', ',', '?'};
        String[] Morsecode = {"-*", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**", "*---", "-*-", "*-**", "--", "*-", "---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--", "-**-", "-*--", "--**", "*----", "**---", "***--", "****-", "*****", "-****", "--***", "---**", "----*", "-----", "*-*-*-", "--**--", "**--**"};
        String[] array = input2.split(" ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < Morsecode.length; j++) {
                if (array[i].compareTo(Morsecode[j]) == 0) {
                    Morsetoeng += (Letter[j]) + "";
                }
            }

        }

        return Morsetoeng;
    }

}








