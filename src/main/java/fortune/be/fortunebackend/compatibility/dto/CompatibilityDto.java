package fortune.be.fortunebackend.compatibility.dto;

import fortune.be.fortunebackend.compatibility.entity.Compatibility;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CompatibilityDto {
    private long compatibilityId;
    private String randomValue;
    private String name1;
    private String name2;
    private String compatibility;

    public Compatibility CompatibilityEntity(){
        return Compatibility.builder()
                .compatibilityId(this.compatibilityId)
                .randomValue(this.randomValue)
                .name1(this.name1)
                .name2(this.name2)
                .compatibility(this.compatibility)
                .build();
    }
}
