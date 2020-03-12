package szakdolgozat.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import szakdolgozat.security.model.Order;

public interface OrderRepository extends JpaRepository<Order, String> {

    Optional<Order> findById(Long id);

    void deleteById(Long id);

}