package fortune.be.fortunebackend.fortune.entity;

import lombok.*;

import javax.persistence.*;

@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Setter
@Getter
public class FortuneData {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String fortuneData;
}