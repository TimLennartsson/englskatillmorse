import java.util.Scanner;

public class Inlamning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logik myInput = new Logik();
        String input1 = "";
        String input2 = "";
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Choose if you want to translate English to Morse code or vice versa." +
                    "\n[1] English to Morse code. " +
                    "\n[2] Morse code to English" +
                    "\n[3] Exit");

            int Menyval = Integer.parseInt(scan.nextLine());

            switch (Menyval) {
                case 1:
                    System.out.println("Type a English word.");
                    input1 = scan.nextLine();
                    System.out.println("It's translated to: " + myInput.setEngtomorse(input1.toUpperCase()));
                    break;
                case 2:
                    System.out.println("Type some Morse code.");
                    input2 = scan.nextLine();
                    System.out.println("It's translated to: " + myInput.setMorsetoeng(input2));
                    break;
                case 3:
                    isRunning = false;
            }
        }
    }
}

