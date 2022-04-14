package Service;

import Dto.ScoreDto;
import Repository.ScoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import Class.Score;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class ScoreService {

    private final ScoreRepository scoreRepository;

    @Transactional
    public Long update(Long scoreNum, ScoreDto scoreDto) {
        Score score = scoreRepository.findById(scoreNum).orElseThrow(
                () -> new IllegalArgumentException("해당 점수 번호가 존재하지 않습니다.")
        );
        score.update(scoreDto);
        return score.getScoreNum();
    }
}
