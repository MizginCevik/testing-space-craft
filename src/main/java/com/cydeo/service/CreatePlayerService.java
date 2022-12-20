package com.cydeo.service;

import com.cydeo.dto.CreateGameDTO;
import com.cydeo.entity.Player;

public interface CreatePlayerService {
    Player createPlayer(CreateGameDTO createGameDTO);
}
