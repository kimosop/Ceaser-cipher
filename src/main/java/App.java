import java.io.Console;

public class App {
    public static void main(String[] args) {



        Console myConsole = System.console();

        System.out.println("Input the plaintext message to be encrypted : ");

        String plaintext = myConsole.readLine();


        System.out.println("Enter the value by which to shift the plaintext(value between 1-25) :");

        String shift = myConsole.readLine();

        int intShift = Integer.parseInt(shift);



        CeaserCipher cipher = new CeaserCipher( plaintext, intShift);

        cipher.encode(plaintext , intShift);

        System.out.println(" Your decrypted text is : " + cipher.ciphertext);


    }
}