package com.cydeo.model.request;

import com.cydeo.enumtype.AttackType;
import lombok.Data;

@Data
public class CreateHitRequest {
    private AttackType attackType;
    private Long gameId;
}
