-> 설계 

package com.example.service.build.skill;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class SkillTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tagName; 
    private String description; 

    public SkillTag(String tagName, String description) {
        this.tagName = tagName;
        this.description = description;
    }
}


-> 구현 

@Entity
@Getter
@NoArgsConstructor
publicclassSkillTag {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String tagName;
private String description;

publicSkillTag(String tagName, String description) {
this.tagName = tagName;
this.description = description;
    }
}
