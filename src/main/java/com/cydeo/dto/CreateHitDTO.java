package com.cydeo.dto;

import com.cydeo.enumtype.AttackType;
import lombok.Data;

@Data
public class CreateHitDTO {
    private AttackType attackType;
    private Long gameId;
}
