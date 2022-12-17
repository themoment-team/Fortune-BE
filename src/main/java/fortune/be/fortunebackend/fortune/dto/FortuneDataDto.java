package fortune.be.fortunebackend.fortune.dto;

import fortune.be.fortunebackend.fortune.entity.FortuneData;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FortuneDataDto {
    private long Id;
    private String fortuneData;

    public FortuneData makeFortuneEntity(){
        return FortuneData.builder()
                .id(this.Id)
                .fortuneData(this.fortuneData)
                .build();
    }
}
