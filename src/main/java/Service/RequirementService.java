package Service;

import Dto.RequirementDto;
import Repository.RequirementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import Class.Requirement;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class RequirementService {

    private final RequirementRepository requirementRepository;

    @Transactional
    public Long update(Long requireNum, RequirementDto requirementDto) {
        Requirement requirement = requirementRepository.findById(requireNum).orElseThrow(
                () -> new IllegalArgumentException("해당 삭제 요청 번호가 존재하지 않습니다.")
        );
        requirement.update(requirementDto);
        return requirement.getMemNum();
    }
}
