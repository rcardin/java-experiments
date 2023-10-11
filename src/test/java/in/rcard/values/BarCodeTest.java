package in.rcard.values;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BarCodeTest {

  @Test
  @DisplayName("Two BarCode instances are equal using the '==' operator if their code is the same")
  void barCodesAreEqualUsingTheEqualityOperator() {
    var barCode1 = BarCode.of(1234567890L);
    var barCode2 = BarCode.of(1234567890L);

    // Since the BarCode class is a value class and its field is a primitive type,
    // then the two instances are equal using the '==' operator
    assertTrue(barCode1 == barCode2);
  }

  @Test
  @DisplayName("Two BarCode instances are equal using the 'equals' method if their code is the same")
  void barCodeAreEqualsUsingTheEqualsMethod() {
    var barCode1 = BarCode.of(1234567890L);
    var barCode2 = BarCode.of(1234567890L);

    // Since the BarCode class is a value class and its field is a primitive type,
    // then the two instances are equal using the 'equals' method. This method simply
    // calls the '==' operator
    assertTrue(barCode1.equals(barCode2));
  }
}
