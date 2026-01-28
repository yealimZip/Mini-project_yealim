-> 설계 

package com.example.service.build.skill;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class UserScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;      
    private Long skillTagId; 
    private Integer totalScore; 

    public UserScore(Long userId, Long skillTagId, Integer score) {
        this.userId = userId;
        this.skillTagId = skillTagId;
        this.totalScore = score;
    }

    public void addScore(Integer point) {
        this.totalScore += point;
    }
}

-> 구현 

@Entity
@Getter
@NoArgsConstructor
publicclassUserScore {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private Long userId;
private Long skillTagId;
private Integer totalScore;

publicUserScore(Long userId, Long skillTagId, Integer score) {
this.userId = userId;
this.skillTagId = skillTagId;
this.totalScore = score;
    }

publicvoidaddScore(Integer point) {
this.totalScore += point;
    }
}
