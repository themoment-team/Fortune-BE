package fortune.be.fortunebackend.domain.compatibility.dto.request;

import lombok.*;

@Getter
@AllArgsConstructor
public class CompatibilityRequest {
    private String randomValue;
    private String name1;
    private String name2;
    private String compatibility;
}
