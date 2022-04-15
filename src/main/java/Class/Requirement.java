package Class;

import Dto.RequirementDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class Requirement {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long requireNum;

    @Column(nullable = false)
    private Long memNum;

    @Column(nullable = false)
    private Long cafeNum;

    @Column(nullable = false)
    private LocalDateTime requireTime;

    @Column(nullable = false)
    private String requireReason;

    public Requirement(RequirementDto requirementDto){
        this.memNum = requirementDto.getMemNum();
        this.cafeNum = requirementDto.getCafeNum();
        this.requireTime = requirementDto.getRequireTime();
        this.requireReason = requirementDto.getRequireReason();
    }

    public void update(RequirementDto requirementDto){
        this.memNum = requirementDto.getMemNum();
        this.cafeNum = requirementDto.getCafeNum();
        this.requireTime = requirementDto.getRequireTime();
        this.requireReason = requirementDto.getRequireReason();
    }
}
