import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PostCodeTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void test1() {
        Assertions.assertTrue(PostCode.valid("M21 8HR"));
    }
    @Test
    void test2() {
        Assertions.assertTrue(PostCode.valid("HD3 6FD"));
    }
    @Test
    void test3() {
        Assertions.assertTrue(PostCode.valid("BD23 2QR"));
    }
    @Test
    void test4() {
        Assertions.assertTrue(PostCode.valid("B2 2GT"));
    }
    @Test
    void test5() {
        Assertions.assertFalse(PostCode.valid("B124 5BF"));
    }
    @Test
    void test6() {
        Assertions.assertFalse(PostCode.valid("LS21 21WS"));
    }
    @Test
    void test7() {
        Assertions.assertFalse(PostCode.valid("265 7RJ"));
    }
    @Test
    void test8() {
        Assertions.assertFalse(PostCode.valid("L23 45GF"));
    }

}
