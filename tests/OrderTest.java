import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private Order order = new Order(2, "Pen", 200.50);
    @Test
    void testGetQuantity() {
        int expected = 2;
        assertTrue(order.getQuantity() == expected);
    }

    @Test
    void testSetQuantity() {
        int expected = 2;
        assertTrue(order.getQuantity() == expected );
    }

    @Test
    void testSetItemName() {
        String expected = "Pen";
        String actual = order.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    void testGetItemName() {
        String expected = "Pen";
        String actual = order.getItemName();
        assertTrue(expected.equals(actual));
    }

    @Test
    void testGetPrice() {
        Double expected = 200.5;
        Double actual = order.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    void testSetPrice() {
        Double expected = 300.5;
        Double actual = order.getPrice();
        assertNotEquals(expected, actual);
    }

    @Test
    void testGetPriceWithTex() {
        Double expected = 307.75;
        Double actual = 300.75;
        assertNotEquals(expected, actual);
    }

    @Test
    void testSetPriceWithTex() {
        Double expected = 300.75;
        Double actual = 300.75;
        assertTrue(expected.equals(actual));
    }

}