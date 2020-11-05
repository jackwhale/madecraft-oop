package exercises;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SmurfTest {
    @Test
    public void testSmurfCreation() {
        Smurf papa = Smurf.createSmurf("papa");
        assertNotNull(papa);
        Smurf mama = Smurf.createSmurf("mama");
        assertNotNull(mama);
        Smurf papa1 = Smurf.createSmurf("papa");
        Assertions.assertNull(papa1);
    }
}
