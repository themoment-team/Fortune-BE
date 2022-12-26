package fortune.be.fortunebackend.domain.fortune.service.impl;

import fortune.be.fortunebackend.domain.fortune.repository.FortuneDataRepository;
import fortune.be.fortunebackend.domain.fortune.entity.FortuneData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FortuneDataServiceImpl {
    private final FortuneDataRepository makeFortuneRepository;

    public List<FortuneData> randomFortune(){
        return makeFortuneRepository.findAll();
    }
}
