package in.rcard.values;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
  Optional<Product> findByCode(String code);

  List<Product> findByDescription(String description);
}
