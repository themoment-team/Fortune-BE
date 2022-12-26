package fortune.be.fortunebackend.domain.compatibility.entity;

import lombok.*;

import javax.persistence.*;

@Table
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Compatibility {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long compatibilityId;
    private String randomValue;
    private String name1;
    private String name2;
    private String compatibility;
}
