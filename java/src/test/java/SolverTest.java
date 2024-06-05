import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolverTest {
  @Test
  @DisplayName("Custom test name")
  void testFails() {
    assertEquals(0, new Solver().calculate());
  }
}
