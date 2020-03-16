package szakdolgozat.rate.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import szakdolgozat.rate.model.Rate;

public interface RateRepository extends JpaRepository<Rate, Long> {

    Optional<Rate> findById(Long id);

    void deleteById(Long id);

    List<Rate> findAllByOrderid(Long id);

}