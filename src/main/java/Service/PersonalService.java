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
    public Long update(Long memNum, PersonalDto personalDto) {
        Personal personal = personalRepository.findById(memNum).orElseThrow(
                () -> new IllegalArgumentException("해당 멤버 번호가 존재하지 않습니다.")
        );
        personal.update(personalDto);
        return personal.getMemNum();
    }
}
