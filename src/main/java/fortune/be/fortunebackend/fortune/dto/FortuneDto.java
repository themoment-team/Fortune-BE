package fortune.be.fortunebackend.fortune.dto;

import fortune.be.fortunebackend.fortune.entity.Fortune;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FortuneDto {
    private long fortuneId;
    private String fortune;
    private String randomValue;

    public Fortune fortuneEntity(){
        return Fortune.builder()
                .fortuneId(this.fortuneId)
                .fortune(this.fortune)
                .randomValue(this.randomValue)
                .build();
    }

}