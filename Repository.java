-> 설계 

package com.example.service.build.skill;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SkillRepository extends JpaRepository<UserScore, Long> {
    Optional<UserScore> findByUserIdAndSkillTagId(Long userId, Long skillTagId);
}

-> 구현 

publicinterfaceSkillRepositoryextendsJpaRepository<UserScore, Long> {

    Optional<UserScore>findByUserIdAndSkillTagId(Long userId, Long skillTagId);
}
