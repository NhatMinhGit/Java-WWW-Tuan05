package vn.edu.iuh.fit.backend.models.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobSkillForm {
    private Long skillId;
    private Byte skillLevel;
    private String moreInfos;
}