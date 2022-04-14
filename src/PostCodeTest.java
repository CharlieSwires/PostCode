import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PostCodeTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void test() {
        Assertions.assertTrue(PostCode.valid("M21 8HR"));
        Assertions.assertTrue(PostCode.valid("HD3 6FD"));
        Assertions.assertTrue(PostCode.valid("BD23 2QR"));
        Assertions.assertTrue(PostCode.valid("B2 2GT"));

        Assertions.assertFalse(PostCode.valid("B124 5BF"));
        Assertions.assertFalse(PostCode.valid("LS21 21WS"));
        Assertions.assertFalse(PostCode.valid("265 7RJ"));
        Assertions.assertFalse(PostCode.valid("L23 45GF"));
    }

}
