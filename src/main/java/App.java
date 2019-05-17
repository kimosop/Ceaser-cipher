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



        System.out.println("Input the plaintext message : ");

        String plaintext2 = myConsole.readLine();


        System.out.println("Enter the value by which each character in the plaintext message gets shifted :");

        String shift2 = myConsole.readLine();

        int intShift2 = Integer.parseInt(shift2);



        CeaserCipher2 decipher = new CeaserCipher2( plaintext2, intShift2);

        decipher.setPlaintext2(plaintext2);
        decipher.setIntShift2(intShift2);

        decipher.decode(plaintext2 , intShift2);

        System.out.println(" Your decoded text is : " + decipher.decryptMessage);
    }
}