-> 설계 

package com.example.service.build.skill;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SkillService {
    private final SkillRepository skillRepository;


    @Transactional
    public void updateScore(Long userId, Long skillTagId, Integer point) {
        UserScore userScore = skillRepository.findByUserIdAndSkillTagId(userId, skillTagId)
                .orElse(new UserScore(userId, skillTagId, 0));
        
        userScore.addScore(point);
        skillRepository.save(userScore);
    }
}

-> 구현 

@Service
@RequiredArgsConstructor
publicclassSkillService {

privatefinal SkillRepository skillRepository;

@Transactional
publicvoidupdateScore(Long userId, Long skillTagId, Integer point) {

UserScoreuserScore= skillRepository
            .findByUserIdAndSkillTagId(userId, skillTagId)
            .orElse(newUserScore(userId, skillTagId,0));

        userScore.addScore(point);
        skillRepository.save(userScore);
    }
}
