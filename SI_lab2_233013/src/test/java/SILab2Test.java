import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class SILab2Test {

    @Test
    public void testEveryStatement() {
        // tes 1:
        RuntimeException ex1 = assertThrows(RuntimeException.class,
                () -> SILab2.checkCart(null, "1234567812345678"));
        assertTrue(ex1.getMessage().contains("allItems list can't be null!"));

        // test 2:
        List<Item> items2 = List.of(new Item("", 4, 100, 0));
        RuntimeException ex2 = assertThrows(RuntimeException.class,
                () -> SILab2.checkCart(items2, "1234567812345678"));
        assertTrue(ex2.getMessage().contains("Invalid item!"));

        // test 3:
        List<Item> items3 = List.of(new Item("item", 40, 400, 0.5));
        RuntimeException ex3 = assertThrows(RuntimeException.class,
                () -> SILab2.checkCart(items3, "123456781234567812344")); // 17 digits
        assertTrue(ex3.getMessage().contains("Invalid card number!"));

        // test 4:
        List<Item> items4 = List.of(new Item("item", 40, 400, 0));
        RuntimeException ex4 = assertThrows(RuntimeException.class,
                () -> SILab2.checkCart(items4, "12vfeg3456yt6123"));
        assertTrue(ex4.getMessage().contains("Invalid character in card number!"));

        // test 5:
        List<Item> items5 = List.of(new Item("item", 40, 400, 0));
        assertEquals(15970.0, SILab2.checkCart(items5, "1234567812345678"));
    }

    @Test
    public void testMultipleCondition() {
        // if (price > 300 || discount > 0 || quantity > 10) => sum -= 30

        // test 1:
        List<Item> items1 = List.of(new Item("item", 2, 500, 0));
        assertEquals(970.0, SILab2.checkCart(items1, "1234567812345678"));

        // test 2:
        List<Item> items2 = List.of(new Item("item", 2, 200, 0.5));
        assertEquals(170.0, SILab2.checkCart(items2, "1234567812345678"));

        // test 3:
        List<Item> items3 = List.of(new Item("item", 15, 200, 0));
        assertEquals(2970.0, SILab2.checkCart(items3, "1234567812345678"));

        // test 4:
        List<Item> items4 = List.of(new Item("item", 2, 200, 0));
        assertEquals(400.0, SILab2.checkCart(items4, "1234567812345678"));
    }
}
