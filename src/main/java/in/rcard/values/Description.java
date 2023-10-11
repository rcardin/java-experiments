package in.rcard.values;

import java.util.Objects;

public value class Description {
  private String description;

  private Description(String description) {
    this.description = description;
  }

  public static Description of(String description) {
    return new Description(description);
  }
}
