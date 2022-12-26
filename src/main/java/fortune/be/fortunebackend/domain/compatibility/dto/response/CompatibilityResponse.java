package fortune.be.fortunebackend.domain.compatibility.dto.response;

import fortune.be.fortunebackend.domain.compatibility.entity.Compatibility;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class CompatibilityResponse {
    private final String compatibility;
    private final String name1;
    private final String name2;
    private final String randomValue;

    public CompatibilityResponse(Compatibility compatibility){
        this.compatibility = compatibility.getCompatibility();
        this.name1 = compatibility.getName1();
        this.name2 = compatibility.getName2();
        this.randomValue = compatibility.getRandomValue();
    }

}
