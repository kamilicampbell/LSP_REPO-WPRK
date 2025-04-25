package org.howard.edu.lspfinal.question1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    @Test
    @DisplayName("Test for adding valid item")
    public void testAddValidItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Book", 25.0);
        assertEquals(25.0, cart.getTotalCost(), 0.001);
    }

    @Test
    @DisplayName("Test for adding item with 0 price (expect no exception)")
    public void testAddItemWithZeroPrice() {
        ShoppingCart cart = new ShoppingCart();
        assertDoesNotThrow(() -> cart.addItem("Free Gift", 0.0));
        assertEquals(0.0, cart.getTotalCost(), 0.001);
    }

    @Test
    @DisplayName("Test for adding item with negative price (expect exception)")
    public void testAddItemWithNegativePrice() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> cart.addItem("Invalid Item", -10.0));
    }

    @Test
    @DisplayName("Test for applying 'SAVE10'")
    public void testApplySave10() {
        ShoppingCart cart = new ShoppingCart();
        cart.applyDiscountCode("SAVE10");
        assertEquals(10.0, cart.getDiscountPercentage(), 0.001);
    }

    @Test
    @DisplayName("Test for applying 'SAVE20'")
    public void testApplySave20() {
        ShoppingCart cart = new ShoppingCart();
        cart.applyDiscountCode("SAVE20");
        assertEquals(20.0, cart.getDiscountPercentage(), 0.001);
    }

    @Test
    @DisplayName("Test for applying invalid code (expect exception)")
    public void testApplyInvalidCode() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> cart.applyDiscountCode("SAVE50"));
    }

    @Test
    @DisplayName("Test total cost without discount")
    public void testTotalWithoutDiscount() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Item1", 40.0);
        cart.addItem("Item2", 60.0);
        assertEquals(100.0, cart.getTotalCost(), 0.001);
    }

    @Test
    @DisplayName("Test total cost with discount")
    public void testTotalWithDiscount() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Item1", 50.0);
        cart.addItem("Item2", 50.0);
        cart.applyDiscountCode("SAVE20");
        assertEquals(80.0, cart.getTotalCost(), 0.001);
    }

    @Test
    @DisplayName("Test total cost with empty cart")
    public void testTotalWithEmptyCart() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0.0, cart.getTotalCost(), 0.001);
    }
}
