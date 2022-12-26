package fortune.be.fortunebackend.domain.fortune.repository;


import fortune.be.fortunebackend.domain.fortune.dto.response.FortuneResponse;
import fortune.be.fortunebackend.domain.fortune.entity.Fortune;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FortuneRepository extends JpaRepository <Fortune, Long>{
    FortuneResponse findByRandomValue(String randomValue);
}
