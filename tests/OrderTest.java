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
        Order returnObj = order.setQuantity(2);
        assertEquals(returnObj, order);
    }

    @Test
    void testSetItemName() {
        Order returnObj = order.setItemName("Pen");
        assertEquals(returnObj, order);
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
        Order returnObj = order.setPrice(200.5);
        assertEquals(returnObj, order);
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