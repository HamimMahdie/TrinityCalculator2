import edu.trinity.TrinityCalculator2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrinityCalculator2Test {

    @Test
    void sumIsEven() {
        TrinityCalculator2 calc = new TrinityCalculator2();
        calc.sumIsEven(5,2);
    }

    @Test
    void productIsEven() {
        TrinityCalculator2 calc2 = new TrinityCalculator2();
        calc2.productIsEven(5,2);
    }
}