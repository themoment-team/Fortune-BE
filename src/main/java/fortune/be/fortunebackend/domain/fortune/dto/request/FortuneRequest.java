package fortune.be.fortunebackend.domain.fortune.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FortuneRequest {
    private String fortune;
    private String randomValue;
}
