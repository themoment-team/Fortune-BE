package fortune.be.fortunebackend.domain.fortune.service;

import fortune.be.fortunebackend.domain.fortune.dto.request.FortuneRequest;
import fortune.be.fortunebackend.domain.fortune.dto.response.FortuneResponse;

public interface FortuneService {
    void saveFortune(FortuneRequest fortuneRequest);

    FortuneResponse findInfo(String randomValue);
}
