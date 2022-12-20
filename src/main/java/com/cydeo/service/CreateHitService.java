package com.cydeo.service;

import com.cydeo.dto.CreateHitDTO;
import com.cydeo.entity.Game;

public interface CreateHitService {
    Game createHit(CreateHitDTO createHitDTO);
}
