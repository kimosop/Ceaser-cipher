import org.junit.*;

import static org.junit.Assert.*;

public class CeaserCipherTest {

    @Test
    public void newCeaserCipher_instantiatesCorrectly() {
        CeaserCipher testCeaserCipher = new CeaserCipher("hello", 2);
        assertEquals(true, testCeaserCipher instanceof CeaserCipher);
    }



    @Test
    public void newCeaserCipher_getsPlaintext() {
        CeaserCipher testCeaserCipher = new CeaserCipher("hello", 2);
        assertEquals("jgnnq", testCeaserCipher.encode("hello", 2));

    }

    @Test
    public void newCeaserCipher2_instantiatesCorrectly() {
        CeaserCipher2 testCeaserCipher2 = new CeaserCipher2("jgnnq", 2);
        assertEquals(true, testCeaserCipher2 instanceof CeaserCipher2);
    }


    @Test
    public void newCeaserCipher2_getsPlaintext2() {
        CeaserCipher2 testCeaserCipher2 = new CeaserCipher2("jgnnq", 2);
        assertEquals("hello", testCeaserCipher2.decode("jgnnq", 2));

    }

}