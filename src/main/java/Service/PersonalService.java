package Service;

import Dto.PersonalDto;
import Repository.PersonalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import Class.Personal;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PersonalService {

    private final PersonalRepository personalRepository;

    @Transactional
    public Long update(Long mem_num, PersonalDto personalDto) {
        Personal personal = personalRepository.findById(mem_num).orElseThrow(
                () -> new IllegalArgumentException("해당 멤버 번호가 존재하지 않습니다.")
        );
        personal.update(personalDto);
        return personal.getMem_num();
    }
}
