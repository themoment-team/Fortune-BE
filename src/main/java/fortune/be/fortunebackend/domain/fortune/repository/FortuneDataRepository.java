package fortune.be.fortunebackend.domain.fortune.repository;

import fortune.be.fortunebackend.domain.fortune.entity.FortuneData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FortuneDataRepository extends JpaRepository<FortuneData, Long> {
    @Query(value = "SELECT * FROM fortunedb.fortune_data order by RAND() limit 1",nativeQuery = true)
    List<FortuneData> findAll();
}
