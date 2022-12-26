package fortune.be.fortunebackend.domain.fortune.entity;

import lombok.*;

import javax.persistence.*;

@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Fortune {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long fortuneId;
    private String fortune;
    private String randomValue;
}
