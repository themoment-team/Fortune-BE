package fortune.be.fortunebackend.domain.fortune.dto.response;

import fortune.be.fortunebackend.domain.fortune.entity.Fortune;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class FortuneResponse {
    private final String fortune;
    private final String randomValue;

    public FortuneResponse(Fortune fortune){
        this.fortune = fortune.getFortune();
        this.randomValue = fortune.getRandomValue();
    }

}