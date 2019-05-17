import java.io.Console;

public class App {

    public static void main(String[] args) {
        Console myConsole = System.console();

        System.out.println("Input the message in plain text: ");

        String plaintext = myConsole.readLine( );

        System.out.println("Input the key (0-25): ");

        String shift = myConsole.readLine();

        int intShift = Integer.parseInt(shift);


        CeaserCipher cipher = new CeaserCipher(plaintext, intShift);
        cipher.encode(plaintext, intShift);

        System.out.println("Your deciphered text is: " + cipher.ciphertext);

    }

}
