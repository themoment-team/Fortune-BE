package fortune.be.fortunebackend.fortune.service;

import fortune.be.fortunebackend.fortune.dto.FortuneDto;
import fortune.be.fortunebackend.fortune.entity.Fortune;
import fortune.be.fortunebackend.fortune.repository.FortuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FortuneService {

    @Autowired
    private final FortuneRepository fortuneRepository;

    public FortuneService(FortuneRepository fortuneRepository) {
        this.fortuneRepository = fortuneRepository;
    }

    public Fortune saveFortune (FortuneDto reqFortune){
        Fortune fortune = reqFortune.fortuneEntity();
        return fortuneRepository.save(fortune);
    }

    public Fortune findInfo(FortuneDto fortune){
        Fortune info = fortuneRepository.findByRandomValue(fortune.getRandomValue()).orElseThrow(()->{
            return new IllegalArgumentException("정보 찾기 실패");
        });

        return info;
    }

}
