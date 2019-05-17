import java.util.*;

public class CeaserCipher {

    //instantiating
    public String plaintext;
    public int shift;
    public String ciphertext = "";

    public CeaserCipher(String plaintext, int shift) {
        this.plaintext = plaintext;
        this.shift = shift;
    }

    public int getShift() {
        return shift;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public void setIntShift( int newIntShift) {
        shift = newIntShift;
    }

    public void setPlaintext(String newPlaintext) {
        plaintext = newPlaintext;
    }

    public String encode(String plaintext, int shift ) {


        for(int i=0; i < plaintext.length();i++)
        {
            // Shift one character at a time
            char alphabet = plaintext.charAt(i);

            // if alphabet lies between a and z
            if((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z'))
            {
                // shift alphabet
                alphabet = (char) (alphabet + shift);
            }
            // if shift alphabet greater than 'z'

            if(alphabet > 'z') {

                // reshift to starting position
                alphabet = (char) (alphabet+'a'-'z'-1);
            }

            // if shift alphabet greater than 'Z'
            else if(alphabet > 'Z' && alphabet < 'a') {

                //reshift to starting position
                alphabet = (char) (alphabet+'A'-'Z'-1);
            }
            ciphertext = ciphertext + alphabet;
        }
        return  ciphertext;

    }

}
