package fortune.be.fortunebackend.compatibility.repository;

import fortune.be.fortunebackend.compatibility.entity.Compatibility;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompatibilityRepository extends JpaRepository<Compatibility,Long> {
    Optional<Compatibility> findByRandomValue(String randomValue);
}
