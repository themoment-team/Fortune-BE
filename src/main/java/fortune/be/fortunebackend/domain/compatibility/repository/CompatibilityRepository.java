package fortune.be.fortunebackend.domain.compatibility.repository;

import fortune.be.fortunebackend.domain.compatibility.dto.response.CompatibilityResponse;
import fortune.be.fortunebackend.domain.compatibility.entity.Compatibility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompatibilityRepository extends JpaRepository<Compatibility,Long> {
    CompatibilityResponse findByRandomValue(String randomValue);
}
