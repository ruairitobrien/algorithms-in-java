package algoritms.multiplication;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

public class KaratsubaTest {

    private Karatsuba karatsuba = new Karatsuba();

    @Test
    public void multiplyByZero() {
        var x = new BigInteger("2");
        var y = new BigInteger("0");
        var expected = new BigInteger("0");
        var actual = karatsuba.multiply(x, y);
        assertEquals(expected, actual);
    }

    @Test
    public void multiplyByOne() {
        var x = new BigInteger("10");
        var y = new BigInteger("1");
        var expected = new BigInteger("10");
        var actual = karatsuba.multiply(x, y);
        assertEquals(expected, actual);
    }

    @Test
    public void smallNumbers() {
        var x = new BigInteger("3");
        var y = new BigInteger("2");
        var expected = new BigInteger("6");
        var actual = karatsuba.multiply(x, y);
        assertEquals(expected, actual);
    }

    @Test
    public void normalNumbers() {
        var x = new BigInteger("300");
        var y = new BigInteger("20");
        var expected = new BigInteger("6000");
        var actual = karatsuba.multiply(x, y);
        assertEquals(expected, actual);
    }

    @Test
    public void bigNumbers() {
        var x = new BigInteger("3141592653589793238462643383279502884197169399375105820974944592");
        var y = new BigInteger("2718281828459045235360287471352662497757247093699959574966967627");
        var expected = new BigInteger(
                "8539734222673567065463550869546574495034888535765114961879601127067743044893204848617875072216249073013374895871952806582723184");
        var actual = karatsuba.multiply(x, y);
        assertEquals(expected, actual);
    }
}
