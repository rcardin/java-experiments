package in.rcard.values;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DescriptionTest {

  @Test
  @DisplayName("Two Description instances are not equal using the '==' operator")
  void descriptionsAreNotEqualUsingTheEqualityOperator() {

    var aDescription = "A description";
    var description1 = Description.of(aDescription);

    var anotherDescription = new String("A description");
    var description2 = Description.of(anotherDescription);

    // Since the Description class is a value class and its field is a reference type,
    // then the two instances are not equal using the '==' operator
    assertFalse(description1 == description2);
  }

  @Test
  @DisplayName(
      "Two Description instances are equal using the 'equals' method")
  void descriptionsAreNotEqualsUsingTheEqualsMethod() {

    var aDescription = "A description";
    var description1 = Description.of(aDescription);

    var anotherDescription = new String("A description");
    var description2 = Description.of(anotherDescription);

    // Since the Description class is a value class and its field is a identity type,
    // then the two instances are not equal using the 'equals' method. This method simply
    // calls the '==' operator. If we want to make the assertion true, we have to override
    // the equals method
    assertFalse(description1.equals(description2));
  }
}
