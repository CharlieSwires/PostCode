import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PostCodeTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void test() {
        Assert.assertTrue(PostCode.valid("M21 8HR"));
        Assert.assertTrue(PostCode.valid("HD3 6FD"));
        Assert.assertTrue(PostCode.valid("BD23 2QR"));
        Assert.assertTrue(PostCode.valid("B2 2GT"));

        Assert.assertTrue(!PostCode.valid("B124 5BF"));
        Assert.assertTrue(!PostCode.valid("LS21 21WS"));
        Assert.assertTrue(!PostCode.valid("265 7RJ"));
        Assert.assertTrue(!PostCode.valid("L23 45GF"));
    }

}
