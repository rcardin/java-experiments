package in.rcard.values;

import java.util.Objects;

public value class BarCode {
  private long code;

  private BarCode(long code) {
    this.code = code;
  }

  public static BarCode of(long code) {
    return new BarCode(code);
  }
}
