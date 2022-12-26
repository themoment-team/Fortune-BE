package fortune.be.fortunebackend.domain.fortune.service.impl;

import fortune.be.fortunebackend.domain.fortune.dto.request.FortuneRequest;
import fortune.be.fortunebackend.domain.fortune.dto.response.FortuneResponse;
import fortune.be.fortunebackend.domain.fortune.repository.FortuneRepository;
import fortune.be.fortunebackend.domain.fortune.entity.Fortune;
import fortune.be.fortunebackend.domain.fortune.service.FortuneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FortuneServiceImpl implements FortuneService {

    private final FortuneRepository fortuneRepository;

    @Override
    public void saveFortune(FortuneRequest fortuneRequest) {
        Fortune fortune = Fortune.builder()
                .fortune(fortuneRequest.getFortune())
                .randomValue(fortuneRequest.getRandomValue())
                .build();
        fortuneRepository.save(fortune);
    }

    @Override
    public FortuneResponse findInfo(String randomValue) {
        FortuneResponse fortuneResponse = fortuneRepository.findByRandomValue(randomValue);
        return FortuneResponse.builder()
                .fortune(fortuneResponse.getFortune())
                .randomValue(fortuneResponse.getRandomValue())
                .build();
    }

}
