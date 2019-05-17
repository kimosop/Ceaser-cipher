import java.util.*;

public class CeaserCipher2 {
    //instantiating
    public String plaintext2;
    public int intShift2;
    public String decryptMessage = "";

    public CeaserCipher2(String plaintext2, int intShift2) {
        this.plaintext2 = plaintext2;
        this.intShift2 = intShift2;
    }


    public int getShift2() {
        return intShift2;
    }

    public String getPlaintext2() {
        return plaintext2;
    }

    public void setIntShift2( int newIntShift2) {
        intShift2 = newIntShift2;
    }

    public void setPlaintext2(String newPlaintext2) {
        plaintext2 = newPlaintext2;
    }

    public String decode(String plaintext2, int inShift2 ) {


        for(int i=0; i < plaintext2.length();i++)
        {
            // Shift one character at a time
            char alphabet = plaintext2.charAt(i);
            // if alphabet lies between a and z
            if((alphabet >= 'a' && alphabet <= 'z') ||
                    (alphabet >= 'A' && alphabet <= 'Z'))
            {
                // shift alphabet
                alphabet = (char) (alphabet - inShift2);

                // shift alphabet lesser than 'A'
                if(alphabet < 'A') {
                    //reshift to starting position
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                // shift alphabet lesser than 'a'
                else if(alphabet < 'a' && alphabet > 'Z') {
                    // reshift to starting position
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }
            }
            decryptMessage = decryptMessage + alphabet;
        }
        return  decryptMessage;

    }

}
