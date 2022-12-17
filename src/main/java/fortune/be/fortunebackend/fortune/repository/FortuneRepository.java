package fortune.be.fortunebackend.fortune.repository;


import fortune.be.fortunebackend.compatibility.entity.Compatibility;
import fortune.be.fortunebackend.fortune.entity.Fortune;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FortuneRepository extends JpaRepository <Fortune, Long>{
    Optional <Fortune> findByRandomValue(String randomValue);
}
