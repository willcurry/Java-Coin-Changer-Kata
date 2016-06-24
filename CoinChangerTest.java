import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinChangerTest {
    @Test
    public void changeNothing() {
        CoinChanger coinChanger = new CoinChanger();
        assertEquals("", coinChanger.change(0));
    }

    @Test
    public void change1() {
        CoinChanger coinChanger = new CoinChanger();
        assertEquals("1", coinChanger.change(1));
    }

    @Test
    public void change2() {
        CoinChanger coinChanger = new CoinChanger();
        assertEquals("2", coinChanger.change(2));
    }

    @Test
    public void change3() {
        CoinChanger coinChanger = new CoinChanger();
        assertEquals("2, 1", coinChanger.change(3));
    }

    @Test
    public void change4() {
        CoinChanger coinChanger = new CoinChanger();
        assertEquals("2, 2", coinChanger.change(4));
    }

    @Test
    public void change5() {
        CoinChanger coinChanger = new CoinChanger();
        assertEquals("5", coinChanger.change(5));
    }

    @Test
    public void change10() {
        CoinChanger coinChanger = new CoinChanger();
        assertEquals("10", coinChanger.change(10));
    }

    @Test
    public void change15() {
        CoinChanger coinChanger = new CoinChanger();
        assertEquals("10, 5", coinChanger.change(15));
    }

    @Test
    public void change40() {
        CoinChanger coinChanger = new CoinChanger();
        assertEquals("20, 20", coinChanger.change(40));
    }
}